package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Price;
import com.java.ondc.model.QuotationBreakup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a quote
 */
@ApiModel(description = "Describes a quote")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Quotation  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("price")
  private Price price;

  @JsonProperty("breakup")
  @Valid
  private List<QuotationBreakup> breakup = null;

  @JsonProperty("ttl")
  private String ttl;

  public Quotation price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Quotation breakup(List<QuotationBreakup> breakup) {
    this.breakup = breakup;
    return this;
  }

  public Quotation addBreakupItem(QuotationBreakup breakupItem) {
    if (this.breakup == null) {
      this.breakup = new ArrayList<>();
    }
    this.breakup.add(breakupItem);
    return this;
  }

  /**
   * Get breakup
   * @return breakup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<QuotationBreakup> getBreakup() {
    return breakup;
  }

  public void setBreakup(List<QuotationBreakup> breakup) {
    this.breakup = breakup;
  }

  public Quotation ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Describes duration as per ISO8601 format
   * @return ttl
  */
  @ApiModelProperty(value = "Describes duration as per ISO8601 format")


  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quotation quotation = (Quotation) o;
    return Objects.equals(this.price, quotation.price) &&
        Objects.equals(this.breakup, quotation.breakup) &&
        Objects.equals(this.ttl, quotation.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, breakup, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quotation {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    breakup: ").append(toIndentedString(breakup)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

