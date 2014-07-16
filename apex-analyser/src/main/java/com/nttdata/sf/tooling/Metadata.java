
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Metadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadata")
@XmlSeeAlso({
    EscalationRules.class,
    Workflow.class,
    ApexClassMetadata.class,
    ValidationRuleMetadata.class,
    ApexTriggerMetadata.class,
    AssignmentRule.class,
    AutoResponseRule.class,
    AssignmentRules.class,
    EscalationRule.class,
    WorkflowAction.class,
    ApexComponentMetadata.class,
    ApexPageMetadata.class,
    WorkflowRuleMetadata.class,
    CustomFieldMetadata.class,
    AutoResponseRules.class
})
public class Metadata {


}
