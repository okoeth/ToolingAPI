
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Picklist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Picklist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controllingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Picklist", propOrder = {
    "controllingField",
    "sorted"
})
public class Picklist {

    protected String controllingField;
    protected boolean sorted;

    /**
     * Gets the value of the controllingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllingField() {
        return controllingField;
    }

    /**
     * Sets the value of the controllingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllingField(String value) {
        this.controllingField = value;
    }

    /**
     * Gets the value of the sorted property.
     * 
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * Sets the value of the sorted property.
     * 
     */
    public void setSorted(boolean value) {
        this.sorted = value;
    }

}
