/**
 * 
 */
package com.nttdata.ta;

import com.nttdata.sf.partner.DescribeRelatedContentItem;
import com.nttdata.sf.tooling.DescribeSObjectResult;
import com.nttdata.sf.tooling.Field;

public class Main {
	static ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser ();
	
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");

        try {        	
        	String sessionId = 
        		PartnerDriver.loginForSessionId(args[0], args[1]); 
    		System.out.println(sessionId);
        	
    		ToolingDriver.createWSBindingProvider(sessionId);
    		
            DescribeSObjectResult result = 
            		ToolingDriver.getPort().describeSObject("ApexClass");
            
            for (Field field : result.getFields()) {
            	System.out.println(field.getName());
            }
    		
        }
        finally {
        	PartnerDriver.getWSBindingProvider().close();
        	ToolingDriver.getWSBindingProvider().close();
        }
        
        
	}
	
	public static void analyseCRiSTrigger() throws Exception {
		// Account
		apexClassAnalyser.analyseApexTrigger("AccountAfterInsertOrUpdate");
		apexClassAnalyser.analyseApexTrigger("AccountBeforeInsertUpdate");
		// Account Link
		apexClassAnalyser.analyseApexTrigger("ShareAccountLinksToDealer");
		apexClassAnalyser.analyseApexTrigger("AccountLinkAfter");
		// Retail Task
		apexClassAnalyser.analyseApexTrigger("RetailTaskAfter");
		//Contact
		apexClassAnalyser.analyseApexTrigger("ContactAfterInsertUpdate");
		apexClassAnalyser.analyseApexTrigger("ContactBeforeInsertUpdate");
		// Vehicle Rel (no triggers for vehicle!)
		apexClassAnalyser.analyseApexTrigger("TriggerVehicleRelationship");
		apexClassAnalyser.analyseApexTrigger("VehicleRelationshipAfter");
	}
}
