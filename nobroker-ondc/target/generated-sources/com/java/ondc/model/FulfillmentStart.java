package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Authorization;
import com.java.ondc.model.Contact;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Location;
import com.java.ondc.model.Person;
import com.java.ondc.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details on the start of fulfillment
 */
@ApiModel(description = "Details on the start of fulfillment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FulfillmentStart  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("location")
  private Location location;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("instructions")
  private Descriptor instructions;

  @JsonProperty("contact")
  private Contact contact;

  @JsonProperty("person")
  private Person person;

  @JsonProperty("authorization")
  private Authorization authorization;

  public FulfillmentStart location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public FulfillmentStart time(Time time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public FulfillmentStart instructions(Descriptor instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Get instructions
   * @return instructions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getInstructions() {
    return instructions;
  }

  public void setInstructions(Descriptor instructions) {
    this.instructions = instructions;
  }

  public FulfillmentStart contact(Contact contact) {
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

  public FulfillmentStart person(Person person) {
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

  public FulfillmentStart authorization(Authorization authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * Get authorization
   * @return authorization
  */
  @ApiModelProperty(value = "")

  @Valid

  public Authorization getAuthorization() {
    return authorization;
  }

  public void setAuthorization(Authorization authorization) {
    this.authorization = authorization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentStart fulfillmentStart = (FulfillmentStart) o;
    return Objects.equals(this.location, fulfillmentStart.location) &&
        Objects.equals(this.time, fulfillmentStart.time) &&
        Objects.equals(this.instructions, fulfillmentStart.instructions) &&
        Objects.equals(this.contact, fulfillmentStart.contact) &&
        Objects.equals(this.person, fulfillmentStart.person) &&
        Objects.equals(this.authorization, fulfillmentStart.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, time, instructions, contact, person, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStart {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

