//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.29 at 10:54:28 PM EST 
//

package org.xml_cml.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for latticeType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="latticeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="primitive"/>
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="aCentred"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "latticeType", namespace = "http://www.xml-cml.org/schema")
@XmlEnum
public enum LatticeType {

	@XmlEnumValue("primitive")
	PRIMITIVE("primitive"), @XmlEnumValue("full")
	FULL("full"),

	/**
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="summary"&gt;lattice with A centering.&lt;/h:div&gt;
	 * </pre>
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="description"&gt;A lattice which uses the translation operator {0, 0.5, 0.5}.
	 *                                 &lt;/h:div&gt;
	 * </pre>
	 * 
	 * 
	 * 
	 */
	@XmlEnumValue("aCentred")
	A_CENTRED("aCentred"),

	/**
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="summary"&gt;A value not in the controlled vocabulary - use dictRef to add further information.
	 *                                 &lt;/h:div&gt;
	 * </pre>
	 * 
	 * 
	 * 
	 */
	@XmlEnumValue("other")
	OTHER("other");
	private final String value;

	LatticeType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static LatticeType fromValue(String v) {
		for (LatticeType c : LatticeType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
