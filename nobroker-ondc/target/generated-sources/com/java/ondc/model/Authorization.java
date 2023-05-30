package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an authorization mechanism
 */
@ApiModel(description = "Describes an authorization mechanism")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Authorization  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private String type;

  @JsonProperty("token")
  private String token;

  @JsonProperty("valid_from")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validFrom;

  @JsonProperty("valid_to")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validTo;

  @JsonProperty("status")
  private String status;

  public Authorization type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of authorization mechanism used
   * @return type
  */
  @ApiModelProperty(value = "Type of authorization mechanism used")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Authorization token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token used for authorization
   * @return token
  */
  @ApiModelProperty(value = "Token used for authorization")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Authorization validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Timestamp in RFC3339 format from which token is valid
   * @return validFrom
  */
  @ApiModelProperty(value = "Timestamp in RFC3339 format from which token is valid")

  @Valid

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public Authorization validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Timestamp in RFC3339 format until which token is valid
   * @return validTo
  */
  @ApiModelProperty(value = "Timestamp in RFC3339 format until which token is valid")

  @Valid

  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public Authorization status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the token
   * @return status
  */
  @ApiModelProperty(value = "Status of the token")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.type, authorization.type) &&
        Objects.equals(this.token, authorization.token) &&
        Objects.equals(this.validFrom, authorization.validFrom) &&
        Objects.equals(this.validTo, authorization.validTo) &&
        Objects.equals(this.status, authorization.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, validFrom, validTo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

