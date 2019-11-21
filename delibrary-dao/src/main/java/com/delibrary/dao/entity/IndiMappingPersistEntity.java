package com.delibrary.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "individualdocumentmapping")
public class IndiMappingPersistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doc_type")
    private String docType;
    @Column(name = "number_of_doc")
    private Long numberOfDoc;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;
    @Column(name = "date_of_signing")
    private Date dateOfSigning;
    @Column(name = "note")
    private String note;
    @Column(name = "content")
    private String content;
    @Column(name = "doc_id")
    private Integer docId;
    @Column(name = "individual_id")
    private Integer individualId;


    public IndiMappingPersistEntity() {
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

    public Long getNumberOfDoc() {
        return numberOfDoc;
    }

    public void setNumberOfDoc(Long numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public Date getDateOfExecution() {
        return dateOfExecution;
    }

    public void setDateOfExecution(Date dateOfExecution) {
        this.dateOfExecution = dateOfExecution;
    }

    public Date getDateOfSigning() {
        return dateOfSigning;
    }

    public void setDateOfSigning(Date dateOfSigning) {
        this.dateOfSigning = dateOfSigning;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
    }
}
