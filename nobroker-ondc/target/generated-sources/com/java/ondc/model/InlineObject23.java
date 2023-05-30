package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Context;
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
 * InlineObject23
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InlineObject23  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("context")
  private Context context;

  @JsonProperty("return_reasons")
  @Valid
  private List<Option> returnReasons = null;

  public InlineObject23 context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @ApiModelProperty(value = "")

  @Valid

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public InlineObject23 returnReasons(List<Option> returnReasons) {
    this.returnReasons = returnReasons;
    return this;
  }

  public InlineObject23 addReturnReasonsItem(Option returnReasonsItem) {
    if (this.returnReasons == null) {
      this.returnReasons = new ArrayList<>();
    }
    this.returnReasons.add(returnReasonsItem);
    return this;
  }

  /**
   * Get returnReasons
   * @return returnReasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Option> getReturnReasons() {
    return returnReasons;
  }

  public void setReturnReasons(List<Option> returnReasons) {
    this.returnReasons = returnReasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject23 inlineObject23 = (InlineObject23) o;
    return Objects.equals(this.context, inlineObject23.context) &&
        Objects.equals(this.returnReasons, inlineObject23.returnReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, returnReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject23 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    returnReasons: ").append(toIndentedString(returnReasons)).append("\n");
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

