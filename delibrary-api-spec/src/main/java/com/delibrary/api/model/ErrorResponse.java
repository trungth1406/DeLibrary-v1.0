package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.Error;
import com.delibrary.api.model.ResponseMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
public class ErrorResponse   {
  @JsonProperty("message")
  private ResponseMessage message = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  public ErrorResponse message(ResponseMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ResponseMessage getMessage() {
    return message;
  }

  public void setMessage(ResponseMessage message) {
    this.message = message;
  }

  public ErrorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "[{\"code\":\"E01_01\",\"title\":\"Contract Number invalid\",\"description\":\"Contract Number should contains only numbers\",\"field\":\"contractNumber\",\"rejectedValue\":\"A123\"},{\"code\":\"E01_02\",\"title\":\"Identification Card Number invalid\",\"description\":\"Identification Card Number should be 9 or 12 numbers\",\"field\":\"idNumber\",\"rejectedValue\":1234}]", value = "")
  @Valid
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
