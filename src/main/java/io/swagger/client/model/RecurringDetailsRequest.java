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
import io.swagger.client.model.Recurring;

/**
 * RecurringDetailsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T14:22:24.496+01:00")
public class RecurringDetailsRequest {
  @SerializedName("merchantAccount")
  private String merchantAccount = null;

  @SerializedName("shopperReference")
  private String shopperReference = null;

  @SerializedName("recurring")
  private Recurring recurring = null;

  public RecurringDetailsRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * the merchant account which will be used for processing this request
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "the merchant account which will be used for processing this request")
  public String getMerchantAccount() {
    return merchantAccount;
  }

  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public RecurringDetailsRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * a reference you use to uniquely identify the shopper (e.g. user ID or account ID)
   * @return shopperReference
  **/
  @ApiModelProperty(value = "a reference you use to uniquely identify the shopper (e.g. user ID or account ID)")
  public String getShopperReference() {
    return shopperReference;
  }

  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  public RecurringDetailsRequest recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * the type of recurring contract to be used.
   * @return recurring
  **/
  @ApiModelProperty(value = "the type of recurring contract to be used.")
  public Recurring getRecurring() {
    return recurring;
  }

  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetailsRequest recurringDetailsRequest = (RecurringDetailsRequest) o;
    return Objects.equals(this.merchantAccount, recurringDetailsRequest.merchantAccount) &&
        Objects.equals(this.shopperReference, recurringDetailsRequest.shopperReference) &&
        Objects.equals(this.recurring, recurringDetailsRequest.recurring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, shopperReference, recurring);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetailsRequest {\n");
    
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
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

