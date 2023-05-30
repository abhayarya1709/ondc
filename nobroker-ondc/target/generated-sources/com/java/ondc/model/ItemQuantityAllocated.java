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
 * ItemQuantityAllocated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ItemQuantityAllocated  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("measure")
  private Scalar measure;

  public ItemQuantityAllocated count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * minimum: 0
   * @return count
  */
  @ApiModelProperty(value = "")

@Min(0)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ItemQuantityAllocated measure(Scalar measure) {
    this.measure = measure;
    return this;
  }

  /**
   * Get measure
   * @return measure
  */
  @ApiModelProperty(value = "")

  @Valid

  public Scalar getMeasure() {
    return measure;
  }

  public void setMeasure(Scalar measure) {
    this.measure = measure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemQuantityAllocated itemQuantityAllocated = (ItemQuantityAllocated) o;
    return Objects.equals(this.count, itemQuantityAllocated.count) &&
        Objects.equals(this.measure, itemQuantityAllocated.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, measure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemQuantityAllocated {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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

