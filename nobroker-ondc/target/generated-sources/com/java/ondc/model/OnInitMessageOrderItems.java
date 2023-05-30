package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Id;
import com.java.ondc.model.Selected;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OnInitMessageOrderItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OnInitMessageOrderItems  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Id id = null;

  @JsonProperty("quantity")
  private Selected quantity = null;

  public OnInitMessageOrderItems id(Id id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getId() {
    return id;
  }

  public void setId(Id id) {
    this.id = id;
  }

  public OnInitMessageOrderItems quantity(Selected quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Selected getQuantity() {
    return quantity;
  }

  public void setQuantity(Selected quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnInitMessageOrderItems onInitMessageOrderItems = (OnInitMessageOrderItems) o;
    return Objects.equals(this.id, onInitMessageOrderItems.id) &&
        Objects.equals(this.quantity, onInitMessageOrderItems.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnInitMessageOrderItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

