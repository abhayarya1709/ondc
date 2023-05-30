package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Billing;
import com.java.ondc.model.Document;
import com.java.ondc.model.Fulfillment;
import com.java.ondc.model.OrderAddOns;
import com.java.ondc.model.OrderItems;
import com.java.ondc.model.OrderOffers;
import com.java.ondc.model.OrderProvider;
import com.java.ondc.model.Payment;
import com.java.ondc.model.Quotation;
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
 * Describes the details of an order
 */
@ApiModel(description = "Describes the details of an order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Order  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("state")
  private String state;

  @JsonProperty("provider")
  private OrderProvider provider;

  @JsonProperty("items")
  @Valid
  private List<OrderItems> items = null;

  @JsonProperty("add_ons")
  @Valid
  private List<OrderAddOns> addOns = null;

  @JsonProperty("offers")
  @Valid
  private List<OrderOffers> offers = null;

  @JsonProperty("documents")
  @Valid
  private List<Document> documents = null;

  @JsonProperty("billing")
  private Billing billing;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("quote")
  private Quotation quote;

  @JsonProperty("payment")
  private Payment payment;

  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Hash of order object without id
   * @return id
  */
  @ApiModelProperty(value = "Hash of order object without id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Order provider(OrderProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderProvider getProvider() {
    return provider;
  }

  public void setProvider(OrderProvider provider) {
    this.provider = provider;
  }

  public Order items(List<OrderItems> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItems itemsItem) {
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

  public List<OrderItems> getItems() {
    return items;
  }

  public void setItems(List<OrderItems> items) {
    this.items = items;
  }

  public Order addOns(List<OrderAddOns> addOns) {
    this.addOns = addOns;
    return this;
  }

  public Order addAddOnsItem(OrderAddOns addOnsItem) {
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

  public List<OrderAddOns> getAddOns() {
    return addOns;
  }

  public void setAddOns(List<OrderAddOns> addOns) {
    this.addOns = addOns;
  }

  public Order offers(List<OrderOffers> offers) {
    this.offers = offers;
    return this;
  }

  public Order addOffersItem(OrderOffers offersItem) {
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

  public List<OrderOffers> getOffers() {
    return offers;
  }

  public void setOffers(List<OrderOffers> offers) {
    this.offers = offers;
  }

  public Order documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Order addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public Order billing(Billing billing) {
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

  public Order fulfillment(Fulfillment fulfillment) {
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

  public Order quote(Quotation quote) {
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

  public Order payment(Payment payment) {
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

  public Order createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Order updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.provider, order.provider) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.addOns, order.addOns) &&
        Objects.equals(this.offers, order.offers) &&
        Objects.equals(this.documents, order.documents) &&
        Objects.equals(this.billing, order.billing) &&
        Objects.equals(this.fulfillment, order.fulfillment) &&
        Objects.equals(this.quote, order.quote) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.updatedAt, order.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, provider, items, addOns, offers, documents, billing, fulfillment, quote, payment, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

