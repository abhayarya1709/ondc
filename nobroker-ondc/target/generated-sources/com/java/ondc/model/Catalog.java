package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Category;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Fulfillment;
import com.java.ondc.model.Offer;
import com.java.ondc.model.Payment;
import com.java.ondc.model.Provider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a Seller App catalog
 */
@ApiModel(description = "Describes a Seller App catalog")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Catalog  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bpp/descriptor")
  private Descriptor bppDescriptor;

  @JsonProperty("bpp/categories")
  @Valid
  private List<Category> bppCategories = null;

  @JsonProperty("bpp/fulfillments")
  @Valid
  private List<Fulfillment> bppFulfillments = null;

  @JsonProperty("bpp/payments")
  @Valid
  private List<Payment> bppPayments = null;

  @JsonProperty("bpp/offers")
  @Valid
  private List<Offer> bppOffers = null;

  @JsonProperty("bpp/providers")
  @Valid
  private List<Provider> bppProviders = null;

  @JsonProperty("exp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime exp;

  public Catalog bppDescriptor(Descriptor bppDescriptor) {
    this.bppDescriptor = bppDescriptor;
    return this;
  }

  /**
   * Get bppDescriptor
   * @return bppDescriptor
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getBppDescriptor() {
    return bppDescriptor;
  }

  public void setBppDescriptor(Descriptor bppDescriptor) {
    this.bppDescriptor = bppDescriptor;
  }

  public Catalog bppCategories(List<Category> bppCategories) {
    this.bppCategories = bppCategories;
    return this;
  }

  public Catalog addBppCategoriesItem(Category bppCategoriesItem) {
    if (this.bppCategories == null) {
      this.bppCategories = new ArrayList<>();
    }
    this.bppCategories.add(bppCategoriesItem);
    return this;
  }

  /**
   * Get bppCategories
   * @return bppCategories
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Category> getBppCategories() {
    return bppCategories;
  }

  public void setBppCategories(List<Category> bppCategories) {
    this.bppCategories = bppCategories;
  }

  public Catalog bppFulfillments(List<Fulfillment> bppFulfillments) {
    this.bppFulfillments = bppFulfillments;
    return this;
  }

  public Catalog addBppFulfillmentsItem(Fulfillment bppFulfillmentsItem) {
    if (this.bppFulfillments == null) {
      this.bppFulfillments = new ArrayList<>();
    }
    this.bppFulfillments.add(bppFulfillmentsItem);
    return this;
  }

  /**
   * Get bppFulfillments
   * @return bppFulfillments
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Fulfillment> getBppFulfillments() {
    return bppFulfillments;
  }

  public void setBppFulfillments(List<Fulfillment> bppFulfillments) {
    this.bppFulfillments = bppFulfillments;
  }

  public Catalog bppPayments(List<Payment> bppPayments) {
    this.bppPayments = bppPayments;
    return this;
  }

  public Catalog addBppPaymentsItem(Payment bppPaymentsItem) {
    if (this.bppPayments == null) {
      this.bppPayments = new ArrayList<>();
    }
    this.bppPayments.add(bppPaymentsItem);
    return this;
  }

  /**
   * Get bppPayments
   * @return bppPayments
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Payment> getBppPayments() {
    return bppPayments;
  }

  public void setBppPayments(List<Payment> bppPayments) {
    this.bppPayments = bppPayments;
  }

  public Catalog bppOffers(List<Offer> bppOffers) {
    this.bppOffers = bppOffers;
    return this;
  }

  public Catalog addBppOffersItem(Offer bppOffersItem) {
    if (this.bppOffers == null) {
      this.bppOffers = new ArrayList<>();
    }
    this.bppOffers.add(bppOffersItem);
    return this;
  }

  /**
   * Get bppOffers
   * @return bppOffers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Offer> getBppOffers() {
    return bppOffers;
  }

  public void setBppOffers(List<Offer> bppOffers) {
    this.bppOffers = bppOffers;
  }

  public Catalog bppProviders(List<Provider> bppProviders) {
    this.bppProviders = bppProviders;
    return this;
  }

  public Catalog addBppProvidersItem(Provider bppProvidersItem) {
    if (this.bppProviders == null) {
      this.bppProviders = new ArrayList<>();
    }
    this.bppProviders.add(bppProvidersItem);
    return this;
  }

  /**
   * Get bppProviders
   * @return bppProviders
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Provider> getBppProviders() {
    return bppProviders;
  }

  public void setBppProviders(List<Provider> bppProviders) {
    this.bppProviders = bppProviders;
  }

  public Catalog exp(OffsetDateTime exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Time after which catalog has to be refreshed
   * @return exp
  */
  @ApiModelProperty(value = "Time after which catalog has to be refreshed")

  @Valid

  public OffsetDateTime getExp() {
    return exp;
  }

  public void setExp(OffsetDateTime exp) {
    this.exp = exp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.bppDescriptor, catalog.bppDescriptor) &&
        Objects.equals(this.bppCategories, catalog.bppCategories) &&
        Objects.equals(this.bppFulfillments, catalog.bppFulfillments) &&
        Objects.equals(this.bppPayments, catalog.bppPayments) &&
        Objects.equals(this.bppOffers, catalog.bppOffers) &&
        Objects.equals(this.bppProviders, catalog.bppProviders) &&
        Objects.equals(this.exp, catalog.exp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bppDescriptor, bppCategories, bppFulfillments, bppPayments, bppOffers, bppProviders, exp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    bppDescriptor: ").append(toIndentedString(bppDescriptor)).append("\n");
    sb.append("    bppCategories: ").append(toIndentedString(bppCategories)).append("\n");
    sb.append("    bppFulfillments: ").append(toIndentedString(bppFulfillments)).append("\n");
    sb.append("    bppPayments: ").append(toIndentedString(bppPayments)).append("\n");
    sb.append("    bppOffers: ").append(toIndentedString(bppOffers)).append("\n");
    sb.append("    bppProviders: ").append(toIndentedString(bppProviders)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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

