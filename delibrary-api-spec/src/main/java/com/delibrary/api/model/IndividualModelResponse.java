package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.IndividualModel;
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
 * Model for individual response
 */
@ApiModel(description = "Model for individual response")
@Validated
public class IndividualModelResponse   {
  @JsonProperty("data")
  @Valid
  private List<IndividualModel> data = null;

  public IndividualModelResponse data(List<IndividualModel> data) {
    this.data = data;
    return this;
  }

  public IndividualModelResponse addDataItem(IndividualModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<IndividualModel> getData() {
    return data;
  }

  public void setData(List<IndividualModel> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualModelResponse individualModelResponse = (IndividualModelResponse) o;
    return Objects.equals(this.data, individualModelResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualModelResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
