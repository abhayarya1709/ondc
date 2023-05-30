package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.java.ondc.model.Time;
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
 * Describes a payment
 */
@ApiModel(description = "Describes a payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Payment  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uri")
  private URI uri;

  /**
   * Gets or Sets tlMethod
   */
  public enum TlMethodEnum {
    HTTP_GET("http/get"),
    
    HTTP_POST("http/post"),
    
    PAYTO("payto"),
    
    UPI("upi");

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ON_ORDER("ON-ORDER"),
    
    PRE_FULFILLMENT("PRE-FULFILLMENT"),
    
    ON_FULFILLMENT("ON-FULFILLMENT"),
    
    POST_FULFILLMENT("POST-FULFILLMENT");

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

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PAID("PAID"),
    
    NOT_PAID("NOT-PAID");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("time")
  private Time time;

  /**
   * Gets or Sets collectedBy
   */
  public enum CollectedByEnum {
    BAP("BAP"),
    
    BPP("BPP");

    private String value;

    CollectedByEnum(String value) {
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
    public static CollectedByEnum fromValue(String value) {
      for (CollectedByEnum b : CollectedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("collected_by")
  private CollectedByEnum collectedBy;

  public Payment uri(URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * A payment uri to be called by the Buyer App. If empty, then the payment is to be done offline. The details of payment should be present in the params object. If ```tl_method``` = http/get, then the payment details will be sent as url params. Two url param values, ```$transaction_id``` and ```$amount``` are mandatory. And example url would be : https://www.example.com/pay?txid=$transaction_id&amount=$amount&vpa=upiid&payee=shopez&billno=1234
   * @return uri
  */
  @ApiModelProperty(value = "A payment uri to be called by the Buyer App. If empty, then the payment is to be done offline. The details of payment should be present in the params object. If ```tl_method``` = http/get, then the payment details will be sent as url params. Two url param values, ```$transaction_id``` and ```$amount``` are mandatory. And example url would be : https://www.example.com/pay?txid=$transaction_id&amount=$amount&vpa=upiid&payee=shopez&billno=1234")

  @Valid

  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public Payment tlMethod(TlMethodEnum tlMethod) {
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

  public Payment params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public Payment putParamsItem(String key, String paramsItem) {
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

  public Payment type(TypeEnum type) {
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

  public Payment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Payment time(Time time) {
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

  public Payment collectedBy(CollectedByEnum collectedBy) {
    this.collectedBy = collectedBy;
    return this;
  }

  /**
   * Get collectedBy
   * @return collectedBy
  */
  @ApiModelProperty(value = "")


  public CollectedByEnum getCollectedBy() {
    return collectedBy;
  }

  public void setCollectedBy(CollectedByEnum collectedBy) {
    this.collectedBy = collectedBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.uri, payment.uri) &&
        Objects.equals(this.tlMethod, payment.tlMethod) &&
        Objects.equals(this.params, payment.params) &&
        Objects.equals(this.type, payment.type) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.time, payment.time) &&
        Objects.equals(this.collectedBy, payment.collectedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, tlMethod, params, type, status, time, collectedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    tlMethod: ").append(toIndentedString(tlMethod)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    collectedBy: ").append(toIndentedString(collectedBy)).append("\n");
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

