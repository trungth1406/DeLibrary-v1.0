package com.delibrary.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@Validated
public class Error   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("rejectedValue")
  private String rejectedValue = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "E01_01", value = "")

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Contract Number invalid", value = "")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Contract Number should contains only numbers", value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(example = "contractNumber", value = "")

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Error rejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * Get rejectedValue
   * @return rejectedValue
  **/
  @ApiModelProperty(example = "A123", value = "")

  public String getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.field, error.field) &&
        Objects.equals(this.rejectedValue, error.rejectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, description, field, rejectedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
