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
    		
    		//ApexClassAnalyser.analyseApexTrigger("AccountAfterInsertOrUpdate");
    		//ApexClassAnalyser.analyseApexTrigger("AccountBeforeInsertUpdate");
    		//ApexClassAnalyser.analyseApexTrigger("ShareAccountLinksToDealer");
    		ApexClassAnalyser.analyseApexTrigger("AccountLinkAfter");
        }
        finally {
        	PartnerDriver.getWSBindingProvider().close();
        	ToolingDriver.getWSBindingProvider().close();
        }
        
        
	}
	
}
