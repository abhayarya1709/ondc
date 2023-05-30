package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrackMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TrackMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("order_id")
  private Id orderId = null;

  @JsonProperty("callback_url")
  private URI callbackUrl;

  public TrackMessage orderId(Id orderId) {
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

  public TrackMessage callbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Get callbackUrl
   * @return callbackUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public URI getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackMessage trackMessage = (TrackMessage) o;
    return Objects.equals(this.orderId, trackMessage.orderId) &&
        Objects.equals(this.callbackUrl, trackMessage.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackMessage {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

