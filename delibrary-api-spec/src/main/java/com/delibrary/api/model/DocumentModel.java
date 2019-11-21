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
public class DocumentModel   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docCode")
  private String docCode = null;

  public DocumentModel id(Integer id) {
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

  public DocumentModel docCode(String docCode) {
    this.docCode = docCode;
    return this;
  }

  /**
   * Get docCode
   * @return docCode
  **/
  @ApiModelProperty(value = "")

  public String getDocCode() {
    return docCode;
  }

  public void setDocCode(String docCode) {
    this.docCode = docCode;
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
        Objects.equals(this.docCode, documentModel.docCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, docName, docCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docCode: ").append(toIndentedString(docCode)).append("\n");
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
