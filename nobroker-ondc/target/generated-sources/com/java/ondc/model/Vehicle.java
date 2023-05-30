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
 * Describes the properties of a vehicle used in a mobility service
 */
@ApiModel(description = "Describes the properties of a vehicle used in a mobility service")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Vehicle  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("category")
  private String category;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("make")
  private String make;

  @JsonProperty("model")
  private String model;

  @JsonProperty("size")
  private String size;

  @JsonProperty("variant")
  private String variant;

  @JsonProperty("color")
  private String color;

  @JsonProperty("energy_type")
  private String energyType;

  @JsonProperty("registration")
  private String registration;

  public Vehicle category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Vehicle capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  @ApiModelProperty(value = "")


  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Vehicle make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  */
  @ApiModelProperty(value = "")


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Vehicle model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @ApiModelProperty(value = "")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicle size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(value = "")


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Vehicle variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
  */
  @ApiModelProperty(value = "")


  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public Vehicle color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  @ApiModelProperty(value = "")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Vehicle energyType(String energyType) {
    this.energyType = energyType;
    return this;
  }

  /**
   * Get energyType
   * @return energyType
  */
  @ApiModelProperty(value = "")


  public String getEnergyType() {
    return energyType;
  }

  public void setEnergyType(String energyType) {
    this.energyType = energyType;
  }

  public Vehicle registration(String registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Get registration
   * @return registration
  */
  @ApiModelProperty(value = "")


  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.category, vehicle.category) &&
        Objects.equals(this.capacity, vehicle.capacity) &&
        Objects.equals(this.make, vehicle.make) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.size, vehicle.size) &&
        Objects.equals(this.variant, vehicle.variant) &&
        Objects.equals(this.color, vehicle.color) &&
        Objects.equals(this.energyType, vehicle.energyType) &&
        Objects.equals(this.registration, vehicle.registration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, capacity, make, model, size, variant, color, energyType, registration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    energyType: ").append(toIndentedString(energyType)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
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

