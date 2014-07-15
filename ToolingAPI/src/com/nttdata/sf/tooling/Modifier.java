
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Modifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATIC"/>
 *     &lt;enumeration value="TEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Modifier")
@XmlEnum
public enum Modifier {

    STATIC,
    TEST;

    public String value() {
        return name();
    }

    public static Modifier fromValue(String v) {
        return valueOf(v);
    }

}
