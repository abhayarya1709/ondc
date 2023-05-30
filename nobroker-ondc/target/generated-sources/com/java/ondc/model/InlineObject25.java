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
 * InlineObject25
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InlineObject25  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("context")
  private Context context;

  @JsonProperty("rating_categories")
  @Valid
  private List<RatingCategory> ratingCategories = null;

  public InlineObject25 context(Context context) {
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

  public InlineObject25 ratingCategories(List<RatingCategory> ratingCategories) {
    this.ratingCategories = ratingCategories;
    return this;
  }

  public InlineObject25 addRatingCategoriesItem(RatingCategory ratingCategoriesItem) {
    if (this.ratingCategories == null) {
      this.ratingCategories = new ArrayList<>();
    }
    this.ratingCategories.add(ratingCategoriesItem);
    return this;
  }

  /**
   * Get ratingCategories
   * @return ratingCategories
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RatingCategory> getRatingCategories() {
    return ratingCategories;
  }

  public void setRatingCategories(List<RatingCategory> ratingCategories) {
    this.ratingCategories = ratingCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject25 inlineObject25 = (InlineObject25) o;
    return Objects.equals(this.context, inlineObject25.context) &&
        Objects.equals(this.ratingCategories, inlineObject25.ratingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, ratingCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject25 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    ratingCategories: ").append(toIndentedString(ratingCategories)).append("\n");
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

