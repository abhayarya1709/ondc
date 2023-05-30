package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Context;
import com.java.ondc.model.RatingCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject27
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InlineObject27  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("context")
  private Context context;

  @JsonProperty("feedback_categories")
  @Valid
  private List<RatingCategory> feedbackCategories = null;

  public InlineObject27 context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @ApiModelProperty(value = "")

  @Valid

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public InlineObject27 feedbackCategories(List<RatingCategory> feedbackCategories) {
    this.feedbackCategories = feedbackCategories;
    return this;
  }

  public InlineObject27 addFeedbackCategoriesItem(RatingCategory feedbackCategoriesItem) {
    if (this.feedbackCategories == null) {
      this.feedbackCategories = new ArrayList<>();
    }
    this.feedbackCategories.add(feedbackCategoriesItem);
    return this;
  }

  /**
   * Get feedbackCategories
   * @return feedbackCategories
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RatingCategory> getFeedbackCategories() {
    return feedbackCategories;
  }

  public void setFeedbackCategories(List<RatingCategory> feedbackCategories) {
    this.feedbackCategories = feedbackCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject27 inlineObject27 = (InlineObject27) o;
    return Objects.equals(this.context, inlineObject27.context) &&
        Objects.equals(this.feedbackCategories, inlineObject27.feedbackCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, feedbackCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject27 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    feedbackCategories: ").append(toIndentedString(feedbackCategories)).append("\n");
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

