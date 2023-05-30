package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Intent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("intent")
  private Intent intent;

  public SearchMessage intent(Intent intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
  */
  @ApiModelProperty(value = "")

  @Valid

  public Intent getIntent() {
    return intent;
  }

  public void setIntent(Intent intent) {
    this.intent = intent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMessage searchMessage = (SearchMessage) o;
    return Objects.equals(this.intent, searchMessage.intent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchMessage {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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

