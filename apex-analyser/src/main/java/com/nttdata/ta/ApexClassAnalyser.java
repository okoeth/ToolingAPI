package com.nttdata.ta;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import com.nttdata.sf.tooling.ApexClass;
import com.nttdata.sf.tooling.ApexClassMember;
import com.nttdata.sf.tooling.ApexTrigger;
import com.nttdata.sf.tooling.ApexTriggerMember;
import com.nttdata.sf.tooling.ContainerAsyncRequest;
import com.nttdata.sf.tooling.ExternalMethod;
import com.nttdata.sf.tooling.ExternalReference;
import com.nttdata.sf.tooling.MetadataContainer;
import com.nttdata.sf.tooling.Method;
import com.nttdata.sf.tooling.ObjectFactory;
import com.nttdata.sf.tooling.Position;
import com.nttdata.sf.tooling.SObject;
import com.nttdata.sf.tooling.SaveResult;
import com.nttdata.sf.tooling.SymbolTable;

public class ApexClassAnalyser {
	static ObjectFactory objectFactory = new ObjectFactory();
	static SortedSet<String> arcs = null;
	static SortedSet<String> treeArcs = null;
	static String metadataContainerId = "1dcN0000000ClRDIA0";
	static LinkedList<String> newDependencies = null;
	static LinkedList<String> allDependencies = null;
	
	private static List<SaveResult> createObject (SObject sobject) {
		List<SObject> list = new ArrayList<SObject> ();
		list.add(sobject);		
		return ToolingDriver.getPort().create(list);		
	}

	// Once created: 1dcN0000000ClRDIA0
	public static void createMetadataContainer () {
		MetadataContainer container = new MetadataContainer();
		container.setName(objectFactory.createMetadataContainerName("MyContainer"));
		
		List<SaveResult> saveResult = createObject(container);
		System.out.println(saveResult.get(0).getId());
	}
	
	public static String loadApexClass(String className) {
		System.out.println("INFO: Load Apex Class "+className);
		ApexClass apexClass =
				ToolingDriver.getPort().query("select Id, Name, FullName, Body from ApexClass where NamespacePrefix = null and Name = '"+className+"'")
			        .getRecords().toArray(new ApexClass[0]) [0];    		
		ApexClassMember apexClassMember = new ApexClassMember();
		apexClassMember.setBody(
				objectFactory.createApexClassMemberBody(apexClass.getBody().getValue()));
		apexClassMember.setContentEntityId(
				objectFactory.createApexClassMemberContentEntityId(apexClass.getId()));
		apexClassMember.setMetadataContainerId(
				objectFactory.createApexClassMemberMetadataContainerId("1dcN0000000ClRDIA0"));
		
		List<SaveResult> saveResult = createObject(apexClassMember);
		return saveResult.get(0).getId();
	}

	public static String loadApexTrigger(String triggerName) {
		System.out.println("INFO: Load Apex Trigger "+triggerName);
		ApexTrigger apexTrigger =
				ToolingDriver.getPort().query("select Id, Name, Body from ApexTrigger where NamespacePrefix = null and Name = '"+triggerName+"'")
			        .getRecords().toArray(new ApexTrigger[0]) [0];    		
		ApexTriggerMember apexTriggerMember = new ApexTriggerMember();
		apexTriggerMember.setBody(
				objectFactory.createApexTriggerMemberBody(apexTrigger.getBody().getValue()));
		apexTriggerMember.setContentEntityId(
				objectFactory.createApexTriggerMemberContentEntityId(apexTrigger.getId()));
		apexTriggerMember.setMetadataContainerId(
				objectFactory.createApexTriggerMemberMetadataContainerId("1dcN0000000ClRDIA0"));
		
		List<SaveResult> saveResult = createObject(apexTriggerMember);
		return saveResult.get(0).getId();
	}
	
	// Use: 1drN0000000F7aVIAS
	public static void checkMetadataContainer () throws Exception {
		ContainerAsyncRequest result =
				ToolingDriver.getPort().query("SELECT Id, State, CompilerErrors, ErrorMsg FROM ContainerAsyncRequest where id = '1drN0000000F7aVIAS'")
        				.getRecords().toArray(new ContainerAsyncRequest[0]) [0];    		
		
		String state = result.getState().getValue();
		System.out.println(state);
	}	
	
	// Use: 1dcN0000000ClRDIA0
	public static void compileMetadataContainer () throws Exception {		
		System.out.println("INFO: Compile Metadata Container");
		ContainerAsyncRequest request = new ContainerAsyncRequest();		
        request.setIsCheckOnly(
        		objectFactory.createContainerAsyncRequestIsCheckOnly(false));
        request.setMetadataContainerId(
				objectFactory.createApexClassMemberMetadataContainerId("1dcN0000000ClRDIA0"));
        
		List<SaveResult> saveResult = createObject(request);
		String requestId = saveResult.get(0).getId();
		System.out.println("INFO: New ContainerAsyncRequestId:"+requestId);
		
		while (true) {
			ContainerAsyncRequest result =
					ToolingDriver.getPort().query("SELECT Id, State, CompilerErrors, ErrorMsg FROM ContainerAsyncRequest where id = '" + requestId + "'")
	        				.getRecords().toArray(new ContainerAsyncRequest[0]) [0];    		
			
			String state = result.getState().getValue();
			System.out.println("INFO: "+state);
			
			if ("Queued".equals(state)) {
				Thread.sleep(1000);
				continue;
			} else {
				break;				
			}			
		}
	}
	
	static class MethodPosition implements Comparable<ApexClassAnalyser.MethodPosition>{
		private int line;
		private String fullName;
		private boolean isDefinition;
		public int getLine() { return line; }
		public String getFullName() { return fullName; }
		
		private MethodPosition (int line, String fullName, boolean isDefinition) {
			this.line = line;
			this.fullName = fullName;
			this.isDefinition = isDefinition;
		}

		@Override
		public int compareTo(ApexClassAnalyser.MethodPosition otherPosition) {
		    if (line == otherPosition.getLine()) {
		      return 0;
		    }
		    if (line < otherPosition.getLine()) {
		      return -1;
		    }
		    
		    return 1;
		}		
	}
	
	public static String apexClassMemberIdFromName(String name) throws Exception {
		System.out.println("INFO: Apex Class Member Id from Name "+name);
		ApexClass[] apexClasses =
				ToolingDriver.getPort().query("select Id, Name from ApexClass where Name = '"+name+"'")
			        .getRecords().toArray(new ApexClass[0]);    		
		
		if (apexClasses.length != 1) {
			throw new Exception("ApexClass name could not be resolved: "+name);
		}
		
		ApexClassMember[] apexClassMembers =
				ToolingDriver.getPort().query("select Id, ContentEntityId, MetadataContainerId from ApexClassMember where ContentEntityId = '"+apexClasses[0].getId()+"'")
			        .getRecords().toArray(new ApexClassMember[0]);
		
		if (apexClassMembers.length == 0) {
			return null;
		}
		
		return apexClassMembers[0].getId();
	}

	public static String apexTriggerMemberIdFromName(String name) throws Exception {
		System.out.println("INFO: Apex Trigger Member Id from Name"+name);
		ApexTrigger[] apexTriggers =
				ToolingDriver.getPort().query("select Id, Name from ApexTrigger where Name = '"+name+"'")
			        .getRecords().toArray(new ApexTrigger[0]);    		
		
		if (apexTriggers.length != 1) {
			throw new Exception("ApexTrigger name could not be resolved: "+name);
		}
		
		ApexTriggerMember[] apexTriggerMembers =
				ToolingDriver.getPort().query("select Id, ContentEntityId, MetadataContainerId from ApexTriggerMember where ContentEntityId = '"+apexTriggers[0].getId()+"'")
			        .getRecords().toArray(new ApexTriggerMember[0]);
		
		if (apexTriggerMembers.length == 0) {
			return null;
		}
		
		return apexTriggerMembers[0].getId();
	}
	
	public static void analyseApexClassMember(String id) {
		System.out.println("INFO: Analyse Apex Class Member "+id);
		ApexClassMember apexClassMember =
				ToolingDriver.getPort().query("select Id, SymbolTable from ApexClassMember where Id = '"+id+"'")
			        .getRecords().toArray(new ApexClassMember[0])[0];    		
					
		SymbolTable symbolTable = apexClassMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}
	
	public static void analyseApexTrigger(String triggerName) throws Exception {
		System.out.println("INFO: Analyse Apex Trigger "+triggerName);
		initArcs();
		initDependencies();
		String apexTriggerMemberId = apexTriggerMemberIdFromName(triggerName);
		if (apexTriggerMemberId == null) {
			loadApexTrigger(triggerName);
			compileMetadataContainer();
			apexTriggerMemberId = apexTriggerMemberIdFromName(triggerName);
		}
		analyseApexTriggerMember(apexTriggerMemberId);
		while(!newDependencies.isEmpty()) {
			String apexClassName = newDependencies.remove();
			try {
				String apexClassMemberId = apexClassMemberIdFromName(apexClassName);
				if (apexClassMemberId == null) {
					loadApexClass(apexClassName);
					compileMetadataContainer();
					apexClassMemberId = apexClassMemberIdFromName(apexClassName);
				}
				analyseApexClassMember(apexClassMemberId);
			} catch (Exception e) {
				System.out.println("WARNING: Skipping Apex Class "+apexClassName);
			}
		}
		printDependencies();
		//printArcs("/Users/oliverkoeth/temp/"+triggerName+".gv");
		printArcsAsTree("/Users/oliverkoeth/temp/"+triggerName+".gv", triggerName+"_"+triggerName);
	}
	
	public static void analyseApexTriggerMember(String id) {
		System.out.println("INFO: Analyse Apex Trigger Member "+id);
		ApexTriggerMember apexTriggerMember =
				ToolingDriver.getPort().query("select Id, SymbolTable from ApexTriggerMember where Id = '"+id+"'")
			        .getRecords().toArray(new ApexTriggerMember[0])[0];    		
					
		SymbolTable symbolTable = apexTriggerMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}
	
	private static void analyseApexMember(SymbolTable symbolTable) {
		System.out.println("INFO: Analyse Apex Member "+symbolTable.getName());
		List<MethodPosition> items = new ArrayList<MethodPosition>();
		items.add(
				new ApexClassAnalyser.MethodPosition(
						0, 
						symbolTable.getName()+"_"+symbolTable.getName(),
						true));
		
		// External References			
		for (ExternalReference externalReference : symbolTable.getExternalReferences()) {
			if (! allDependencies.contains(externalReference.getName())) {
				newDependencies.add(externalReference.getName());
				allDependencies.add(externalReference.getName());
			}
			for (ExternalMethod externalMethod : externalReference.getMethods()) {
				for (Position position : externalMethod.getReferences()) {
					items.add(
							new ApexClassAnalyser.MethodPosition(
									position.getLine(), 
									externalReference.getName()+"_"+externalMethod.getName(),
									false));
				}
			}
		}
		
		// Methods
		for (Method method : symbolTable.getMethods()) {
			items.add(
					new ApexClassAnalyser.MethodPosition(
							method.getLocation().getLine(), 
							symbolTable.getName()+"_"+method.getName(),
							true));
			for (Position position : method.getReferences()) {
				items.add(
						new ApexClassAnalyser.MethodPosition(
								position.getLine(), 
								symbolTable.getName()+"_"+method.getName(),
								false));
			}
		}
		
		// Process results
		addArcs(items);
	}
	
	private static void addArcs(List<MethodPosition> items) {
		// Blacklist
		SortedSet<String> blackset = new TreeSet<String>();
		blackset.add("CMap_");
		
		// Build arcs w/o dups and blacklist
		Collections.sort(items);
		String currentDef = null;
		for (MethodPosition item : items) {
			if (item.isDefinition) {
				currentDef = item.getFullName();
			}
			else {
				boolean skip = false;
				for (String blackItem : blackset) {
					if (item.getFullName().startsWith(blackItem)) {
						skip = true;
						break;
					}					
				}
				if (!skip) {
					arcs.add(currentDef+" -> "+item.getFullName());
				}
			}
		}		
	}
	
	public static void initDependencies() {
		newDependencies = new LinkedList<String>();
		allDependencies = new LinkedList<String>();
	}
	public static void printDependencies() {
		System.out.println("Dependencies {");
		for (String dependency : allDependencies) {
			System.out.println(dependency+";");
		}
		System.out.println("}");
	}
	
	public static void initArcs() {
		arcs = new TreeSet<String>();
	}
	public static void printArcs(String fileName, SortedSet<String> printArcs) throws Exception {
		System.out.println("INFO: Print Arcs to "+fileName);
		
		// Write file in dot language
		Path path = Paths.get(fileName);
	    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
	    	writer.write("digraph G {");
	    	writer.newLine();
			for (String arc : printArcs) {
				writer.write(arc+";");
		    	writer.newLine();
			}
			writer.write("}");
	    	writer.newLine();
	    }		
		
		// Doppelt genäht hält besser
		System.out.println("digraph G {");
		for (String arc : printArcs) {
			System.out.println(arc+";");
		}
		System.out.println("}");
	}
	
	private static void initTreeArcs() {
		treeArcs = new TreeSet<String>();
	}
	private static void buildTreeArcs(String nodeName) {
		System.out.println("INFO: Build Tree Arcs for Node "+nodeName);
		for (String arc : arcs) {
			if (getFromNode(arc).equals(nodeName) && !treeArcs.contains(arc)) {
				System.out.println("INFO: Decending into "+getToNode(arc));
				treeArcs.add(arc);
				buildTreeArcs(getToNode(arc));
			}
		}
	}
	private static String getFromNode(String arc) {
		StringTokenizer stringTokenizer = new StringTokenizer(arc);
		String fromNode = stringTokenizer.nextToken(); 
		System.out.println("INFO: From node "+fromNode);
		return fromNode;
	}
	private static String getToNode(String arc) {
		StringTokenizer stringTokenizer = new StringTokenizer(arc);
		stringTokenizer.nextToken(); // Skip
		stringTokenizer.nextToken(); // Skip
		String toNode = stringTokenizer.nextToken(); 
		System.out.println("INFO: From node "+toNode);
		return toNode;
	}
	public static void printArcsAsTree(String fileName, String nodeName) throws Exception {
		System.out.println("INFO: Print Arcs as Tree to "+fileName);
		initTreeArcs();
		buildTreeArcs(nodeName);
		printArcs(fileName, treeArcs);
		Runtime.getRuntime().exec("/opt/local/bin/dot -Tpdf "+fileName+" -o "+fileName+".pdf");
	}
}