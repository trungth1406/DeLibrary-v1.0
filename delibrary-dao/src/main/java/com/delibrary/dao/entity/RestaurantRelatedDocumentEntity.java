package com.delibrary.dao.entity;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "restaurant_doc_mapping")
public class RestaurantRelatedDocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doc_type")
    private String docType;
    @Column(name = "date_of_signing")
    private Date dateOfSigning;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;
    @Column(name = "number_of_doc")
    private Integer numberOfDoc;
    @Column(name = "note")
    private String note;


    public RestaurantRelatedDocumentEntity(String docType, Date dateOfSigning, Date dateOfExecution, Integer numberOfDoc, String note) {
        this.docType = docType;
        this.dateOfSigning = dateOfSigning;
        this.dateOfExecution = dateOfExecution;
        this.numberOfDoc = numberOfDoc;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getDateOfSigning() {
        return dateOfSigning;
    }

    public void setDateOfSigning(Date dateOfSigning) {
        this.dateOfSigning = dateOfSigning;
    }

    public Date getDateOfExecution() {
        return dateOfExecution;
    }

    public void setDateOfExecution(Date dateOfExecution) {
        this.dateOfExecution = dateOfExecution;
    }

    public Integer getNumberOfDoc() {
        return numberOfDoc;
    }

    public void setNumberOfDoc(Integer numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
