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
 * RestaurantMappingModel
 */
@Validated
public class RestaurantMappingModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("restaurantId")
  private Long restaurantId = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("docId")
  private Integer docId = null;

  @JsonProperty("docType")
  private String docType = null;

  @JsonProperty("numOfDoc")
  private Integer numOfDoc = null;

  @JsonProperty("dateOfExecution")
  private String dateOfExecution = null;

  @JsonProperty("dateOfSigning")
  private String dateOfSigning = null;

  @JsonProperty("note")
  private String note = null;

  public RestaurantMappingModel id(String id) {
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

  public RestaurantMappingModel restaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  **/
  @ApiModelProperty(value = "")

  public Long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
  }

  public RestaurantMappingModel docName(String docName) {
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

  public RestaurantMappingModel docId(Integer docId) {
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

  public RestaurantMappingModel docType(String docType) {
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

  public RestaurantMappingModel numOfDoc(Integer numOfDoc) {
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

  public RestaurantMappingModel dateOfExecution(String dateOfExecution) {
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

  public RestaurantMappingModel dateOfSigning(String dateOfSigning) {
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

  public RestaurantMappingModel note(String note) {
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
    RestaurantMappingModel restaurantMappingModel = (RestaurantMappingModel) o;
    return Objects.equals(this.id, restaurantMappingModel.id) &&
        Objects.equals(this.restaurantId, restaurantMappingModel.restaurantId) &&
        Objects.equals(this.docName, restaurantMappingModel.docName) &&
        Objects.equals(this.docId, restaurantMappingModel.docId) &&
        Objects.equals(this.docType, restaurantMappingModel.docType) &&
        Objects.equals(this.numOfDoc, restaurantMappingModel.numOfDoc) &&
        Objects.equals(this.dateOfExecution, restaurantMappingModel.dateOfExecution) &&
        Objects.equals(this.dateOfSigning, restaurantMappingModel.dateOfSigning) &&
        Objects.equals(this.note, restaurantMappingModel.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, restaurantId, docName, docId, docType, numOfDoc, dateOfExecution, dateOfSigning, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantMappingModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    numOfDoc: ").append(toIndentedString(numOfDoc)).append("\n");
    sb.append("    dateOfExecution: ").append(toIndentedString(dateOfExecution)).append("\n");
    sb.append("    dateOfSigning: ").append(toIndentedString(dateOfSigning)).append("\n");
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
