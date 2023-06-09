package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the price of an item. Allows for domain extension.
 */
@ApiModel(description = "Describes the price of an item. Allows for domain extension.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Price  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("value")
  private String value;

  @JsonProperty("estimated_value")
  private String estimatedValue;

  @JsonProperty("computed_value")
  private String computedValue;

  @JsonProperty("listed_value")
  private String listedValue;

  @JsonProperty("offered_value")
  private String offeredValue;

  @JsonProperty("minimum_value")
  private String minimumValue;

  @JsonProperty("maximum_value")
  private String maximumValue;

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 alphabetic currency code e.g. 'INR'
   * @return currency
  */
  @ApiModelProperty(value = "ISO 4217 alphabetic currency code e.g. 'INR'")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Price value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Describes a decimal value
   * @return value
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Price estimatedValue(String estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return estimatedValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(String estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public Price computedValue(String computedValue) {
    this.computedValue = computedValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return computedValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getComputedValue() {
    return computedValue;
  }

  public void setComputedValue(String computedValue) {
    this.computedValue = computedValue;
  }

  public Price listedValue(String listedValue) {
    this.listedValue = listedValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return listedValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getListedValue() {
    return listedValue;
  }

  public void setListedValue(String listedValue) {
    this.listedValue = listedValue;
  }

  public Price offeredValue(String offeredValue) {
    this.offeredValue = offeredValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return offeredValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getOfferedValue() {
    return offeredValue;
  }

  public void setOfferedValue(String offeredValue) {
    this.offeredValue = offeredValue;
  }

  public Price minimumValue(String minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return minimumValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(String minimumValue) {
    this.minimumValue = minimumValue;
  }

  public Price maximumValue(String maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * Describes a decimal value
   * @return maximumValue
  */
  @ApiModelProperty(value = "Describes a decimal value")

@Pattern(regexp="[+-]?([0-9]*[.])?[0-9]+") 
  public String getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(String maximumValue) {
    this.maximumValue = maximumValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.value, price.value) &&
        Objects.equals(this.estimatedValue, price.estimatedValue) &&
        Objects.equals(this.computedValue, price.computedValue) &&
        Objects.equals(this.listedValue, price.listedValue) &&
        Objects.equals(this.offeredValue, price.offeredValue) &&
        Objects.equals(this.minimumValue, price.minimumValue) &&
        Objects.equals(this.maximumValue, price.maximumValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value, estimatedValue, computedValue, listedValue, offeredValue, minimumValue, maximumValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
    sb.append("    listedValue: ").append(toIndentedString(listedValue)).append("\n");
    sb.append("    offeredValue: ").append(toIndentedString(offeredValue)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

