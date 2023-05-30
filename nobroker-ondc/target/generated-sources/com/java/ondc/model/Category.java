package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Id;
import com.java.ondc.model.Time;
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
 * Describes a category
 */
@ApiModel(description = "Describes a category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Category  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("parent_category_id")
  private Id parentCategoryId = null;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Category id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique id of the category
   * @return id
  */
  @ApiModelProperty(value = "Unique id of the category")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Category parentCategoryId(Id parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    return this;
  }

  /**
   * Get parentCategoryId
   * @return parentCategoryId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Id parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  public Category descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @ApiModelProperty(value = "")

  @Valid

  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }

  public Category time(Time time) {
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

  public Category tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Category putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Describes a tag. This is a simple key-value store which is used to contain extended metadata
   * @return tags
  */
  @ApiModelProperty(value = "Describes a tag. This is a simple key-value store which is used to contain extended metadata")


  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.parentCategoryId, category.parentCategoryId) &&
        Objects.equals(this.descriptor, category.descriptor) &&
        Objects.equals(this.time, category.time) &&
        Objects.equals(this.tags, category.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentCategoryId, descriptor, time, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

