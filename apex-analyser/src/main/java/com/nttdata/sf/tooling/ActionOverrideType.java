
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionOverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionOverrideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Scontrol"/>
 *     &lt;enumeration value="Visualforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionOverrideType")
@XmlEnum
public enum ActionOverrideType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Scontrol")
    SCONTROL("Scontrol"),
    @XmlEnumValue("Visualforce")
    VISUALFORCE("Visualforce");
    private final String value;

    ActionOverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionOverrideType fromValue(String v) {
        for (ActionOverrideType c: ActionOverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
