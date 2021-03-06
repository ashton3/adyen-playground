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

/**
 * ELV
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T14:22:24.496+01:00")
public class ELV {
  @SerializedName("bankName")
  private String bankName = null;

  @SerializedName("bankAccountNumber")
  private String bankAccountNumber = null;

  @SerializedName("bankLocationId")
  private String bankLocationId = null;

  @SerializedName("bankLocation")
  private String bankLocation = null;

  @SerializedName("accountHolderName")
  private String accountHolderName = null;

  public ELV bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public ELV bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * Get bankAccountNumber
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public ELV bankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * Get bankLocationId
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "")
  public String getBankLocationId() {
    return bankLocationId;
  }

  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }

  public ELV bankLocation(String bankLocation) {
    this.bankLocation = bankLocation;
    return this;
  }

   /**
   * Get bankLocation
   * @return bankLocation
  **/
  @ApiModelProperty(value = "")
  public String getBankLocation() {
    return bankLocation;
  }

  public void setBankLocation(String bankLocation) {
    this.bankLocation = bankLocation;
  }

  public ELV accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Get accountHolderName
   * @return accountHolderName
  **/
  @ApiModelProperty(value = "")
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ELV ELV = (ELV) o;
    return Objects.equals(this.bankName, ELV.bankName) &&
        Objects.equals(this.bankAccountNumber, ELV.bankAccountNumber) &&
        Objects.equals(this.bankLocationId, ELV.bankLocationId) &&
        Objects.equals(this.bankLocation, ELV.bankLocation) &&
        Objects.equals(this.accountHolderName, ELV.accountHolderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, bankAccountNumber, bankLocationId, bankLocation, accountHolderName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ELV {\n");
    
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    bankLocation: ").append(toIndentedString(bankLocation)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
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

