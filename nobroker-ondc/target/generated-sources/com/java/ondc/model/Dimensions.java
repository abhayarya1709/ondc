package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Scalar;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the dimensions of a real-world object
 */
@ApiModel(description = "Describes the dimensions of a real-world object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Dimensions  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("length")
  private Scalar length;

  @JsonProperty("breadth")
  private Scalar breadth;

  @JsonProperty("height")
  private Scalar height;

  public Dimensions length(Scalar length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  */
  @ApiModelProperty(value = "")

  @Valid

  public Scalar getLength() {
    return length;
  }

  public void setLength(Scalar length) {
    this.length = length;
  }

  public Dimensions breadth(Scalar breadth) {
    this.breadth = breadth;
    return this;
  }

  /**
   * Get breadth
   * @return breadth
  */
  @ApiModelProperty(value = "")

  @Valid

  public Scalar getBreadth() {
    return breadth;
  }

  public void setBreadth(Scalar breadth) {
    this.breadth = breadth;
  }

  public Dimensions height(Scalar height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(value = "")

  @Valid

  public Scalar getHeight() {
    return height;
  }

  public void setHeight(Scalar height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.breadth, dimensions.breadth) &&
        Objects.equals(this.height, dimensions.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, breadth, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    breadth: ").append(toIndentedString(breadth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

