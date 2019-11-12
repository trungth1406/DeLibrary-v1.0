package com.delibrary.dao.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "individualdocument")
public class IndividualDocumentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "doc_name")
    private String docName;
    @Column(name = "doc_code")
    private String docCode;
    @OneToMany(mappedBy = "indvDocEntity",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<IndividualDocumentMappingEntity> documents;


    public void removeDocument(IndividualDocumentMappingEntity entity){
        documents.remove(entity);
        entity.setIndvDocEntity(this);
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<IndividualDocumentMappingEntity> getDocuments() {
        return documents;
    }

    public void setDocuments(List<IndividualDocumentMappingEntity> documents) {
        this.documents = documents;
    }

    public void addDocuments(IndividualDocumentMappingEntity entity){
        if(entity != null){
            if(documents == null){
                documents = new ArrayList<>();
            }
            documents.add(entity);
            entity.setIndvDocEntity(this);
        }
    }
}
