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
 * Describes a circular area on the map
 */
@ApiModel(description = "Describes a circular area on the map")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Circle  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("gps")
  private String gps;

  @JsonProperty("radius")
  private Scalar radius;

  public Circle gps(String gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Describes a gps coordinate
   * @return gps
  */
  @ApiModelProperty(required = true, value = "Describes a gps coordinate")
  @NotNull

@Pattern(regexp="^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$") 
  public String getGps() {
    return gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public Circle radius(Scalar radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Get radius
   * @return radius
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Scalar getRadius() {
    return radius;
  }

  public void setRadius(Scalar radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Circle circle = (Circle) o;
    return Objects.equals(this.gps, circle.gps) &&
        Objects.equals(this.radius, circle.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gps, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Circle {\n");
    
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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

