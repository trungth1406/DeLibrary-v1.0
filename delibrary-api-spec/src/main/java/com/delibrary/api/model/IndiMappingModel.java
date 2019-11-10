package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.DocType;
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
 * IndiMappingModel
 */
@Validated
public class IndiMappingModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("indiname")
  private String indiname = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docType")
  private DocType docType = null;

  @JsonProperty("numOfDoc")
  private Integer numOfDoc = null;

  @JsonProperty("dateOfExecution")
  private String dateOfExecution = null;

  @JsonProperty("dateOfSigning")
  private String dateOfSigning = null;

  @JsonProperty("endPoint")
  @Valid
  private List<EndPoint> endPoint = null;

  public IndiMappingModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IndiMappingModel indiname(String indiname) {
    this.indiname = indiname;
    return this;
  }

  /**
   * Get indiname
   * @return indiname
  **/
  @ApiModelProperty(value = "")

  public String getIndiname() {
    return indiname;
  }

  public void setIndiname(String indiname) {
    this.indiname = indiname;
  }

  public IndiMappingModel docName(String docName) {
    this.docName = docName;
    return this;
  }

  /**
   * Get docName
   * @return docName
  **/
  @ApiModelProperty(value = "")

  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public IndiMappingModel docType(DocType docType) {
    this.docType = docType;
    return this;
  }

  /**
   * Get docType
   * @return docType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DocType getDocType() {
    return docType;
  }

  public void setDocType(DocType docType) {
    this.docType = docType;
  }

  public IndiMappingModel numOfDoc(Integer numOfDoc) {
    this.numOfDoc = numOfDoc;
    return this;
  }

  /**
   * Get numOfDoc
   * @return numOfDoc
  **/
  @ApiModelProperty(value = "")

  public Integer getNumOfDoc() {
    return numOfDoc;
  }

  public void setNumOfDoc(Integer numOfDoc) {
    this.numOfDoc = numOfDoc;
  }

  public IndiMappingModel dateOfExecution(String dateOfExecution) {
    this.dateOfExecution = dateOfExecution;
    return this;
  }

  /**
   * Get dateOfExecution
   * @return dateOfExecution
  **/
  @ApiModelProperty(value = "")

  public String getDateOfExecution() {
    return dateOfExecution;
  }

  public void setDateOfExecution(String dateOfExecution) {
    this.dateOfExecution = dateOfExecution;
  }

  public IndiMappingModel dateOfSigning(String dateOfSigning) {
    this.dateOfSigning = dateOfSigning;
    return this;
  }

  /**
   * Get dateOfSigning
   * @return dateOfSigning
  **/
  @ApiModelProperty(value = "")

  public String getDateOfSigning() {
    return dateOfSigning;
  }

  public void setDateOfSigning(String dateOfSigning) {
    this.dateOfSigning = dateOfSigning;
  }

  public IndiMappingModel endPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public IndiMappingModel addEndPointItem(EndPoint endPointItem) {
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
    IndiMappingModel indiMappingModel = (IndiMappingModel) o;
    return Objects.equals(this.id, indiMappingModel.id) &&
        Objects.equals(this.indiname, indiMappingModel.indiname) &&
        Objects.equals(this.docName, indiMappingModel.docName) &&
        Objects.equals(this.docType, indiMappingModel.docType) &&
        Objects.equals(this.numOfDoc, indiMappingModel.numOfDoc) &&
        Objects.equals(this.dateOfExecution, indiMappingModel.dateOfExecution) &&
        Objects.equals(this.dateOfSigning, indiMappingModel.dateOfSigning) &&
        Objects.equals(this.endPoint, indiMappingModel.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, indiname, docName, docType, numOfDoc, dateOfExecution, dateOfSigning, endPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndiMappingModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indiname: ").append(toIndentedString(indiname)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    numOfDoc: ").append(toIndentedString(numOfDoc)).append("\n");
    sb.append("    dateOfExecution: ").append(toIndentedString(dateOfExecution)).append("\n");
    sb.append("    dateOfSigning: ").append(toIndentedString(dateOfSigning)).append("\n");
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
