
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en_US"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="zh_TW"/>
 *     &lt;enumeration value="zh_CN"/>
 *     &lt;enumeration value="pt_BR"/>
 *     &lt;enumeration value="nl_NL"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="es_MX"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="vi"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="iw"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="en_GB"/>
 *     &lt;enumeration value="ar"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="fr_CA"/>
 *     &lt;enumeration value="ka"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="sh"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="en_AU"/>
 *     &lt;enumeration value="en_MY"/>
 *     &lt;enumeration value="en_IN"/>
 *     &lt;enumeration value="en_PH"/>
 *     &lt;enumeration value="en_CA"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="ro_MD"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="bs"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="et"/>
 *     &lt;enumeration value="sq"/>
 *     &lt;enumeration value="sh_ME"/>
 *     &lt;enumeration value="mt"/>
 *     &lt;enumeration value="ga"/>
 *     &lt;enumeration value="eu"/>
 *     &lt;enumeration value="cy"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="pt_PT"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="tl"/>
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="rm"/>
 *     &lt;enumeration value="hy"/>
 *     &lt;enumeration value="hi"/>
 *     &lt;enumeration value="ur"/>
 *     &lt;enumeration value="eo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language")
@XmlEnum
public enum Language {

    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("sv")
    SV("sv"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),
    @XmlEnumValue("pt_BR")
    PT_BR("pt_BR"),
    @XmlEnumValue("nl_NL")
    NL_NL("nl_NL"),
    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("th")
    TH("th"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("es_MX")
    ES_MX("es_MX"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("vi")
    VI("vi"),
    @XmlEnumValue("uk")
    UK("uk"),
    @XmlEnumValue("iw")
    IW("iw"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("en_GB")
    EN_GB("en_GB"),
    @XmlEnumValue("ar")
    AR("ar"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("fr_CA")
    FR_CA("fr_CA"),
    @XmlEnumValue("ka")
    KA("ka"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("sh")
    SH("sh"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("en_AU")
    EN_AU("en_AU"),
    @XmlEnumValue("en_MY")
    EN_MY("en_MY"),
    @XmlEnumValue("en_IN")
    EN_IN("en_IN"),
    @XmlEnumValue("en_PH")
    EN_PH("en_PH"),
    @XmlEnumValue("en_CA")
    EN_CA("en_CA"),
    @XmlEnumValue("sl")
    SL("sl"),
    @XmlEnumValue("ro_MD")
    RO_MD("ro_MD"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("bs")
    BS("bs"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("et")
    ET("et"),
    @XmlEnumValue("sq")
    SQ("sq"),
    @XmlEnumValue("sh_ME")
    SH_ME("sh_ME"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("ga")
    GA("ga"),
    @XmlEnumValue("eu")
    EU("eu"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("pt_PT")
    PT_PT("pt_PT"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("tl")
    TL("tl"),
    @XmlEnumValue("lb")
    LB("lb"),
    @XmlEnumValue("rm")
    RM("rm"),
    @XmlEnumValue("hy")
    HY("hy"),
    @XmlEnumValue("hi")
    HI("hi"),
    @XmlEnumValue("ur")
    UR("ur"),
    @XmlEnumValue("eo")
    EO("eo");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c: Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
