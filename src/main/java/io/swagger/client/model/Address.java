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
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T14:22:24.496+01:00")
public class Address {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("houseNumberOrName")
  private String houseNumberOrName = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("stateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("street")
  private String street = null;

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * the city
   * @return city
  **/
  @ApiModelProperty(value = "the city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * the two letter country code (ISO 3166-1)
   * @return country
  **/
  @ApiModelProperty(value = "the two letter country code (ISO 3166-1)")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * the house number or name
   * @return houseNumberOrName
  **/
  @ApiModelProperty(value = "the house number or name")
  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }

  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * the postal / zip code
   * @return postalCode
  **/
  @ApiModelProperty(value = "the postal / zip code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * the state or province
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "the state or province")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * the street name
   * @return street
  **/
  @ApiModelProperty(value = "the street name")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.houseNumberOrName, address.houseNumberOrName) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.street, address.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

