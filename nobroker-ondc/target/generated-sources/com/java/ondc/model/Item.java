package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Id;
import com.java.ondc.model.Price;
import com.java.ondc.model.Time;
import com.java.ondc.model.Value;
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
 * Describes a product or a service offered to the end consumer by the provider.
 */
@ApiModel(description = "Describes a product or a service offered to the end consumer by the provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Item  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("parent_item_id")
  private Id parentItemId = null;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("price")
  private Price price;

  @JsonProperty("category_id")
  private Id categoryId = null;

  @JsonProperty("fulfillment_id")
  private Id fulfillmentId = null;

  @JsonProperty("rating")
  private Value rating = null;

  @JsonProperty("location_id")
  private Id locationId = null;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("rateable")
  private Boolean rateable;

  @JsonProperty("matched")
  private Boolean matched;

  @JsonProperty("related")
  private Boolean related;

  @JsonProperty("recommended")
  private Boolean recommended;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This is the most unique identifier of a service item. An example of an Item ID could be the SKU of a product.
   * @return id
  */
  @ApiModelProperty(value = "This is the most unique identifier of a service item. An example of an Item ID could be the SKU of a product.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item parentItemId(Id parentItemId) {
    this.parentItemId = parentItemId;
    return this;
  }

  /**
   * Get parentItemId
   * @return parentItemId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getParentItemId() {
    return parentItemId;
  }

  public void setParentItemId(Id parentItemId) {
    this.parentItemId = parentItemId;
  }

  public Item descriptor(Descriptor descriptor) {
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

  public Item price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Item categoryId(Id categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Id categoryId) {
    this.categoryId = categoryId;
  }

  public Item fulfillmentId(Id fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
    return this;
  }

  /**
   * Get fulfillmentId
   * @return fulfillmentId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getFulfillmentId() {
    return fulfillmentId;
  }

  public void setFulfillmentId(Id fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
  }

  public Item rating(Value rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @ApiModelProperty(value = "")

  @Valid

  public Value getRating() {
    return rating;
  }

  public void setRating(Value rating) {
    this.rating = rating;
  }

  public Item locationId(Id locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getLocationId() {
    return locationId;
  }

  public void setLocationId(Id locationId) {
    this.locationId = locationId;
  }

  public Item time(Time time) {
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

  public Item rateable(Boolean rateable) {
    this.rateable = rateable;
    return this;
  }

  /**
   * If the entity can be rated or not
   * @return rateable
  */
  @ApiModelProperty(value = "If the entity can be rated or not")


  public Boolean getRateable() {
    return rateable;
  }

  public void setRateable(Boolean rateable) {
    this.rateable = rateable;
  }

  public Item matched(Boolean matched) {
    this.matched = matched;
    return this;
  }

  /**
   * Get matched
   * @return matched
  */
  @ApiModelProperty(value = "")


  public Boolean getMatched() {
    return matched;
  }

  public void setMatched(Boolean matched) {
    this.matched = matched;
  }

  public Item related(Boolean related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
  */
  @ApiModelProperty(value = "")


  public Boolean getRelated() {
    return related;
  }

  public void setRelated(Boolean related) {
    this.related = related;
  }

  public Item recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Get recommended
   * @return recommended
  */
  @ApiModelProperty(value = "")


  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public Item tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Item putTagsItem(String key, String tagsItem) {
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
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.parentItemId, item.parentItemId) &&
        Objects.equals(this.descriptor, item.descriptor) &&
        Objects.equals(this.price, item.price) &&
        Objects.equals(this.categoryId, item.categoryId) &&
        Objects.equals(this.fulfillmentId, item.fulfillmentId) &&
        Objects.equals(this.rating, item.rating) &&
        Objects.equals(this.locationId, item.locationId) &&
        Objects.equals(this.time, item.time) &&
        Objects.equals(this.rateable, item.rateable) &&
        Objects.equals(this.matched, item.matched) &&
        Objects.equals(this.related, item.related) &&
        Objects.equals(this.recommended, item.recommended) &&
        Objects.equals(this.tags, item.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentItemId, descriptor, price, categoryId, fulfillmentId, rating, locationId, time, rateable, matched, related, recommended, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    fulfillmentId: ").append(toIndentedString(fulfillmentId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
    sb.append("    matched: ").append(toIndentedString(matched)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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

