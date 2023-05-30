package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes how a feedback URL will be sent by the Seller App
 */
@ApiModel(description = "Describes how a feedback URL will be sent by the Seller App")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedbackUrl  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("url")
  private URI url;

  /**
   * Gets or Sets tlMethod
   */
  public enum TlMethodEnum {
    GET("http/get"),
    
    POST("http/post");

    private String value;

    TlMethodEnum(String value) {
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
    public static TlMethodEnum fromValue(String value) {
      for (TlMethodEnum b : TlMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tl_method")
  private TlMethodEnum tlMethod;

  @JsonProperty("params")
  @Valid
  private Map<String, String> params = null;

  public FeedbackUrl url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * feedback URL sent by the Seller App
   * @return url
  */
  @ApiModelProperty(value = "feedback URL sent by the Seller App")

  @Valid

  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public FeedbackUrl tlMethod(TlMethodEnum tlMethod) {
    this.tlMethod = tlMethod;
    return this;
  }

  /**
   * Get tlMethod
   * @return tlMethod
  */
  @ApiModelProperty(value = "")


  public TlMethodEnum getTlMethod() {
    return tlMethod;
  }

  public void setTlMethod(TlMethodEnum tlMethod) {
    this.tlMethod = tlMethod;
  }

  public FeedbackUrl params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public FeedbackUrl putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = ;
    }
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
  */
  @ApiModelProperty(value = "")


  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackUrl feedbackUrl = (FeedbackUrl) o;
    return Objects.equals(this.url, feedbackUrl.url) &&
        Objects.equals(this.tlMethod, feedbackUrl.tlMethod) &&
        Objects.equals(this.params, feedbackUrl.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, tlMethod, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tlMethod: ").append(toIndentedString(tlMethod)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

