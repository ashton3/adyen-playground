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
import io.swagger.client.model.FraudCheckResult;
import java.util.ArrayList;
import java.util.List;

/**
 * FraudResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T14:22:24.496+01:00")
public class FraudResult {
  @SerializedName("accountScore")
  private Integer accountScore = null;

  @SerializedName("results")
  private List<FraudCheckResult> results = null;

  public FraudResult accountScore(Integer accountScore) {
    this.accountScore = accountScore;
    return this;
  }

   /**
   * the total fraud score generated by the risk checks
   * @return accountScore
  **/
  @ApiModelProperty(value = "the total fraud score generated by the risk checks")
  public Integer getAccountScore() {
    return accountScore;
  }

  public void setAccountScore(Integer accountScore) {
    this.accountScore = accountScore;
  }

  public FraudResult results(List<FraudCheckResult> results) {
    this.results = results;
    return this;
  }

  public FraudResult addResultsItem(FraudCheckResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<FraudCheckResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * the result of the individual risk checks
   * @return results
  **/
  @ApiModelProperty(value = "the result of the individual risk checks")
  public List<FraudCheckResult> getResults() {
    return results;
  }

  public void setResults(List<FraudCheckResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudResult fraudResult = (FraudResult) o;
    return Objects.equals(this.accountScore, fraudResult.accountScore) &&
        Objects.equals(this.results, fraudResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountScore, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudResult {\n");
    
    sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

