package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Agent;
import com.java.ondc.model.Contact;
import com.java.ondc.model.FulfillmentCustomer;
import com.java.ondc.model.FulfillmentEnd;
import com.java.ondc.model.FulfillmentStart;
import com.java.ondc.model.Id;
import com.java.ondc.model.Person;
import com.java.ondc.model.State;
import com.java.ondc.model.Value;
import com.java.ondc.model.Vehicle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes how a single product/service will be rendered/fulfilled to the end customer
 */
@ApiModel(description = "Describes how a single product/service will be rendered/fulfilled to the end customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Fulfillment  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("provider_id")
  private Id providerId = null;

  @JsonProperty("rating")
  private Value rating = null;

  @JsonProperty("state")
  private State state;

  @JsonProperty("tracking")
  private Boolean tracking = false;

  @JsonProperty("customer")
  private FulfillmentCustomer customer;

  @JsonProperty("agent")
  private Agent agent = null;

  @JsonProperty("person")
  private Person person;

  @JsonProperty("contact")
  private Contact contact;

  @JsonProperty("vehicle")
  private Vehicle vehicle;

  @JsonProperty("start")
  private FulfillmentStart start;

  @JsonProperty("end")
  private FulfillmentEnd end;

  @JsonProperty("rateable")
  private Boolean rateable;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Fulfillment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique reference ID to the fulfillment of an order
   * @return id
  */
  @ApiModelProperty(value = "Unique reference ID to the fulfillment of an order")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Fulfillment type(String type) {
    this.type = type;
    return this;
  }

  /**
   * This describes the type of fulfillment
   * @return type
  */
  @ApiModelProperty(value = "This describes the type of fulfillment")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Fulfillment providerId(Id providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Get providerId
   * @return providerId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getProviderId() {
    return providerId;
  }

  public void setProviderId(Id providerId) {
    this.providerId = providerId;
  }

  public Fulfillment rating(Value rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @ApiModelProperty(value = "")

  @Valid

  public Value getRating() {
    return rating;
  }

  public void setRating(Value rating) {
    this.rating = rating;
  }

  public Fulfillment state(State state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Fulfillment tracking(Boolean tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Indicates whether the fulfillment allows tracking
   * @return tracking
  */
  @ApiModelProperty(value = "Indicates whether the fulfillment allows tracking")


  public Boolean getTracking() {
    return tracking;
  }

  public void setTracking(Boolean tracking) {
    this.tracking = tracking;
  }

  public Fulfillment customer(FulfillmentCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty(value = "")

  @Valid

  public FulfillmentCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(FulfillmentCustomer customer) {
    this.customer = customer;
  }

  public Fulfillment agent(Agent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
  */
  @ApiModelProperty(value = "")

  @Valid

  public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  public Fulfillment person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")

  @Valid

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Fulfillment contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @ApiModelProperty(value = "")

  @Valid

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Fulfillment vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
  */
  @ApiModelProperty(value = "")

  @Valid

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Fulfillment start(FulfillmentStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")

  @Valid

  public FulfillmentStart getStart() {
    return start;
  }

  public void setStart(FulfillmentStart start) {
    this.start = start;
  }

  public Fulfillment end(FulfillmentEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

  @Valid

  public FulfillmentEnd getEnd() {
    return end;
  }

  public void setEnd(FulfillmentEnd end) {
    this.end = end;
  }

  public Fulfillment rateable(Boolean rateable) {
    this.rateable = rateable;
    return this;
  }

  /**
   * If the entity can be rated or not
   * @return rateable
  */
  @ApiModelProperty(value = "If the entity can be rated or not")


  public Boolean getRateable() {
    return rateable;
  }

  public void setRateable(Boolean rateable) {
    this.rateable = rateable;
  }

  public Fulfillment tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Fulfillment putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Describes a tag. This is a simple key-value store which is used to contain extended metadata
   * @return tags
  */
  @ApiModelProperty(value = "Describes a tag. This is a simple key-value store which is used to contain extended metadata")


  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fulfillment fulfillment = (Fulfillment) o;
    return Objects.equals(this.id, fulfillment.id) &&
        Objects.equals(this.type, fulfillment.type) &&
        Objects.equals(this.providerId, fulfillment.providerId) &&
        Objects.equals(this.rating, fulfillment.rating) &&
        Objects.equals(this.state, fulfillment.state) &&
        Objects.equals(this.tracking, fulfillment.tracking) &&
        Objects.equals(this.customer, fulfillment.customer) &&
        Objects.equals(this.agent, fulfillment.agent) &&
        Objects.equals(this.person, fulfillment.person) &&
        Objects.equals(this.contact, fulfillment.contact) &&
        Objects.equals(this.vehicle, fulfillment.vehicle) &&
        Objects.equals(this.start, fulfillment.start) &&
        Objects.equals(this.end, fulfillment.end) &&
        Objects.equals(this.rateable, fulfillment.rateable) &&
        Objects.equals(this.tags, fulfillment.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, providerId, rating, state, tracking, customer, agent, person, contact, vehicle, start, end, rateable, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fulfillment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

