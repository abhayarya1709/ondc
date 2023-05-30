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
 * Describes a country.
 */
@ApiModel(description = "Describes a country.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Country  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("code")
  private String code;

  public Country name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the country
   * @return name
  */
  @ApiModelProperty(value = "Name of the country")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Country code as per ISO 3166 Alpha-3 code format
   * @return code
  */
  @ApiModelProperty(value = "Country code as per ISO 3166 Alpha-3 code format")


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
    Country country = (Country) o;
    return Objects.equals(this.name, country.name) &&
        Objects.equals(this.code, country.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
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

