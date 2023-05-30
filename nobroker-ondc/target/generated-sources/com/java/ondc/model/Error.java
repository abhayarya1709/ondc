package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an error object
 */
@ApiModel(description = "Describes an error object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Error  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CONTEXT_ERROR("CONTEXT-ERROR"),
    
    CORE_ERROR("CORE-ERROR"),
    
    DOMAIN_ERROR("DOMAIN-ERROR"),
    
    POLICY_ERROR("POLICY-ERROR"),
    
    JSON_SCHEMA_ERROR("JSON-SCHEMA-ERROR");

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

  @JsonProperty("code")
  private String code;

  @JsonProperty("path")
  private String path;

  @JsonProperty("message")
  private String message;

  public Error type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * ONDC specific error code. For full list of error codes, refer to docs/drafts/Error Codes.md of this repo
   * @return code
  */
  @ApiModelProperty(required = true, value = "ONDC specific error code. For full list of error codes, refer to docs/drafts/Error Codes.md of this repo")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to json schema generating the error. Used only during json schema validation errors
   * @return path
  */
  @ApiModelProperty(value = "Path to json schema generating the error. Used only during json schema validation errors")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human readable message describing the error
   * @return message
  */
  @ApiModelProperty(value = "Human readable message describing the error")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.path, error.path) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, path, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

