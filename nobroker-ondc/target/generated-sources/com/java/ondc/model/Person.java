package com.java.ondc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a person.
 */
@ApiModel(description = "Describes a person.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Person  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("image")
  private String image;

  @JsonProperty("dob")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dob;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("cred")
  private String cred;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Describes the name of a person in format: ./{given_name}/{honorific_prefix}/{first_name}/{middle_name}/{last_name}/{honorific_suffix}
   * @return name
  */
  @ApiModelProperty(value = "Describes the name of a person in format: ./{given_name}/{honorific_prefix}/{first_name}/{middle_name}/{last_name}/{honorific_suffix}")

@Pattern(regexp="^\\./[^/]+/[^/]*_/[^/]*_/[^/]*_/[^/]*_/[^/]*$") 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image of an object. <br/><br/> A url based image will look like <br/><br/>```uri:http://path/to/image``` <br/><br/> An image can also be sent as a data string. For example : <br/><br/> ```data:js87y34ilhriuho84r3i4```
   * @return image
  */
  @ApiModelProperty(value = "Image of an object. <br/><br/> A url based image will look like <br/><br/>```uri:http://path/to/image``` <br/><br/> An image can also be sent as a data string. For example : <br/><br/> ```data:js87y34ilhriuho84r3i4```")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Person dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Person gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of something, typically a Person, but possibly also fictional characters, animals, etc. While Male and Female may be used, text strings are also acceptable for people who do not identify as a binary gender
   * @return gender
  */
  @ApiModelProperty(value = "Gender of something, typically a Person, but possibly also fictional characters, animals, etc. While Male and Female may be used, text strings are also acceptable for people who do not identify as a binary gender")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Person cred(String cred) {
    this.cred = cred;
    return this;
  }

  /**
   * Get cred
   * @return cred
  */
  @ApiModelProperty(value = "")


  public String getCred() {
    return cred;
  }

  public void setCred(String cred) {
    this.cred = cred;
  }

  public Person tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Person putTagsItem(String key, String tagsItem) {
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
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.image, person.image) &&
        Objects.equals(this.dob, person.dob) &&
        Objects.equals(this.gender, person.gender) &&
        Objects.equals(this.cred, person.cred) &&
        Objects.equals(this.tags, person.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, image, dob, gender, cred, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    cred: ").append(toIndentedString(cred)).append("\n");
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

