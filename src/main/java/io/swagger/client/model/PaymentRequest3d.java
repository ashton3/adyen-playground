/*
 * Adyen Wherever People Pay
 * This is the Adyen API Playground where you can test our API's. <br /><br />You can find out more about Adyen      at <a href=\"http://www.adyen.com\">http://www.adyen.com</a>.  <!--For this sample, you can use the api key \"special-key\" to test the authorization filters.-->
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.Amount;
import io.swagger.client.model.BrowserInfo;
import io.swagger.client.model.ForexQuote;
import io.swagger.client.model.Installments;
import io.swagger.client.model.Name;
import io.swagger.client.model.Recurring;
import org.joda.time.LocalDate;

/**
 * PaymentRequest3d
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T14:22:24.496+01:00")
public class PaymentRequest3d {
  @SerializedName("md")
  private String md = null;

  @SerializedName("paResponse")
  private String paResponse = null;

  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("billingAddress")
  private Address billingAddress = null;

  @SerializedName("shopperIP")
  private String shopperIP = null;

  @SerializedName("merchantAccount")
  private String merchantAccount = null;

  @SerializedName("browserInfo")
  private BrowserInfo browserInfo = null;

  /**
   * how the shopper interacts with the system
   */
  public enum ShopperInteractionEnum {
    @SerializedName("Ecommerce")
    ECOMMERCE("Ecommerce"),
    
    @SerializedName("ContAuth")
    CONTAUTH("ContAuth"),
    
    @SerializedName("Moto")
    MOTO("Moto");

    private String value;

    ShopperInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("shopperInteraction")
  private ShopperInteractionEnum shopperInteraction = null;

  @SerializedName("shopperEmail")
  private String shopperEmail = null;

  @SerializedName("shopperReference")
  private String shopperReference = null;

  @SerializedName("recurring")
  private Recurring recurring = null;

  @SerializedName("shopperStatement")
  private String shopperStatement = null;

  @SerializedName("fraudOffset")
  private Integer fraudOffset = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("additionalAmount")
  private Amount additionalAmount = null;

  @SerializedName("selectedRecurringDetailReference")
  private String selectedRecurringDetailReference = null;

  @SerializedName("orderReference")
  private String orderReference = null;

  @SerializedName("merchantOrderReference")
  private String merchantOrderReference = null;

  @SerializedName("dccQuote")
  private ForexQuote dccQuote = null;

  @SerializedName("additionalData")
  private String additionalData = null;

  @SerializedName("shopperName")
  private Name shopperName = null;

  @SerializedName("shopperLocale")
  private String shopperLocale = null;

  @SerializedName("selectedBrand")
  private String selectedBrand = null;

  @SerializedName("deliveryAddress")
  private Address deliveryAddress = null;

  @SerializedName("deliveryDate")
  private LocalDate deliveryDate = null;

  @SerializedName("deviceFingerprint")
  private String deviceFingerprint = null;

  @SerializedName("installments")
  private Installments installments = null;

  @SerializedName("socialSecurityNumber")
  private String socialSecurityNumber = null;

  @SerializedName("captureDelayHours")
  private Integer captureDelayHours = null;

  @SerializedName("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @SerializedName("telephoneNumber")
  private String telephoneNumber = null;

  @SerializedName("mcc")
  private String mcc = null;

  @SerializedName("metadata")
  private String metadata = null;

  public PaymentRequest3d md(String md) {
    this.md = md;
    return this;
  }

   /**
   * Get md
   * @return md
  **/
  @ApiModelProperty(value = "")
  public String getMd() {
    return md;
  }

  public void setMd(String md) {
    this.md = md;
  }

  public PaymentRequest3d paResponse(String paResponse) {
    this.paResponse = paResponse;
    return this;
  }

   /**
   * Get paResponse
   * @return paResponse
  **/
  @ApiModelProperty(value = "")
  public String getPaResponse() {
    return paResponse;
  }

  public void setPaResponse(String paResponse) {
    this.paResponse = paResponse;
  }

  public PaymentRequest3d amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * the amount to charge
   * @return amount
  **/
  @ApiModelProperty(value = "the amount to charge")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PaymentRequest3d reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * the reference assigned to the payment
   * @return reference
  **/
  @ApiModelProperty(value = "the reference assigned to the payment")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PaymentRequest3d billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * the address where to send the invoice
   * @return billingAddress
  **/
  @ApiModelProperty(value = "the address where to send the invoice")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public PaymentRequest3d shopperIP(String shopperIP) {
    this.shopperIP = shopperIP;
    return this;
  }

   /**
   * the IP address of the shopper
   * @return shopperIP
  **/
  @ApiModelProperty(value = "the IP address of the shopper")
  public String getShopperIP() {
    return shopperIP;
  }

  public void setShopperIP(String shopperIP) {
    this.shopperIP = shopperIP;
  }

  public PaymentRequest3d merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * the merchant account which will be used to process the payment
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "the merchant account which will be used to process the payment")
  public String getMerchantAccount() {
    return merchantAccount;
  }

  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public PaymentRequest3d browserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
    return this;
  }

   /**
   * the browser info data
   * @return browserInfo
  **/
  @ApiModelProperty(value = "the browser info data")
  public BrowserInfo getBrowserInfo() {
    return browserInfo;
  }

  public void setBrowserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
  }

  public PaymentRequest3d shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * how the shopper interacts with the system
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "how the shopper interacts with the system")
  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }

  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }

  public PaymentRequest3d shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * the email address of the shopper / customer
   * @return shopperEmail
  **/
  @ApiModelProperty(value = "the email address of the shopper / customer")
  public String getShopperEmail() {
    return shopperEmail;
  }

  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  public PaymentRequest3d shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * a reference used to uniquely identify the shopper (e.g. user ID or account ID)
   * @return shopperReference
  **/
  @ApiModelProperty(value = "a reference used to uniquely identify the shopper (e.g. user ID or account ID)")
  public String getShopperReference() {
    return shopperReference;
  }

  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  public PaymentRequest3d recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * the recurring properties of the payment
   * @return recurring
  **/
  @ApiModelProperty(value = "the recurring properties of the payment")
  public Recurring getRecurring() {
    return recurring;
  }

  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  public PaymentRequest3d shopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
    return this;
  }

   /**
   * the text to appear on the shopper's statement
   * @return shopperStatement
  **/
  @ApiModelProperty(value = "the text to appear on the shopper's statement")
  public String getShopperStatement() {
    return shopperStatement;
  }

  public void setShopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
  }

  public PaymentRequest3d fraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * the offset that is added to the normal fraud score (positive or negative)
   * @return fraudOffset
  **/
  @ApiModelProperty(value = "the offset that is added to the normal fraud score (positive or negative)")
  public Integer getFraudOffset() {
    return fraudOffset;
  }

  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }

  public PaymentRequest3d sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(value = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public PaymentRequest3d additionalAmount(Amount additionalAmount) {
    this.additionalAmount = additionalAmount;
    return this;
  }

   /**
   * the portion of the \"amount\" which is additional/surcharged. Required to be in the same currency as the amount.
   * @return additionalAmount
  **/
  @ApiModelProperty(value = "the portion of the \"amount\" which is additional/surcharged. Required to be in the same currency as the amount.")
  public Amount getAdditionalAmount() {
    return additionalAmount;
  }

  public void setAdditionalAmount(Amount additionalAmount) {
    this.additionalAmount = additionalAmount;
  }

  public PaymentRequest3d selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

   /**
   * the recurringDetailReference you want to use for this payment
   * @return selectedRecurringDetailReference
  **/
  @ApiModelProperty(value = "the recurringDetailReference you want to use for this payment")
  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }

  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }

  public PaymentRequest3d orderReference(String orderReference) {
    this.orderReference = orderReference;
    return this;
  }

   /**
   * the order reference to link multiple partial payments
   * @return orderReference
  **/
  @ApiModelProperty(value = "the order reference to link multiple partial payments")
  public String getOrderReference() {
    return orderReference;
  }

  public void setOrderReference(String orderReference) {
    this.orderReference = orderReference;
  }

  public PaymentRequest3d merchantOrderReference(String merchantOrderReference) {
    this.merchantOrderReference = merchantOrderReference;
    return this;
  }

   /**
   * the reference to link multiple transactions to each other
   * @return merchantOrderReference
  **/
  @ApiModelProperty(value = "the reference to link multiple transactions to each other")
  public String getMerchantOrderReference() {
    return merchantOrderReference;
  }

  public void setMerchantOrderReference(String merchantOrderReference) {
    this.merchantOrderReference = merchantOrderReference;
  }

  public PaymentRequest3d dccQuote(ForexQuote dccQuote) {
    this.dccQuote = dccQuote;
    return this;
  }

   /**
   * the forex quote as returned in the response of the forex service
   * @return dccQuote
  **/
  @ApiModelProperty(value = "the forex quote as returned in the response of the forex service")
  public ForexQuote getDccQuote() {
    return dccQuote;
  }

  public void setDccQuote(ForexQuote dccQuote) {
    this.dccQuote = dccQuote;
  }

  public PaymentRequest3d additionalData(String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * a map of name/value pairs for passing in additional/industry-specific data
   * @return additionalData
  **/
  @ApiModelProperty(value = "a map of name/value pairs for passing in additional/industry-specific data")
  public String getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }

  public PaymentRequest3d shopperName(Name shopperName) {
    this.shopperName = shopperName;
    return this;
  }

   /**
   * the name of the shopper
   * @return shopperName
  **/
  @ApiModelProperty(value = "the name of the shopper")
  public Name getShopperName() {
    return shopperName;
  }

  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }

  public PaymentRequest3d shopperLocale(String shopperLocale) {
    this.shopperLocale = shopperLocale;
    return this;
  }

   /**
   * the combination of language code and country code to specify the language to be used in the payment
   * @return shopperLocale
  **/
  @ApiModelProperty(value = "the combination of language code and country code to specify the language to be used in the payment")
  public String getShopperLocale() {
    return shopperLocale;
  }

  public void setShopperLocale(String shopperLocale) {
    this.shopperLocale = shopperLocale;
  }

  public PaymentRequest3d selectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
    return this;
  }

   /**
   * the selected brand how to process the payment for dual branded cards
   * @return selectedBrand
  **/
  @ApiModelProperty(value = "the selected brand how to process the payment for dual branded cards")
  public String getSelectedBrand() {
    return selectedBrand;
  }

  public void setSelectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
  }

  public PaymentRequest3d deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * the address where to deliver
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "the address where to deliver")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public PaymentRequest3d deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * the expected date of delivery or fulfillment
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "the expected date of delivery or fulfillment")
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public PaymentRequest3d deviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

   /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  **/
  @ApiModelProperty(value = "")
  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }

  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }

  public PaymentRequest3d installments(Installments installments) {
    this.installments = installments;
    return this;
  }

   /**
   * the installment properties of the payment
   * @return installments
  **/
  @ApiModelProperty(value = "the installment properties of the payment")
  public Installments getInstallments() {
    return installments;
  }

  public void setInstallments(Installments installments) {
    this.installments = installments;
  }

  public PaymentRequest3d socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * the shopper's social security number
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "the shopper's social security number")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public PaymentRequest3d captureDelayHours(Integer captureDelayHours) {
    this.captureDelayHours = captureDelayHours;
    return this;
  }

   /**
   * the number of hours delay between the authorisation and scheduled auto-capture
   * @return captureDelayHours
  **/
  @ApiModelProperty(value = "the number of hours delay between the authorisation and scheduled auto-capture")
  public Integer getCaptureDelayHours() {
    return captureDelayHours;
  }

  public void setCaptureDelayHours(Integer captureDelayHours) {
    this.captureDelayHours = captureDelayHours;
  }

  public PaymentRequest3d dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * the shopper's date of birth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "the shopper's date of birth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PaymentRequest3d telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * the shopper's telephone number
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "the shopper's telephone number")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public PaymentRequest3d mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

   /**
   * the mcc value that is required to process this payment
   * @return mcc
  **/
  @ApiModelProperty(value = "the mcc value that is required to process this payment")
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public PaymentRequest3d metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * a map of key/value pairs of metadata sent by merchant
   * @return metadata
  **/
  @ApiModelProperty(value = "a map of key/value pairs of metadata sent by merchant")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest3d paymentRequest3d = (PaymentRequest3d) o;
    return Objects.equals(this.md, paymentRequest3d.md) &&
        Objects.equals(this.paResponse, paymentRequest3d.paResponse) &&
        Objects.equals(this.amount, paymentRequest3d.amount) &&
        Objects.equals(this.reference, paymentRequest3d.reference) &&
        Objects.equals(this.billingAddress, paymentRequest3d.billingAddress) &&
        Objects.equals(this.shopperIP, paymentRequest3d.shopperIP) &&
        Objects.equals(this.merchantAccount, paymentRequest3d.merchantAccount) &&
        Objects.equals(this.browserInfo, paymentRequest3d.browserInfo) &&
        Objects.equals(this.shopperInteraction, paymentRequest3d.shopperInteraction) &&
        Objects.equals(this.shopperEmail, paymentRequest3d.shopperEmail) &&
        Objects.equals(this.shopperReference, paymentRequest3d.shopperReference) &&
        Objects.equals(this.recurring, paymentRequest3d.recurring) &&
        Objects.equals(this.shopperStatement, paymentRequest3d.shopperStatement) &&
        Objects.equals(this.fraudOffset, paymentRequest3d.fraudOffset) &&
        Objects.equals(this.sessionId, paymentRequest3d.sessionId) &&
        Objects.equals(this.additionalAmount, paymentRequest3d.additionalAmount) &&
        Objects.equals(this.selectedRecurringDetailReference, paymentRequest3d.selectedRecurringDetailReference) &&
        Objects.equals(this.orderReference, paymentRequest3d.orderReference) &&
        Objects.equals(this.merchantOrderReference, paymentRequest3d.merchantOrderReference) &&
        Objects.equals(this.dccQuote, paymentRequest3d.dccQuote) &&
        Objects.equals(this.additionalData, paymentRequest3d.additionalData) &&
        Objects.equals(this.shopperName, paymentRequest3d.shopperName) &&
        Objects.equals(this.shopperLocale, paymentRequest3d.shopperLocale) &&
        Objects.equals(this.selectedBrand, paymentRequest3d.selectedBrand) &&
        Objects.equals(this.deliveryAddress, paymentRequest3d.deliveryAddress) &&
        Objects.equals(this.deliveryDate, paymentRequest3d.deliveryDate) &&
        Objects.equals(this.deviceFingerprint, paymentRequest3d.deviceFingerprint) &&
        Objects.equals(this.installments, paymentRequest3d.installments) &&
        Objects.equals(this.socialSecurityNumber, paymentRequest3d.socialSecurityNumber) &&
        Objects.equals(this.captureDelayHours, paymentRequest3d.captureDelayHours) &&
        Objects.equals(this.dateOfBirth, paymentRequest3d.dateOfBirth) &&
        Objects.equals(this.telephoneNumber, paymentRequest3d.telephoneNumber) &&
        Objects.equals(this.mcc, paymentRequest3d.mcc) &&
        Objects.equals(this.metadata, paymentRequest3d.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md, paResponse, amount, reference, billingAddress, shopperIP, merchantAccount, browserInfo, shopperInteraction, shopperEmail, shopperReference, recurring, shopperStatement, fraudOffset, sessionId, additionalAmount, selectedRecurringDetailReference, orderReference, merchantOrderReference, dccQuote, additionalData, shopperName, shopperLocale, selectedBrand, deliveryAddress, deliveryDate, deviceFingerprint, installments, socialSecurityNumber, captureDelayHours, dateOfBirth, telephoneNumber, mcc, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest3d {\n");
    
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    paResponse: ").append(toIndentedString(paResponse)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shopperIP: ").append(toIndentedString(shopperIP)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    shopperStatement: ").append(toIndentedString(shopperStatement)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    additionalAmount: ").append(toIndentedString(additionalAmount)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    merchantOrderReference: ").append(toIndentedString(merchantOrderReference)).append("\n");
    sb.append("    dccQuote: ").append(toIndentedString(dccQuote)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperLocale: ").append(toIndentedString(shopperLocale)).append("\n");
    sb.append("    selectedBrand: ").append(toIndentedString(selectedBrand)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    captureDelayHours: ").append(toIndentedString(captureDelayHours)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
