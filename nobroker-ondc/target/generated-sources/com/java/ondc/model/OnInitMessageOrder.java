package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Billing;
import com.java.ondc.model.Fulfillment;
import com.java.ondc.model.OnInitMessageOrderAddOns;
import com.java.ondc.model.OnInitMessageOrderItems;
import com.java.ondc.model.OnInitMessageOrderOffers;
import com.java.ondc.model.OnInitMessageOrderProvider;
import com.java.ondc.model.OnInitMessageOrderProviderLocation;
import com.java.ondc.model.Payment;
import com.java.ondc.model.Quotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OnInitMessageOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OnInitMessageOrder  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("provider")
  private OnInitMessageOrderProvider provider;

  @JsonProperty("provider_location")
  private OnInitMessageOrderProviderLocation providerLocation;

  @JsonProperty("items")
  @Valid
  private List<OnInitMessageOrderItems> items = null;

  @JsonProperty("add_ons")
  @Valid
  private List<OnInitMessageOrderAddOns> addOns = null;

  @JsonProperty("offers")
  @Valid
  private List<OnInitMessageOrderOffers> offers = null;

  @JsonProperty("billing")
  private Billing billing;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("quote")
  private Quotation quote;

  @JsonProperty("payment")
  private Payment payment;

  public OnInitMessageOrder provider(OnInitMessageOrderProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @ApiModelProperty(value = "")

  @Valid

  public OnInitMessageOrderProvider getProvider() {
    return provider;
  }

  public void setProvider(OnInitMessageOrderProvider provider) {
    this.provider = provider;
  }

  public OnInitMessageOrder providerLocation(OnInitMessageOrderProviderLocation providerLocation) {
    this.providerLocation = providerLocation;
    return this;
  }

  /**
   * Get providerLocation
   * @return providerLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public OnInitMessageOrderProviderLocation getProviderLocation() {
    return providerLocation;
  }

  public void setProviderLocation(OnInitMessageOrderProviderLocation providerLocation) {
    this.providerLocation = providerLocation;
  }

  public OnInitMessageOrder items(List<OnInitMessageOrderItems> items) {
    this.items = items;
    return this;
  }

  public OnInitMessageOrder addItemsItem(OnInitMessageOrderItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OnInitMessageOrderItems> getItems() {
    return items;
  }

  public void setItems(List<OnInitMessageOrderItems> items) {
    this.items = items;
  }

  public OnInitMessageOrder addOns(List<OnInitMessageOrderAddOns> addOns) {
    this.addOns = addOns;
    return this;
  }

  public OnInitMessageOrder addAddOnsItem(OnInitMessageOrderAddOns addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OnInitMessageOrderAddOns> getAddOns() {
    return addOns;
  }

  public void setAddOns(List<OnInitMessageOrderAddOns> addOns) {
    this.addOns = addOns;
  }

  public OnInitMessageOrder offers(List<OnInitMessageOrderOffers> offers) {
    this.offers = offers;
    return this;
  }

  public OnInitMessageOrder addOffersItem(OnInitMessageOrderOffers offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OnInitMessageOrderOffers> getOffers() {
    return offers;
  }

  public void setOffers(List<OnInitMessageOrderOffers> offers) {
    this.offers = offers;
  }

  public OnInitMessageOrder billing(Billing billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
  */
  @ApiModelProperty(value = "")

  @Valid

  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public OnInitMessageOrder fulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
    return this;
  }

  /**
   * Get fulfillment
   * @return fulfillment
  */
  @ApiModelProperty(value = "")

  @Valid

  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public OnInitMessageOrder quote(Quotation quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
  */
  @ApiModelProperty(value = "")

  @Valid

  public Quotation getQuote() {
    return quote;
  }

  public void setQuote(Quotation quote) {
    this.quote = quote;
  }

  public OnInitMessageOrder payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty(value = "")

  @Valid

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnInitMessageOrder onInitMessageOrder = (OnInitMessageOrder) o;
    return Objects.equals(this.provider, onInitMessageOrder.provider) &&
        Objects.equals(this.providerLocation, onInitMessageOrder.providerLocation) &&
        Objects.equals(this.items, onInitMessageOrder.items) &&
        Objects.equals(this.addOns, onInitMessageOrder.addOns) &&
        Objects.equals(this.offers, onInitMessageOrder.offers) &&
        Objects.equals(this.billing, onInitMessageOrder.billing) &&
        Objects.equals(this.fulfillment, onInitMessageOrder.fulfillment) &&
        Objects.equals(this.quote, onInitMessageOrder.quote) &&
        Objects.equals(this.payment, onInitMessageOrder.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, providerLocation, items, addOns, offers, billing, fulfillment, quote, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnInitMessageOrder {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerLocation: ").append(toIndentedString(providerLocation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

