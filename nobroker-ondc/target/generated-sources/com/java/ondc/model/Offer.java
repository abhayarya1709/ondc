package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Id;
import com.java.ondc.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an offer
 */
@ApiModel(description = "Describes an offer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Offer  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("location_ids")
  @Valid
  private List<Id> locationIds = null;

  @JsonProperty("category_ids")
  @Valid
  private List<Id> categoryIds = null;

  @JsonProperty("item_ids")
  @Valid
  private List<Id> itemIds = null;

  @JsonProperty("time")
  private Time time;

  public Offer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Offer descriptor(Descriptor descriptor) {
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

  public Offer locationIds(List<Id> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public Offer addLocationIdsItem(Id locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

  /**
   * Get locationIds
   * @return locationIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Id> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<Id> locationIds) {
    this.locationIds = locationIds;
  }

  public Offer categoryIds(List<Id> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public Offer addCategoryIdsItem(Id categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * Get categoryIds
   * @return categoryIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Id> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Id> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public Offer itemIds(List<Id> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public Offer addItemIdsItem(Id itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

  /**
   * Get itemIds
   * @return itemIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Id> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<Id> itemIds) {
    this.itemIds = itemIds;
  }

  public Offer time(Time time) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.descriptor, offer.descriptor) &&
        Objects.equals(this.locationIds, offer.locationIds) &&
        Objects.equals(this.categoryIds, offer.categoryIds) &&
        Objects.equals(this.itemIds, offer.itemIds) &&
        Objects.equals(this.time, offer.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, locationIds, categoryIds, itemIds, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

