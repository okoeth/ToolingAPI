
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompileAndTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompileAndTestResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classes" type="{urn:tooling.soap.sforce.com}CompileClassResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deleteClasses" type="{urn:tooling.soap.sforce.com}DeleteApexResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deleteTriggers" type="{urn:tooling.soap.sforce.com}DeleteApexResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="runTestsResult" type="{urn:tooling.soap.sforce.com}RunTestsResult"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="triggers" type="{urn:tooling.soap.sforce.com}CompileTriggerResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompileAndTestResult", propOrder = {
    "classes",
    "deleteClasses",
    "deleteTriggers",
    "runTestsResult",
    "success",
    "triggers"
})
public class CompileAndTestResult {

    protected List<CompileClassResult> classes;
    protected List<DeleteApexResult> deleteClasses;
    protected List<DeleteApexResult> deleteTriggers;
    @XmlElement(required = true)
    protected RunTestsResult runTestsResult;
    protected boolean success;
    protected List<CompileTriggerResult> triggers;

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
     * {@link CompileClassResult }
     * 
     * 
     */
    public List<CompileClassResult> getClasses() {
        if (classes == null) {
            classes = new ArrayList<CompileClassResult>();
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
     * {@link DeleteApexResult }
     * 
     * 
     */
    public List<DeleteApexResult> getDeleteClasses() {
        if (deleteClasses == null) {
            deleteClasses = new ArrayList<DeleteApexResult>();
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
     * {@link DeleteApexResult }
     * 
     * 
     */
    public List<DeleteApexResult> getDeleteTriggers() {
        if (deleteTriggers == null) {
            deleteTriggers = new ArrayList<DeleteApexResult>();
        }
        return this.deleteTriggers;
    }

    /**
     * Gets the value of the runTestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsResult }
     *     
     */
    public RunTestsResult getRunTestsResult() {
        return runTestsResult;
    }

    /**
     * Sets the value of the runTestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsResult }
     *     
     */
    public void setRunTestsResult(RunTestsResult value) {
        this.runTestsResult = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
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
     * {@link CompileTriggerResult }
     * 
     * 
     */
    public List<CompileTriggerResult> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<CompileTriggerResult>();
        }
        return this.triggers;
    }

}
