package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.FeedbackFormElement;
import com.java.ondc.model.FeedbackId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the rating of a person or an object.
 */
@ApiModel(description = "Describes the rating of a person or an object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Rating  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rating_category")
  private String ratingCategory;

  @JsonProperty("id")
  private String id;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("feedback_form")
  @Valid
  private List<FeedbackFormElement> feedbackForm = null;

  @JsonProperty("feedback_id")
  private FeedbackId feedbackId = null;

  public Rating ratingCategory(String ratingCategory) {
    this.ratingCategory = ratingCategory;
    return this;
  }

  /**
   * Category of the object being rated
   * @return ratingCategory
  */
  @ApiModelProperty(value = "Category of the object being rated")


  public String getRatingCategory() {
    return ratingCategory;
  }

  public void setRatingCategory(String ratingCategory) {
    this.ratingCategory = ratingCategory;
  }

  public Rating id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the object being rated
   * @return id
  */
  @ApiModelProperty(value = "Id of the object being rated")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rating value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Rating value given to the object
   * minimum: 0
   * @return value
  */
  @ApiModelProperty(value = "Rating value given to the object")

  @Valid
@DecimalMin("0")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Rating feedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
    return this;
  }

  public Rating addFeedbackFormItem(FeedbackFormElement feedbackFormItem) {
    if (this.feedbackForm == null) {
      this.feedbackForm = new ArrayList<>();
    }
    this.feedbackForm.add(feedbackFormItem);
    return this;
  }

  /**
   * Describes a feedback form that a Seller App can send to get feedback from the Buyer App
   * @return feedbackForm
  */
  @ApiModelProperty(value = "Describes a feedback form that a Seller App can send to get feedback from the Buyer App")

  @Valid

  public List<FeedbackFormElement> getFeedbackForm() {
    return feedbackForm;
  }

  public void setFeedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
  }

  public Rating feedbackId(FeedbackId feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Get feedbackId
   * @return feedbackId
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedbackId getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(FeedbackId feedbackId) {
    this.feedbackId = feedbackId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.ratingCategory, rating.ratingCategory) &&
        Objects.equals(this.id, rating.id) &&
        Objects.equals(this.value, rating.value) &&
        Objects.equals(this.feedbackForm, rating.feedbackForm) &&
        Objects.equals(this.feedbackId, rating.feedbackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingCategory, id, value, feedbackForm, feedbackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
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

