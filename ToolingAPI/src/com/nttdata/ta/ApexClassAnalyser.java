package com.nttdata.ta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
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
	
	public static String analyseApexClass(String className) {
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

	public static String analyseApexTrigger(String triggerName) {
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
		ContainerAsyncRequest request = new ContainerAsyncRequest();		
        request.setIsCheckOnly(
        		objectFactory.createContainerAsyncRequestIsCheckOnly(false));
        request.setMetadataContainerId(
				objectFactory.createApexClassMemberMetadataContainerId("1dcN0000000ClRDIA0"));
        
		List<SaveResult> saveResult = createObject(request);
		String requestId = saveResult.get(0).getId();
		System.out.println("New ContainerAsyncRequestId:"+requestId);
		
		while (true) {
			ContainerAsyncRequest result =
					ToolingDriver.getPort().query("SELECT Id, State, CompilerErrors, ErrorMsg FROM ContainerAsyncRequest where id = '" + requestId + "'")
	        				.getRecords().toArray(new ContainerAsyncRequest[0]) [0];    		
			
			String state = result.getState().getValue();
			System.out.println(state);
			
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

	public static void analyseApexClassMember(String id) {
		ApexClassMember apexClassMember =
				ToolingDriver.getPort().query("select Id, SymbolTable from ApexClassMember where Id = '"+id+"'")
			        .getRecords().toArray(new ApexClassMember[0])[0];    		
					
		SymbolTable symbolTable = apexClassMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}
	
	public static void analyseApexTriggerMember(String id) {
		ApexTriggerMember apexTriggerMember =
				ToolingDriver.getPort().query("select Id, SymbolTable from ApexTriggerMember where Id = '"+id+"'")
			        .getRecords().toArray(new ApexTriggerMember[0])[0];    		
					
		SymbolTable symbolTable = apexTriggerMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}
	
	private static void analyseApexMember(SymbolTable symbolTable) {
		List<MethodPosition> items = new ArrayList<MethodPosition>();
		items.add(
				new ApexClassAnalyser.MethodPosition(
						0, 
						symbolTable.getName()+"_"+symbolTable.getName(),
						true));
		
		// External References			
		for (ExternalReference externalReference : symbolTable.getExternalReferences()) {
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
	
	public static void initArcs() {
		arcs = new TreeSet<String>();
	}
	public static void printArcs() {
		// Print in dot language
		System.out.println("digraph G {");
		for (String arc : arcs) {
			System.out.println(arc+";");
		}
		System.out.println("}");
	}
}