
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompileAndTestRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompileAndTestRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deleteClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deleteTriggers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="runTestsRequest" type="{urn:tooling.soap.sforce.com}RunTestsRequest" minOccurs="0"/>
 *         &lt;element name="triggers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompileAndTestRequest", propOrder = {
    "checkOnly",
    "classes",
    "deleteClasses",
    "deleteTriggers",
    "runTestsRequest",
    "triggers"
})
public class CompileAndTestRequest {

    protected boolean checkOnly;
    protected List<String> classes;
    protected List<String> deleteClasses;
    protected List<String> deleteTriggers;
    protected RunTestsRequest runTestsRequest;
    protected List<String> triggers;

    /**
     * Gets the value of the checkOnly property.
     * 
     */
    public boolean isCheckOnly() {
        return checkOnly;
    }

    /**
     * Sets the value of the checkOnly property.
     * 
     */
    public void setCheckOnly(boolean value) {
        this.checkOnly = value;
    }

    /**
     * Gets the value of the classes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClasses() {
        if (classes == null) {
            classes = new ArrayList<String>();
        }
        return this.classes;
    }

    /**
     * Gets the value of the deleteClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleteClasses() {
        if (deleteClasses == null) {
            deleteClasses = new ArrayList<String>();
        }
        return this.deleteClasses;
    }

    /**
     * Gets the value of the deleteTriggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteTriggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleteTriggers() {
        if (deleteTriggers == null) {
            deleteTriggers = new ArrayList<String>();
        }
        return this.deleteTriggers;
    }

    /**
     * Gets the value of the runTestsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsRequest }
     *     
     */
    public RunTestsRequest getRunTestsRequest() {
        return runTestsRequest;
    }

    /**
     * Sets the value of the runTestsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsRequest }
     *     
     */
    public void setRunTestsRequest(RunTestsRequest value) {
        this.runTestsRequest = value;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<String>();
        }
        return this.triggers;
    }

}
