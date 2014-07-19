/**
 * 
 */
package com.nttdata.ta;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;

import com.nttdata.sf.tooling.CallOptions;
import com.nttdata.sf.tooling.Error;
import com.nttdata.sf.tooling.SObject;
import com.nttdata.sf.tooling.SaveResult;
import com.nttdata.sf.tooling.SessionHeader;
import com.nttdata.sf.tooling.SforceServicePortType;
import com.nttdata.sf.tooling.SforceServiceService;
import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;

/**
 * @author oliverkoeth
 *
 */
public class ToolingDriver {
	// Not thread safe!!!
    private static CallOptions callOptions = null;
    public static CallOptions getCallOptions() {
		if (callOptions != null) {
			return callOptions;
		}
		
		// Initial create
        callOptions = new CallOptions();
        return callOptions;
    }
	
	// Not thread safe!!!
    private static JAXBContext jaxbContext = null;
    public static JAXBContext getJAXBContext() throws Exception {
		if (jaxbContext != null) {
			return jaxbContext;
		}
		
		// Initital create    	
        try {
            // use the package you created your stub classes in
        	jaxbContext = JAXBContext.newInstance("com.nttdata.sf.tooling");
        } catch (JAXBException e) {
            throw new Exception(
                "Could not get the JAXB context for the stub package", e);
        }
        
        return jaxbContext;
    }

	// Not thread safe!!!
	private static WSBindingProvider wsBindingProvider = null;
	public static void createWSBindingProvider(String sessionId) throws Exception {
		String wsdlFileName = "/sf_cn_tooling.wsdl";
        URL url = ToolingDriver.class.getResource(wsdlFileName);
        if (url == null) {
            throw new Exception("Couldn't find sf partner wsdl for path " + wsdlFileName);
        }
        SforceServiceService service = new SforceServiceService(url,
            new QName("urn:tooling.soap.sforce.com", "SforceServiceService"));
        
        SforceServicePortType port = service.getSforceService();        

        wsBindingProvider = (WSBindingProvider) port;
        wsBindingProvider.setOutboundHeaders(
            Headers.create((JAXBRIContext) getJAXBContext(), getCallOptions()));

        Map<String, Object> reqContext = getWSBindingProvider().getRequestContext();
        
        // Set zip for further interaction
        Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
        httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
        httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
        reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

        // Set session id for further interaction
        SessionHeader sessionHeader = new SessionHeader();
        sessionHeader.setSessionId(sessionId);        
        List<Header> headersPartner = new ArrayList<Header>();	        
        headersPartner.add(Headers.create((JAXBRIContext) getJAXBContext(), sessionHeader));
        headersPartner.add(Headers.create((JAXBRIContext) getJAXBContext(), getCallOptions()));
        getWSBindingProvider().setOutboundHeaders(headersPartner);
	}
	
	public static WSBindingProvider getWSBindingProvider () {
		return wsBindingProvider;
	}
	
	public static SforceServicePortType getPort() {
		return (SforceServicePortType) wsBindingProvider;
	}		

	public static List<SaveResult> createObject (SObject sobject) {
		List<SObject> sobjects = new ArrayList<SObject> ();
		sobjects.add(sobject);
		return createObjects(sobjects);
	}
	
	public static List<SaveResult> createObjects (List<SObject> sobjects) {
		List<SaveResult> results = ToolingDriver.getPort().create(sobjects);
		for (SaveResult result : results) {
			for (Error error : result.getErrors()) {
				System.out.println("ERROR: "+error.getMessage());
			}
		}
		return results;
	}

	
}
