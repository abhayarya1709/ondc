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
 * Describes an address
 */
@ApiModel(description = "Describes an address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Address  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("door")
  private String door;

  @JsonProperty("name")
  private String name;

  @JsonProperty("building")
  private String building;

  @JsonProperty("street")
  private String street;

  @JsonProperty("locality")
  private String locality;

  @JsonProperty("ward")
  private String ward;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("area_code")
  private String areaCode;

  public Address door(String door) {
    this.door = door;
    return this;
  }

  /**
   * Door / Shop number of the address
   * @return door
  */
  @ApiModelProperty(value = "Door / Shop number of the address")


  public String getDoor() {
    return door;
  }

  public void setDoor(String door) {
    this.door = door;
  }

  public Address name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of address if applicable. Example, shop name
   * @return name
  */
  @ApiModelProperty(value = "Name of address if applicable. Example, shop name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Name of the building or block
   * @return building
  */
  @ApiModelProperty(value = "Name of the building or block")


  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street name or number
   * @return street
  */
  @ApiModelProperty(value = "Street name or number")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Name of the locality, apartments
   * @return locality
  */
  @ApiModelProperty(value = "Name of the locality, apartments")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Address ward(String ward) {
    this.ward = ward;
    return this;
  }

  /**
   * Name or number of the ward if applicable
   * @return ward
  */
  @ApiModelProperty(value = "Name or number of the ward if applicable")


  public String getWard() {
    return ward;
  }

  public void setWard(String ward) {
    this.ward = ward;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  */
  @ApiModelProperty(value = "City name")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State name
   * @return state
  */
  @ApiModelProperty(value = "State name")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country name
   * @return country
  */
  @ApiModelProperty(value = "Country name")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Area code. This can be Pincode, ZIP code or any equivalent
   * @return areaCode
  */
  @ApiModelProperty(value = "Area code. This can be Pincode, ZIP code or any equivalent")


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.door, address.door) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.building, address.building) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.locality, address.locality) &&
        Objects.equals(this.ward, address.ward) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.areaCode, address.areaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(door, name, building, street, locality, ward, city, state, country, areaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    door: ").append(toIndentedString(door)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    ward: ").append(toIndentedString(ward)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

