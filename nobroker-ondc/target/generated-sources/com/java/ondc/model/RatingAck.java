package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RatingAck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RatingAck  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("feedback_ack")
  private Boolean feedbackAck;

  @JsonProperty("rating_ack")
  private Boolean ratingAck;

  public RatingAck feedbackAck(Boolean feedbackAck) {
    this.feedbackAck = feedbackAck;
    return this;
  }

  /**
   * If feedback has been recorded or not
   * @return feedbackAck
  */
  @ApiModelProperty(value = "If feedback has been recorded or not")


  public Boolean getFeedbackAck() {
    return feedbackAck;
  }

  public void setFeedbackAck(Boolean feedbackAck) {
    this.feedbackAck = feedbackAck;
  }

  public RatingAck ratingAck(Boolean ratingAck) {
    this.ratingAck = ratingAck;
    return this;
  }

  /**
   * If rating has been recorded or not
   * @return ratingAck
  */
  @ApiModelProperty(value = "If rating has been recorded or not")


  public Boolean getRatingAck() {
    return ratingAck;
  }

  public void setRatingAck(Boolean ratingAck) {
    this.ratingAck = ratingAck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingAck ratingAck = (RatingAck) o;
    return Objects.equals(this.feedbackAck, ratingAck.feedbackAck) &&
        Objects.equals(this.ratingAck, ratingAck.ratingAck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackAck, ratingAck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingAck {\n");
    
    sb.append("    feedbackAck: ").append(toIndentedString(feedbackAck)).append("\n");
    sb.append("    ratingAck: ").append(toIndentedString(ratingAck)).append("\n");
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

