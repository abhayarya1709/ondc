package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Id;
import com.java.ondc.model.OrderProviderLocations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OrderProvider  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Id id = null;

  @JsonProperty("locations")
  @Valid
  private List<OrderProviderLocations> locations = null;

  public OrderProvider id(Id id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public Id getId() {
    return id;
  }

  public void setId(Id id) {
    this.id = id;
  }

  public OrderProvider locations(List<OrderProviderLocations> locations) {
    this.locations = locations;
    return this;
  }

  public OrderProvider addLocationsItem(OrderProviderLocations locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=1) 
  public List<OrderProviderLocations> getLocations() {
    return locations;
  }

  public void setLocations(List<OrderProviderLocations> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderProvider orderProvider = (OrderProvider) o;
    return Objects.equals(this.id, orderProvider.id) &&
        Objects.equals(this.locations, orderProvider.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProvider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

