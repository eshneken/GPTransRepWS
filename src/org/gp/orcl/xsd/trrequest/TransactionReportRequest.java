
package org.gp.orcl.xsd.trrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchant_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchant_password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="request_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "merchantName", "merchantPassword", "requestDateTime", "fromDateTime", "toDateTime" })
@XmlRootElement(name = "transaction_report_request")
public class TransactionReportRequest {

    @XmlElement(name = "merchant_name", required = true)
    protected String merchantName;
    @XmlElement(name = "merchant_password", required = true)
    protected String merchantPassword;
    @XmlElement(name = "request_date_time", required = true)
    protected String requestDateTime;
    @XmlElement(name = "from_date_time", required = true)
    protected String fromDateTime;
    @XmlElement(name = "to_date_time", required = true)
    protected String toDateTime;

    /**
     * Gets the value of the merchantName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantPassword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantPassword() {
        return merchantPassword;
    }

    /**
     * Sets the value of the merchantPassword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantPassword(String value) {
        this.merchantPassword = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
    }

    /**
     * Gets the value of the fromDateTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Sets the value of the fromDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromDateTime(String value) {
        this.fromDateTime = value;
    }

    /**
     * Gets the value of the toDateTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToDateTime() {
        return toDateTime;
    }

    /**
     * Sets the value of the toDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToDateTime(String value) {
        this.toDateTime = value;
    }
    
    /**
     * @return
     */
    public String toString() {
            return "(" + getMerchantName() + "," + getMerchantPassword() + "," + getRequestDateTime() + "," + getFromDateTime() + "," + getToDateTime() + ")";
    }


}
