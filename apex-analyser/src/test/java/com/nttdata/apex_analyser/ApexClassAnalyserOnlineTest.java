package com.nttdata.apex_analyser;

import com.nttdata.ta.ApexClassAnalyser;
import com.nttdata.ta.PartnerDriver;
import com.nttdata.ta.ToolingDriver;

import junit.framework.TestCase;

public class ApexClassAnalyserOnlineTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
    	String sessionId = 
        		PartnerDriver.loginForSessionId(
        				"oliver.koeth@nttdata.com.production2.full",
        				"China!2015nCtNS3FysjyUymSzy4Cj5M0c6"); 
    	System.out.println(sessionId);
        	
    	ToolingDriver.createWSBindingProvider(sessionId);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
    	PartnerDriver.getWSBindingProvider().close();
    	ToolingDriver.getWSBindingProvider().close();
	}

	public void testLoadAllApexClasses() {
		ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser();
		apexClassAnalyser.deleteMetadataContainer();
		apexClassAnalyser.loadAllApexClasses();
	}

	public void testCompileAllApexClasses() throws Exception {
		ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser();
		apexClassAnalyser.deleteMetadataContainer();
		apexClassAnalyser.loadAllApexClasses();
		apexClassAnalyser.compileMetadataContainer();
		apexClassAnalyser.compileMetadataContainer();
	}
}
