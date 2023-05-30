package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.AddOn;
import com.java.ondc.model.Item;
import com.java.ondc.model.Location;
import com.java.ondc.model.Offer;
import com.java.ondc.model.Provider;
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
 * OnSelectMessageOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OnSelectMessageOrder  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("provider")
  private Provider provider;

  @JsonProperty("provider_location")
  private Location providerLocation;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  @JsonProperty("add_ons")
  @Valid
  private List<AddOn> addOns = null;

  @JsonProperty("offers")
  @Valid
  private List<Offer> offers = null;

  @JsonProperty("quote")
  private Quotation quote;

  public OnSelectMessageOrder provider(Provider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @ApiModelProperty(value = "")

  @Valid

  public Provider getProvider() {
    return provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }

  public OnSelectMessageOrder providerLocation(Location providerLocation) {
    this.providerLocation = providerLocation;
    return this;
  }

  /**
   * Get providerLocation
   * @return providerLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getProviderLocation() {
    return providerLocation;
  }

  public void setProviderLocation(Location providerLocation) {
    this.providerLocation = providerLocation;
  }

  public OnSelectMessageOrder items(List<Item> items) {
    this.items = items;
    return this;
  }

  public OnSelectMessageOrder addItemsItem(Item itemsItem) {
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

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public OnSelectMessageOrder addOns(List<AddOn> addOns) {
    this.addOns = addOns;
    return this;
  }

  public OnSelectMessageOrder addAddOnsItem(AddOn addOnsItem) {
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

  public List<AddOn> getAddOns() {
    return addOns;
  }

  public void setAddOns(List<AddOn> addOns) {
    this.addOns = addOns;
  }

  public OnSelectMessageOrder offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public OnSelectMessageOrder addOffersItem(Offer offersItem) {
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

  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }

  public OnSelectMessageOrder quote(Quotation quote) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnSelectMessageOrder onSelectMessageOrder = (OnSelectMessageOrder) o;
    return Objects.equals(this.provider, onSelectMessageOrder.provider) &&
        Objects.equals(this.providerLocation, onSelectMessageOrder.providerLocation) &&
        Objects.equals(this.items, onSelectMessageOrder.items) &&
        Objects.equals(this.addOns, onSelectMessageOrder.addOns) &&
        Objects.equals(this.offers, onSelectMessageOrder.offers) &&
        Objects.equals(this.quote, onSelectMessageOrder.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, providerLocation, items, addOns, offers, quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSelectMessageOrder {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerLocation: ").append(toIndentedString(providerLocation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

