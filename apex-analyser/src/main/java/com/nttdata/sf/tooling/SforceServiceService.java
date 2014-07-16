
package com.nttdata.sf.tooling;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SforceServiceService", targetNamespace = "urn:tooling.soap.sforce.com", wsdlLocation = "file:/Users/oliverkoeth/Downloads/sf_cn_tooling.wsdl")
public class SforceServiceService
    extends Service
{

    private final static URL SFORCESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SFORCESERVICESERVICE_EXCEPTION;
    private final static QName SFORCESERVICESERVICE_QNAME = new QName("urn:tooling.soap.sforce.com", "SforceServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/oliverkoeth/Downloads/sf_cn_tooling.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SFORCESERVICESERVICE_WSDL_LOCATION = url;
        SFORCESERVICESERVICE_EXCEPTION = e;
    }

    public SforceServiceService() {
        super(__getWsdlLocation(), SFORCESERVICESERVICE_QNAME);
    }

    public SforceServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SFORCESERVICESERVICE_QNAME, features);
    }

    public SforceServiceService(URL wsdlLocation) {
        super(wsdlLocation, SFORCESERVICESERVICE_QNAME);
    }

    public SforceServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SFORCESERVICESERVICE_QNAME, features);
    }

    public SforceServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SforceServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SforceServicePortType
     */
    @WebEndpoint(name = "SforceService")
    public SforceServicePortType getSforceService() {
        return super.getPort(new QName("urn:tooling.soap.sforce.com", "SforceService"), SforceServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SforceServicePortType
     */
    @WebEndpoint(name = "SforceService")
    public SforceServicePortType getSforceService(WebServiceFeature... features) {
        return super.getPort(new QName("urn:tooling.soap.sforce.com", "SforceService"), SforceServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SFORCESERVICESERVICE_EXCEPTION!= null) {
            throw SFORCESERVICESERVICE_EXCEPTION;
        }
        return SFORCESERVICESERVICE_WSDL_LOCATION;
    }

}