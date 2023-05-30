package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Tracking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OnTrackMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OnTrackMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("tracking")
  private Tracking tracking;

  public OnTrackMessage tracking(Tracking tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Get tracking
   * @return tracking
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Tracking getTracking() {
    return tracking;
  }

  public void setTracking(Tracking tracking) {
    this.tracking = tracking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnTrackMessage onTrackMessage = (OnTrackMessage) o;
    return Objects.equals(this.tracking, onTrackMessage.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnTrackMessage {\n");
    
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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

