package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an add-on
 */
@ApiModel(description = "Describes an add-on")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AddOn  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("price")
  private Price price;

  public AddOn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the add-on. This follows the syntax {item.id}/add-on/{add-on unique id} for item specific add-on OR 
   * @return id
  */
  @ApiModelProperty(value = "ID of the add-on. This follows the syntax {item.id}/add-on/{add-on unique id} for item specific add-on OR ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddOn descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }

  public AddOn price(Price price) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOn addOn = (AddOn) o;
    return Objects.equals(this.id, addOn.id) &&
        Objects.equals(this.descriptor, addOn.descriptor) &&
        Objects.equals(this.price, addOn.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

