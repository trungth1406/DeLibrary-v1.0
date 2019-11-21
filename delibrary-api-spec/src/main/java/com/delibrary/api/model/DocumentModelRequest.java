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
 * Model for individual documents
 */
@ApiModel(description = "Model for individual documents")
@Validated
public class DocumentModelRequest   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docType")
  private String docType = null;

  public DocumentModelRequest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DocumentModelRequest docName(String docName) {
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

  public DocumentModelRequest docType(String docType) {
    this.docType = docType;
    return this;
  }

  /**
   * Get docType
   * @return docType
  **/
  @ApiModelProperty(value = "")

  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentModelRequest documentModelRequest = (DocumentModelRequest) o;
    return Objects.equals(this.id, documentModelRequest.id) &&
        Objects.equals(this.docName, documentModelRequest.docName) &&
        Objects.equals(this.docType, documentModelRequest.docType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, docName, docType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentModelRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
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
