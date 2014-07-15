/**
 * 
 */
package com.nttdata.ta;


/**
 * @author oliverkoeth
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");

        try {        	
        	String sessionId = 
        		PartnerDriver.loginForSessionId(args[0], args[1]); 
    		System.out.println(sessionId);
        	
    		ToolingDriver.createWSBindingProvider(sessionId);
    		
    		// How to to add a new class: 
    		// 1. Comment out analyseApexClassMember calls below
    		// 2. Cmoment in two lines below (choose class or trigger)
    		// 3. Run
    		// 4. Comment out two lines below
    		// 5. Add new analyseApexClassMember with new ApexClassMemberId    		    		
    		//System.out.println("New ApexClassMemberId:"+ApexClassAnalyser.analyseApexClass("UtilRecordType")); 
    		//System.out.println("New ApexTriggerMemberId:"+ApexClassAnalyser.analyseApexTrigger("AccountAfterInsertOrUpdate")); 
    		//ApexClassAnalyser.compileMetadataContainer();
    		
    		ApexClassAnalyser.initArcs();
    		ApexClassAnalyser.analyseApexTriggerMember("401N0000000CfnjIAC"); // AccountAfterInsertOrUpdate
    		ApexClassAnalyser.analyseApexClassMember("400N0000000DFINIA4"); // AccountSharingDataHandler
    		ApexClassAnalyser.analyseApexClassMember("400N0000000DFOzIAO"); // UtilRecordType
    		ApexClassAnalyser.printArcs();
    		
    		//ApexClassAnalyser.analyseApexClassMember("400N0000000DFGbIAO"); // AccountHelper
    		//NOT NEEDED: ApexClassAnalyser.checkMetadataContainer();    		
        }
        finally {
        	PartnerDriver.getWSBindingProvider().close();
        	ToolingDriver.getWSBindingProvider().close();
        }
	}
}
