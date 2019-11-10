package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.EndPoint;
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
 * CorporateModel
 */
@Validated
public class CorporateModel   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("endPoint")
  @Valid
  private List<EndPoint> endPoint = null;

  public CorporateModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CorporateModel city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CorporateModel endPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public CorporateModel addEndPointItem(EndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * Get endPoint
   * @return endPoint
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<EndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateModel corporateModel = (CorporateModel) o;
    return Objects.equals(this.name, corporateModel.name) &&
        Objects.equals(this.city, corporateModel.city) &&
        Objects.equals(this.endPoint, corporateModel.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, city, endPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
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
