package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Ack;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200Message
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InlineResponse200Message  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ack")
  private Ack ack;

  public InlineResponse200Message ack(Ack ack) {
    this.ack = ack;
    return this;
  }

  /**
   * Get ack
   * @return ack
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Ack getAck() {
    return ack;
  }

  public void setAck(Ack ack) {
    this.ack = ack;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Message inlineResponse200Message = (InlineResponse200Message) o;
    return Objects.equals(this.ack, inlineResponse200Message.ack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Message {\n");
    
    sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
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

