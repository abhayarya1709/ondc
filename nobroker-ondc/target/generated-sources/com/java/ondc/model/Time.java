package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.java.ondc.model.Schedule;
import com.java.ondc.model.TimeRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes time in its various forms. It can be a single point in time; duration; or a structured timetable of operations
 */
@ApiModel(description = "Describes time in its various forms. It can be a single point in time; duration; or a structured timetable of operations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Time  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("label")
  private String label;

  @JsonProperty("timestamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("range")
  private TimeRange range;

  @JsonProperty("days")
  private String days;

  @JsonProperty("schedule")
  private Schedule schedule;

  public Time label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Time timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Time duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Describes duration as per ISO8601 format
   * @return duration
  */
  @ApiModelProperty(value = "Describes duration as per ISO8601 format")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Time range(TimeRange range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeRange getRange() {
    return range;
  }

  public void setRange(TimeRange range) {
    this.range = range;
  }

  public Time days(String days) {
    this.days = days;
    return this;
  }

  /**
   * comma separated values representing days of the week
   * @return days
  */
  @ApiModelProperty(value = "comma separated values representing days of the week")


  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }

  public Time schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Time time = (Time) o;
    return Objects.equals(this.label, time.label) &&
        Objects.equals(this.timestamp, time.timestamp) &&
        Objects.equals(this.duration, time.duration) &&
        Objects.equals(this.range, time.range) &&
        Objects.equals(this.days, time.days) &&
        Objects.equals(this.schedule, time.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, timestamp, duration, range, days, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Time {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

