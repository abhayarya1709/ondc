package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer support
 */
@ApiModel(description = "Customer support")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Support  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ORDER("order"),
    
    BILLING("billing"),
    
    FULFILLMENT("fulfillment");

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

  @JsonProperty("channels")
  @Valid
  private Map<String, String> channels = null;

  public Support type(TypeEnum type) {
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

  public Support refId(String refId) {
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

  public Support channels(Map<String, String> channels) {
    this.channels = channels;
    return this;
  }

  public Support putChannelsItem(String key, String channelsItem) {
    if (this.channels == null) {
      this.channels = new HashMap<>();
    }
    this.channels.put(key, channelsItem);
    return this;
  }

  /**
   * Describes a tag. This is a simple key-value store which is used to contain extended metadata
   * @return channels
  */
  @ApiModelProperty(value = "Describes a tag. This is a simple key-value store which is used to contain extended metadata")


  public Map<String, String> getChannels() {
    return channels;
  }

  public void setChannels(Map<String, String> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Support support = (Support) o;
    return Objects.equals(this.type, support.type) &&
        Objects.equals(this.refId, support.refId) &&
        Objects.equals(this.channels, support.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, refId, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Support {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

