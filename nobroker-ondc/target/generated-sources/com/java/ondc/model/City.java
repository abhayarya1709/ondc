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
 * Describes a city
 */
@ApiModel(description = "Describes a city")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class City  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("code")
  private String code;

  public City name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the city
   * @return name
  */
  @ApiModelProperty(value = "Name of the city")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public City code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Codification of city code will be using the std code of the city e.g. for Bengaluru, city code is 'std:080'
   * @return code
  */
  @ApiModelProperty(value = "Codification of city code will be using the std code of the city e.g. for Bengaluru, city code is 'std:080'")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.name, city.name) &&
        Objects.equals(this.code, city.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

