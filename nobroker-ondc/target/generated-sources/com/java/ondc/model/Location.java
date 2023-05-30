package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Address;
import com.java.ondc.model.Circle;
import com.java.ondc.model.City;
import com.java.ondc.model.Country;
import com.java.ondc.model.Descriptor;
import com.java.ondc.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the location of a runtime object.
 */
@ApiModel(description = "Describes the location of a runtime object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Location  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("gps")
  private String gps;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("station_code")
  private String stationCode;

  @JsonProperty("city")
  private City city;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("circle")
  private Circle circle;

  @JsonProperty("polygon")
  private String polygon;

  @JsonProperty("3dspace")
  private String _3dspace;

  @JsonProperty("time")
  private Time time;

  public Location id(String id) {
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

  public Location descriptor(Descriptor descriptor) {
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

  public Location gps(String gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Describes a gps coordinate
   * @return gps
  */
  @ApiModelProperty(value = "Describes a gps coordinate")

@Pattern(regexp="^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$") 
  public String getGps() {
    return gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public Location address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Location stationCode(String stationCode) {
    this.stationCode = stationCode;
    return this;
  }

  /**
   * Get stationCode
   * @return stationCode
  */
  @ApiModelProperty(value = "")


  public String getStationCode() {
    return stationCode;
  }

  public void setStationCode(String stationCode) {
    this.stationCode = stationCode;
  }

  public Location city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")

  @Valid

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Location country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")

  @Valid

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Location circle(Circle circle) {
    this.circle = circle;
    return this;
  }

  /**
   * Get circle
   * @return circle
  */
  @ApiModelProperty(value = "")

  @Valid

  public Circle getCircle() {
    return circle;
  }

  public void setCircle(Circle circle) {
    this.circle = circle;
  }

  public Location polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

  /**
   * Get polygon
   * @return polygon
  */
  @ApiModelProperty(value = "")


  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public Location _3dspace(String _3dspace) {
    this._3dspace = _3dspace;
    return this;
  }

  /**
   * Get _3dspace
   * @return _3dspace
  */
  @ApiModelProperty(value = "")


  public String get3dspace() {
    return _3dspace;
  }

  public void set3dspace(String _3dspace) {
    this._3dspace = _3dspace;
  }

  public Location time(Time time) {
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
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.descriptor, location.descriptor) &&
        Objects.equals(this.gps, location.gps) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.stationCode, location.stationCode) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.circle, location.circle) &&
        Objects.equals(this.polygon, location.polygon) &&
        Objects.equals(this._3dspace, location._3dspace) &&
        Objects.equals(this.time, location.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, gps, address, stationCode, city, country, circle, polygon, _3dspace, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    stationCode: ").append(toIndentedString(stationCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    circle: ").append(toIndentedString(circle)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    _3dspace: ").append(toIndentedString(_3dspace)).append("\n");
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

