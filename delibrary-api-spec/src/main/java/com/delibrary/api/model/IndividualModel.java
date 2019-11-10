package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.EndPoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for individual
 */
@ApiModel(description = "Model for individual")
@Validated
public class IndividualModel   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("dob")
  private Date dob = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("endpoint")
  @Valid
  private List<EndPoint> endpoint = null;

  public IndividualModel id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public IndividualModel name(String name) {
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

  public IndividualModel dob(Date dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public IndividualModel position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "CTHDQT", value = "")

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public IndividualModel companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "DeLi", value = "")

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public IndividualModel endpoint(List<EndPoint> endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public IndividualModel addEndpointItem(EndPoint endpointItem) {
    if (this.endpoint == null) {
      this.endpoint = new ArrayList<>();
    }
    this.endpoint.add(endpointItem);
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<EndPoint> getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(List<EndPoint> endpoint) {
    this.endpoint = endpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualModel individualModel = (IndividualModel) o;
    return Objects.equals(this.id, individualModel.id) &&
        Objects.equals(this.name, individualModel.name) &&
        Objects.equals(this.dob, individualModel.dob) &&
        Objects.equals(this.position, individualModel.position) &&
        Objects.equals(this.companyName, individualModel.companyName) &&
        Objects.equals(this.endpoint, individualModel.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dob, position, companyName, endpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
