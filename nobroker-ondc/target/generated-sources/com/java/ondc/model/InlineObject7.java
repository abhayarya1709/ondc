package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Context;
import com.java.ondc.model.UpdateMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject7
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InlineObject7  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("context")
  private Context context;

  @JsonProperty("message")
  private UpdateMessage message;

  public InlineObject7 context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public InlineObject7 message(UpdateMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UpdateMessage getMessage() {
    return message;
  }

  public void setMessage(UpdateMessage message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(this.context, inlineObject7.context) &&
        Objects.equals(this.message, inlineObject7.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

