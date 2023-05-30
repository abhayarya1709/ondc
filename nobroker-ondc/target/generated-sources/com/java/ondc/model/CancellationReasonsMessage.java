package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Option;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancellationReasonsMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CancellationReasonsMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cancellation_reasons")
  @Valid
  private List<Option> cancellationReasons = null;

  public CancellationReasonsMessage cancellationReasons(List<Option> cancellationReasons) {
    this.cancellationReasons = cancellationReasons;
    return this;
  }

  public CancellationReasonsMessage addCancellationReasonsItem(Option cancellationReasonsItem) {
    if (this.cancellationReasons == null) {
      this.cancellationReasons = new ArrayList<>();
    }
    this.cancellationReasons.add(cancellationReasonsItem);
    return this;
  }

  /**
   * Get cancellationReasons
   * @return cancellationReasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Option> getCancellationReasons() {
    return cancellationReasons;
  }

  public void setCancellationReasons(List<Option> cancellationReasons) {
    this.cancellationReasons = cancellationReasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationReasonsMessage cancellationReasonsMessage = (CancellationReasonsMessage) o;
    return Objects.equals(this.cancellationReasons, cancellationReasonsMessage.cancellationReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationReasonsMessage {\n");
    
    sb.append("    cancellationReasons: ").append(toIndentedString(cancellationReasons)).append("\n");
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

