package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.java.ondc.model.CancellationSelectedReason;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Option;
import com.java.ondc.model.Policy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the ACK response
 */
@ApiModel(description = "Describes the ACK response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Cancellation  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FULL("full"),
    
    PARTIAL("partial");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("ref_id")
  private String refId;

  @JsonProperty("policies")
  @Valid
  private List<Policy> policies = null;

  @JsonProperty("time")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @JsonProperty("cancelled_by")
  private String cancelledBy;

  @JsonProperty("reasons")
  private Option reasons;

  @JsonProperty("selected_reason")
  private CancellationSelectedReason selectedReason;

  @JsonProperty("additional_description")
  private Descriptor additionalDescription;

  public Cancellation type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Cancellation refId(String refId) {
    this.refId = refId;
    return this;
  }

  /**
   * Get refId
   * @return refId
  */
  @ApiModelProperty(value = "")


  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public Cancellation policies(List<Policy> policies) {
    this.policies = policies;
    return this;
  }

  public Cancellation addPoliciesItem(Policy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Policy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }

  public Cancellation time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Cancellation cancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
    return this;
  }

  /**
   * Get cancelledBy
   * @return cancelledBy
  */
  @ApiModelProperty(value = "")


  public String getCancelledBy() {
    return cancelledBy;
  }

  public void setCancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
  }

  public Cancellation reasons(Option reasons) {
    this.reasons = reasons;
    return this;
  }

  /**
   * Get reasons
   * @return reasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public Option getReasons() {
    return reasons;
  }

  public void setReasons(Option reasons) {
    this.reasons = reasons;
  }

  public Cancellation selectedReason(CancellationSelectedReason selectedReason) {
    this.selectedReason = selectedReason;
    return this;
  }

  /**
   * Get selectedReason
   * @return selectedReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public CancellationSelectedReason getSelectedReason() {
    return selectedReason;
  }

  public void setSelectedReason(CancellationSelectedReason selectedReason) {
    this.selectedReason = selectedReason;
  }

  public Cancellation additionalDescription(Descriptor additionalDescription) {
    this.additionalDescription = additionalDescription;
    return this;
  }

  /**
   * Get additionalDescription
   * @return additionalDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getAdditionalDescription() {
    return additionalDescription;
  }

  public void setAdditionalDescription(Descriptor additionalDescription) {
    this.additionalDescription = additionalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cancellation cancellation = (Cancellation) o;
    return Objects.equals(this.type, cancellation.type) &&
        Objects.equals(this.refId, cancellation.refId) &&
        Objects.equals(this.policies, cancellation.policies) &&
        Objects.equals(this.time, cancellation.time) &&
        Objects.equals(this.cancelledBy, cancellation.cancelledBy) &&
        Objects.equals(this.reasons, cancellation.reasons) &&
        Objects.equals(this.selectedReason, cancellation.selectedReason) &&
        Objects.equals(this.additionalDescription, cancellation.additionalDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, refId, policies, time, cancelledBy, reasons, selectedReason, additionalDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cancellation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    cancelledBy: ").append(toIndentedString(cancelledBy)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    selectedReason: ").append(toIndentedString(selectedReason)).append("\n");
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
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

