package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.RatingCategory;
import com.java.ondc.model.Value;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetFeedbackFormMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GetFeedbackFormMessage  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rating_value")
  private Value ratingValue = null;

  @JsonProperty("rating_category")
  private RatingCategory ratingCategory = null;

  public GetFeedbackFormMessage ratingValue(Value ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * Get ratingValue
   * @return ratingValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public Value getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(Value ratingValue) {
    this.ratingValue = ratingValue;
  }

  public GetFeedbackFormMessage ratingCategory(RatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
    return this;
  }

  /**
   * Get ratingCategory
   * @return ratingCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public RatingCategory getRatingCategory() {
    return ratingCategory;
  }

  public void setRatingCategory(RatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedbackFormMessage getFeedbackFormMessage = (GetFeedbackFormMessage) o;
    return Objects.equals(this.ratingValue, getFeedbackFormMessage.ratingValue) &&
        Objects.equals(this.ratingCategory, getFeedbackFormMessage.ratingCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingValue, ratingCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedbackFormMessage {\n");
    
    sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
    sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
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

