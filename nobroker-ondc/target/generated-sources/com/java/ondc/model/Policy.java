package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Id;
import com.java.ondc.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a policy. Allows for domain extension.
 */
@ApiModel(description = "Describes a policy. Allows for domain extension.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Policy  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("parent_policy_id")
  private Id parentPolicyId = null;

  @JsonProperty("time")
  private Time time;

  public Policy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Policy descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }

  public Policy parentPolicyId(Id parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
    return this;
  }

  /**
   * Get parentPolicyId
   * @return parentPolicyId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getParentPolicyId() {
    return parentPolicyId;
  }

  public void setParentPolicyId(Id parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
  }

  public Policy time(Time time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.descriptor, policy.descriptor) &&
        Objects.equals(this.parentPolicyId, policy.parentPolicyId) &&
        Objects.equals(this.time, policy.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, parentPolicyId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    parentPolicyId: ").append(toIndentedString(parentPolicyId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

