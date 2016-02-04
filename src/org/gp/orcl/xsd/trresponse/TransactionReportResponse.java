
package org.gp.orcl.xsd.trresponse;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="request_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="response_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transaction" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="card_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="card_verification_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="card_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expiration_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="holder_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="request_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="merchant_location_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="merchant_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
         "merchantName", "requestDateTime", "responseDateTime", "fromDateTime", "toDateTime", "transaction" })
@XmlRootElement(name = "transaction_report_response")
public class TransactionReportResponse {

    @XmlElement(name = "merchant_name", required = true)
    protected String merchantName;
    @XmlElement(name = "request_date_time", required = true)
    protected String requestDateTime;
    @XmlElement(name = "response_date_time", required = true)
    protected String responseDateTime;
    @XmlElement(name = "from_date_time", required = true)
    protected String fromDateTime;
    @XmlElement(name = "to_date_time", required = true)
    protected String toDateTime;
    @XmlElement(required = true)
    protected List<TransactionReportResponse.Transaction> transaction;

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
     * Gets the value of the responseDateTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseDateTime(String value) {
        this.responseDateTime = value;
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
            return "(" + getMerchantName() + "," + getRequestDateTime() + "," + getResponseDateTime() + "," + getFromDateTime() + "," + getToDateTime() + "," + getTransaction().size() + ")";
    }
    

    /**
     * Gets the value of the transaction property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getTransaction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReportResponse.Transaction}
     *
     *
     * @return
     */
    public List<TransactionReportResponse.Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<TransactionReportResponse.Transaction>();
        }
        return this.transaction;
    }


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
     *         &lt;element name="card_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="card_verification_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="card_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expiration_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="holder_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="request_date_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="merchant_location_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="merchant_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
             "cardNumber", "cardVerificationNumber", "cardType", "expirationDate", "holderName", "amount", "currency",
             "requestDateTime", "merchantLocationCode", "merchantTransactionId"
        })
    public static class Transaction {

        @XmlElement(name = "card_number", required = true)
        protected String cardNumber;
        @XmlElement(name = "card_verification_number", required = true)
        protected String cardVerificationNumber;
        @XmlElement(name = "card_type", required = true)
        protected String cardType;
        @XmlElement(name = "expiration_date", required = true)
        protected String expirationDate;
        @XmlElement(name = "holder_name", required = true)
        protected String holderName;
        @XmlElement(required = true)
        protected String amount;
        @XmlElement(required = true)
        protected String currency;
        @XmlElement(name = "request_date_time", required = true)
        protected String requestDateTime;
        @XmlElement(name = "merchant_location_code", required = true)
        protected String merchantLocationCode;
        @XmlElement(name = "merchant_transaction_id", required = true)
        protected String merchantTransactionId;

        /**
         * Gets the value of the cardNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Sets the value of the cardNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Gets the value of the cardVerificationNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCardVerificationNumber() {
            return cardVerificationNumber;
        }

        /**
         * Sets the value of the cardVerificationNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCardVerificationNumber(String value) {
            this.cardVerificationNumber = value;
        }

        /**
         * Gets the value of the cardType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * Sets the value of the cardType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCardType(String value) {
            this.cardType = value;
        }

        /**
         * Gets the value of the expirationDate property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setExpirationDate(String value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the holderName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHolderName() {
            return holderName;
        }

        /**
         * Sets the value of the holderName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHolderName(String value) {
            this.holderName = value;
        }

        /**
         * Gets the value of the amount property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCurrency(String value) {
            this.currency = value;
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
         * Gets the value of the merchantLocationCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMerchantLocationCode() {
            return merchantLocationCode;
        }

        /**
         * Sets the value of the merchantLocationCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMerchantLocationCode(String value) {
            this.merchantLocationCode = value;
        }

        /**
         * Gets the value of the merchantTransactionId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMerchantTransactionId() {
            return merchantTransactionId;
        }

        /**
         * Sets the value of the merchantTransactionId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMerchantTransactionId(String value) {
            this.merchantTransactionId = value;
        }

    }

}
