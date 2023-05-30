package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancelMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CancelMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("order_id")
  private Id orderId = null;

  @JsonProperty("cancellation_reason_id")
  private Id cancellationReasonId = null;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  public CancelMessage orderId(Id orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Id getOrderId() {
    return orderId;
  }

  public void setOrderId(Id orderId) {
    this.orderId = orderId;
  }

  public CancelMessage cancellationReasonId(Id cancellationReasonId) {
    this.cancellationReasonId = cancellationReasonId;
    return this;
  }

  /**
   * Get cancellationReasonId
   * @return cancellationReasonId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getCancellationReasonId() {
    return cancellationReasonId;
  }

  public void setCancellationReasonId(Id cancellationReasonId) {
    this.cancellationReasonId = cancellationReasonId;
  }

  public CancelMessage descriptor(Descriptor descriptor) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelMessage cancelMessage = (CancelMessage) o;
    return Objects.equals(this.orderId, cancelMessage.orderId) &&
        Objects.equals(this.cancellationReasonId, cancelMessage.cancellationReasonId) &&
        Objects.equals(this.descriptor, cancelMessage.descriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, cancellationReasonId, descriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelMessage {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cancellationReasonId: ").append(toIndentedString(cancellationReasonId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

