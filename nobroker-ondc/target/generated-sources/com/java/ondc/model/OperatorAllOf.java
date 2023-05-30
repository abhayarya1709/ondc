package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.OperatorAllOfExperience;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperatorAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OperatorAllOf  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("experience")
  private OperatorAllOfExperience experience;

  public OperatorAllOf experience(OperatorAllOfExperience experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  @ApiModelProperty(value = "")

  @Valid

  public OperatorAllOfExperience getExperience() {
    return experience;
  }

  public void setExperience(OperatorAllOfExperience experience) {
    this.experience = experience;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorAllOf operatorAllOf = (OperatorAllOf) o;
    return Objects.equals(this.experience, operatorAllOf.experience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorAllOf {\n");
    
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

