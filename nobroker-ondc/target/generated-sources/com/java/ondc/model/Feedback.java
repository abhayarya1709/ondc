package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.FeedbackFormElement;
import com.java.ondc.model.FeedbackUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Feedback for a service
 */
@ApiModel(description = "Feedback for a service")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Feedback  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("feedback_form")
  @Valid
  private List<FeedbackFormElement> feedbackForm = null;

  @JsonProperty("feedback_url")
  private FeedbackUrl feedbackUrl;

  public Feedback feedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
    return this;
  }

  public Feedback addFeedbackFormItem(FeedbackFormElement feedbackFormItem) {
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

  public Feedback feedbackUrl(FeedbackUrl feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
    return this;
  }

  /**
   * Get feedbackUrl
   * @return feedbackUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedbackUrl getFeedbackUrl() {
    return feedbackUrl;
  }

  public void setFeedbackUrl(FeedbackUrl feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.feedbackForm, feedback.feedbackForm) &&
        Objects.equals(this.feedbackUrl, feedback.feedbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackForm, feedbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
    sb.append("    feedbackUrl: ").append(toIndentedString(feedbackUrl)).append("\n");
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

