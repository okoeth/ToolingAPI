
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:tooling.soap.sforce.com}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", propOrder = {
    "fieldsToNull",
    "id"
})
@XmlSeeAlso({
    WorkflowRule.class,
    User.class,
    MetadataContainerMember.class,
    TraceFlag.class,
    IDEPerspective.class,
    ApexExecutionOverlayAction.class,
    ApexOrgWideCoverage.class,
    ApexLog.class,
    ApexComponent.class,
    ApexComponentMember.class,
    IDEWorkspace.class,
    WorkflowOutboundMessage.class,
    ContainerAsyncRequest.class,
    CustomField.class,
    WorkflowTask.class,
    UserPreference.class,
    WorkflowAlert.class,
    ApexClassMember.class,
    ApexPageMember.class,
    ValidationRule.class,
    ApexPage.class,
    ApexCodeCoverageAggregate.class,
    ApexTestQueueItem.class,
    ApexTestResult.class,
    AsyncApexJob.class,
    CustomObject.class,
    ApexTrigger.class,
    WorkflowFieldUpdate.class,
    ApexCodeCoverage.class,
    StaticResource.class,
    ApexClass.class,
    ApexExecutionOverlayResult.class,
    MetadataContainer.class,
    Name.class,
    ApexTriggerMember.class
})
public class SObject {

    @XmlElement(nillable = true)
    protected List<String> fieldsToNull;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNull() {
        if (fieldsToNull == null) {
            fieldsToNull = new ArrayList<String>();
        }
        return this.fieldsToNull;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
