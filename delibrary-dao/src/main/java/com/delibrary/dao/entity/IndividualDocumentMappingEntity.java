package com.delibrary.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "individualdocumentmapping")
public class IndividualDocumentMappingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = IndividualDocumentEntity.class)
    @JoinColumn(name = "doc_id", referencedColumnName = "id")
    private IndividualDocumentEntity indvDocEntity;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = IndividualEntity.class)
    @JoinColumn(name = "individual_id", referencedColumnName = "id",nullable =  false)
    private IndividualEntity indvEntity;
    @Column(name = "number_of_doc")
    private long numberOfDoc;
    @Column(name = "doc_type")
    private String type;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;
    @Column(name = "date_of_signing")
    private Date dateOfSigning;
    @Column(name = "note")
    private String note;
    @Column(name = "content")
    private String content;


    public IndividualDocumentMappingEntity() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberOfDoc() {
        return numberOfDoc;
    }

    public void setNumberOfDoc(long numberOfDoc) {
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

    public IndividualEntity getIndividual() {
        return indvEntity;
    }

    public void setIndividual(IndividualEntity individual) {
        this.indvEntity = individual;
    }

    public IndividualDocumentEntity getIndvDocEntity() {
        return indvDocEntity;
    }

    public void setIndvDocEntity(IndividualDocumentEntity indvDocEntity) {
        this.indvDocEntity = indvDocEntity;
    }

    public IndividualEntity getIndvEntity() {
        return indvEntity;
    }

    public void setIndvEntity(IndividualEntity indvEntity) {
        this.indvEntity = indvEntity;
    }


}