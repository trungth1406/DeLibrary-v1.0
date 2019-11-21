package com.delibrary.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IndiMappingEntity {

    @Id
    private Long id;
    @Column(name = "doc_name")
    private String docName;
    @Column(name = "doc_code")
    private String docCode;
    @Column(name = "number_of_doc")
    private long numberOfDoc;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;
    @Column(name = "date_of_signing")
    private Date dateOfSigning;
    @Column(name = "note")
    private String note;
    @Column(name = "content")
    private String content;


    public IndiMappingEntity(long id, String docName, String docCode, long numberOfDoc, Date dateOfExecution, Date dateOfSigning, String note, String content) {
        this.id = id;
        this.docName = docName;
        this.docCode = docCode;
        this.numberOfDoc = numberOfDoc;
        this.dateOfExecution = dateOfExecution;
        this.dateOfSigning = dateOfSigning;
        this.note = note;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
}
