package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("update_target")
  private String updateTarget;

  @JsonProperty("order")
  private Order order;

  public UpdateMessage updateTarget(String updateTarget) {
    this.updateTarget = updateTarget;
    return this;
  }

  /**
   * Comma separated values of order objects being updated. For example: ```\"update_target\":\"item,billing,fulfillment\"```
   * @return updateTarget
  */
  @ApiModelProperty(required = true, value = "Comma separated values of order objects being updated. For example: ```\"update_target\":\"item,billing,fulfillment\"```")
  @NotNull


  public String getUpdateTarget() {
    return updateTarget;
  }

  public void setUpdateTarget(String updateTarget) {
    this.updateTarget = updateTarget;
  }

  public UpdateMessage order(Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMessage updateMessage = (UpdateMessage) o;
    return Objects.equals(this.updateTarget, updateMessage.updateTarget) &&
        Objects.equals(this.order, updateMessage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateTarget, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMessage {\n");
    
    sb.append("    updateTarget: ").append(toIndentedString(updateTarget)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

