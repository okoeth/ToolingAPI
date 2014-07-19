package com.nttdata.apex_analyser;

import com.nttdata.ta.PartnerDriver;
import com.nttdata.ta.ToolingDriver;

import junit.framework.TestCase;

public class ApexClassAnalyserOnlineTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
    	String sessionId = 
        		PartnerDriver.loginForSessionId(
        				"USER",
        				"PASSWORD_TOKEN"); 
    	System.out.println(sessionId);
        	
    	ToolingDriver.createWSBindingProvider(sessionId);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
    	PartnerDriver.getWSBindingProvider().close();
    	ToolingDriver.getWSBindingProvider().close();
	}

}
