package com.delibrary.api.model;

import java.util.Objects;
import com.delibrary.api.model.DocType;
import com.delibrary.api.model.EndPoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for individual documents
 */
@ApiModel(description = "Model for individual documents")
@Validated
public class DocumentModel   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docType")
  private DocType docType = null;

  @JsonProperty("endPoint")
  @Valid
  private List<EndPoint> endPoint = null;

  public DocumentModel id(BigDecimal id) {
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

  public DocumentModel docName(String docName) {
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

  public DocumentModel docType(DocType docType) {
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

  public DocumentModel endPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public DocumentModel addEndPointItem(EndPoint endPointItem) {
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
    DocumentModel documentModel = (DocumentModel) o;
    return Objects.equals(this.id, documentModel.id) &&
        Objects.equals(this.docName, documentModel.docName) &&
        Objects.equals(this.docType, documentModel.docType) &&
        Objects.equals(this.endPoint, documentModel.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, docName, docType, endPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
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
