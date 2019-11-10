package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.CorporateModel;
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
public class CorporateModelResponse   {
  @JsonProperty("data")
  @Valid
  private List<CorporateModel> data = null;

  public CorporateModelResponse data(List<CorporateModel> data) {
    this.data = data;
    return this;
  }

  public CorporateModelResponse addDataItem(CorporateModel dataItem) {
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
  public List<CorporateModel> getData() {
    return data;
  }

  public void setData(List<CorporateModel> data) {
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
    CorporateModelResponse corporateModelResponse = (CorporateModelResponse) o;
    return Objects.equals(this.data, corporateModelResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateModelResponse {\n");
    
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
