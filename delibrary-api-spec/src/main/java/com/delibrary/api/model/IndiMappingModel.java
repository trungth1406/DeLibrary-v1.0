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
 * IndiMappingModel
 */
@Validated
public class IndiMappingModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("indiId")
  private Integer indiId = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docId")
  private Integer docId = null;

  @JsonProperty("docType")
  private String docType = null;

  @JsonProperty("numOfDoc")
  private Long numOfDoc = null;

  @JsonProperty("dateOfExecution")
  private String dateOfExecution = null;

  @JsonProperty("dateOfSigning")
  private String dateOfSigning = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("note")
  private String note = null;

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

  public IndiMappingModel indiId(Integer indiId) {
    this.indiId = indiId;
    return this;
  }

  /**
   * Get indiId
   * @return indiId
  **/
  @ApiModelProperty(value = "")

  public Integer getIndiId() {
    return indiId;
  }

  public void setIndiId(Integer indiId) {
    this.indiId = indiId;
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

  public IndiMappingModel docId(Integer docId) {
    this.docId = docId;
    return this;
  }

  /**
   * Get docId
   * @return docId
  **/
  @ApiModelProperty(value = "")

  public Integer getDocId() {
    return docId;
  }

  public void setDocId(Integer docId) {
    this.docId = docId;
  }

  public IndiMappingModel docType(String docType) {
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

  public IndiMappingModel numOfDoc(Long numOfDoc) {
    this.numOfDoc = numOfDoc;
    return this;
  }

  /**
   * Get numOfDoc
   * @return numOfDoc
  **/
  @ApiModelProperty(value = "")

  public Long getNumOfDoc() {
    return numOfDoc;
  }

  public void setNumOfDoc(Long numOfDoc) {
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

  public IndiMappingModel content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public IndiMappingModel note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
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
        Objects.equals(this.indiId, indiMappingModel.indiId) &&
        Objects.equals(this.docName, indiMappingModel.docName) &&
        Objects.equals(this.docId, indiMappingModel.docId) &&
        Objects.equals(this.docType, indiMappingModel.docType) &&
        Objects.equals(this.numOfDoc, indiMappingModel.numOfDoc) &&
        Objects.equals(this.dateOfExecution, indiMappingModel.dateOfExecution) &&
        Objects.equals(this.dateOfSigning, indiMappingModel.dateOfSigning) &&
        Objects.equals(this.content, indiMappingModel.content) &&
        Objects.equals(this.note, indiMappingModel.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, indiId, docName, docId, docType, numOfDoc, dateOfExecution, dateOfSigning, content, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndiMappingModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indiId: ").append(toIndentedString(indiId)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    numOfDoc: ").append(toIndentedString(numOfDoc)).append("\n");
    sb.append("    dateOfExecution: ").append(toIndentedString(dateOfExecution)).append("\n");
    sb.append("    dateOfSigning: ").append(toIndentedString(dateOfSigning)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
