//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for RiskMatrixScoreType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RiskMatrixScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProbabilityThresholdLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskMatrixName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskMatrixObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity1Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity2Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity3Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity4Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity5Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity6Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity7Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity8Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Severity9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity9Label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskMatrixScoreType", propOrder =
{
   "createDate",
   "createUser",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "probabilityThresholdLevel",
   "riskMatrixName",
   "riskMatrixObjectId",
   "severity1",
   "severity1Label",
   "severity2",
   "severity2Label",
   "severity3",
   "severity3Label",
   "severity4",
   "severity4Label",
   "severity5",
   "severity5Label",
   "severity6",
   "severity6Label",
   "severity7",
   "severity7Label",
   "severity8",
   "severity8Label",
   "severity9",
   "severity9Label"
}) public class RiskMatrixScoreType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProbabilityThresholdLevel") protected Integer probabilityThresholdLevel;
   @XmlElement(name = "RiskMatrixName") protected String riskMatrixName;
   @XmlElement(name = "RiskMatrixObjectId") protected Integer riskMatrixObjectId;
   @XmlElement(name = "Severity1", nillable = true) protected Integer severity1;
   @XmlElement(name = "Severity1Label") protected String severity1Label;
   @XmlElement(name = "Severity2", nillable = true) protected Integer severity2;
   @XmlElement(name = "Severity2Label") protected String severity2Label;
   @XmlElement(name = "Severity3", nillable = true) protected Integer severity3;
   @XmlElement(name = "Severity3Label") protected String severity3Label;
   @XmlElement(name = "Severity4", nillable = true) protected Integer severity4;
   @XmlElement(name = "Severity4Label") protected String severity4Label;
   @XmlElement(name = "Severity5", nillable = true) protected Integer severity5;
   @XmlElement(name = "Severity5Label") protected String severity5Label;
   @XmlElement(name = "Severity6", nillable = true) protected Integer severity6;
   @XmlElement(name = "Severity6Label") protected String severity6Label;
   @XmlElement(name = "Severity7", nillable = true) protected Integer severity7;
   @XmlElement(name = "Severity7Label") protected String severity7Label;
   @XmlElement(name = "Severity8", nillable = true) protected Integer severity8;
   @XmlElement(name = "Severity8Label") protected String severity8Label;
   @XmlElement(name = "Severity9", nillable = true) protected Integer severity9;
   @XmlElement(name = "Severity9Label") protected String severity9Label;

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the probabilityThresholdLevel property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProbabilityThresholdLevel()
   {
      return probabilityThresholdLevel;
   }

   /**
    * Sets the value of the probabilityThresholdLevel property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProbabilityThresholdLevel(Integer value)
   {
      this.probabilityThresholdLevel = value;
   }

   /**
    * Gets the value of the riskMatrixName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskMatrixName()
   {
      return riskMatrixName;
   }

   /**
    * Sets the value of the riskMatrixName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskMatrixName(String value)
   {
      this.riskMatrixName = value;
   }

   /**
    * Gets the value of the riskMatrixObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskMatrixObjectId()
   {
      return riskMatrixObjectId;
   }

   /**
    * Sets the value of the riskMatrixObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskMatrixObjectId(Integer value)
   {
      this.riskMatrixObjectId = value;
   }

   /**
    * Gets the value of the severity1 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity1()
   {
      return severity1;
   }

   /**
    * Sets the value of the severity1 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity1(Integer value)
   {
      this.severity1 = value;
   }

   /**
    * Gets the value of the severity1Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity1Label()
   {
      return severity1Label;
   }

   /**
    * Sets the value of the severity1Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity1Label(String value)
   {
      this.severity1Label = value;
   }

   /**
    * Gets the value of the severity2 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity2()
   {
      return severity2;
   }

   /**
    * Sets the value of the severity2 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity2(Integer value)
   {
      this.severity2 = value;
   }

   /**
    * Gets the value of the severity2Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity2Label()
   {
      return severity2Label;
   }

   /**
    * Sets the value of the severity2Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity2Label(String value)
   {
      this.severity2Label = value;
   }

   /**
    * Gets the value of the severity3 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity3()
   {
      return severity3;
   }

   /**
    * Sets the value of the severity3 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity3(Integer value)
   {
      this.severity3 = value;
   }

   /**
    * Gets the value of the severity3Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity3Label()
   {
      return severity3Label;
   }

   /**
    * Sets the value of the severity3Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity3Label(String value)
   {
      this.severity3Label = value;
   }

   /**
    * Gets the value of the severity4 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity4()
   {
      return severity4;
   }

   /**
    * Sets the value of the severity4 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity4(Integer value)
   {
      this.severity4 = value;
   }

   /**
    * Gets the value of the severity4Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity4Label()
   {
      return severity4Label;
   }

   /**
    * Sets the value of the severity4Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity4Label(String value)
   {
      this.severity4Label = value;
   }

   /**
    * Gets the value of the severity5 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity5()
   {
      return severity5;
   }

   /**
    * Sets the value of the severity5 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity5(Integer value)
   {
      this.severity5 = value;
   }

   /**
    * Gets the value of the severity5Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity5Label()
   {
      return severity5Label;
   }

   /**
    * Sets the value of the severity5Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity5Label(String value)
   {
      this.severity5Label = value;
   }

   /**
    * Gets the value of the severity6 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity6()
   {
      return severity6;
   }

   /**
    * Sets the value of the severity6 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity6(Integer value)
   {
      this.severity6 = value;
   }

   /**
    * Gets the value of the severity6Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity6Label()
   {
      return severity6Label;
   }

   /**
    * Sets the value of the severity6Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity6Label(String value)
   {
      this.severity6Label = value;
   }

   /**
    * Gets the value of the severity7 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity7()
   {
      return severity7;
   }

   /**
    * Sets the value of the severity7 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity7(Integer value)
   {
      this.severity7 = value;
   }

   /**
    * Gets the value of the severity7Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity7Label()
   {
      return severity7Label;
   }

   /**
    * Sets the value of the severity7Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity7Label(String value)
   {
      this.severity7Label = value;
   }

   /**
    * Gets the value of the severity8 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity8()
   {
      return severity8;
   }

   /**
    * Sets the value of the severity8 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity8(Integer value)
   {
      this.severity8 = value;
   }

   /**
    * Gets the value of the severity8Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity8Label()
   {
      return severity8Label;
   }

   /**
    * Sets the value of the severity8Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity8Label(String value)
   {
      this.severity8Label = value;
   }

   /**
    * Gets the value of the severity9 property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSeverity9()
   {
      return severity9;
   }

   /**
    * Sets the value of the severity9 property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSeverity9(Integer value)
   {
      this.severity9 = value;
   }

   /**
    * Gets the value of the severity9Label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSeverity9Label()
   {
      return severity9Label;
   }

   /**
    * Sets the value of the severity9Label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSeverity9Label(String value)
   {
      this.severity9Label = value;
   }

}