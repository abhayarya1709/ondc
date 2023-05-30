package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SupportMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SupportMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ref_id")
  private String refId;

  public SupportMessage refId(String refId) {
    this.refId = refId;
    return this;
  }

  /**
   * ID of the element for which support is needed
   * @return refId
  */
  @ApiModelProperty(value = "ID of the element for which support is needed")


  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportMessage supportMessage = (SupportMessage) o;
    return Objects.equals(this.refId, supportMessage.refId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportMessage {\n");
    
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
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

