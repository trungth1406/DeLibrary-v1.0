package com.delibrary.dao.entity;


import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "individual")
public class IndividualEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "indv_name")
    private String individualName;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "position")
    private String position;
    @Column(name = "company_name")
    private String companyName;
    @OneToMany(mappedBy = "indvEntity", fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE},orphanRemoval = true)
    private List<IndividualDocumentMappingEntity> documents;

    public IndividualEntity() {

    }
    public List<IndividualDocumentMappingEntity> getDocuments() {
        return documents;
    }

    public void setDocuments(List<IndividualDocumentMappingEntity> newDocuments) {
        this.documents = newDocuments;
    }

    public void addDocument(IndividualDocumentMappingEntity entity){
        if(entity != null){
            if(documents == null){
                documents = new ArrayList<>();
            }
            documents.add(entity);
            entity.setIndvEntity(this);
        }
    }


    public void removeDocument(IndividualDocumentMappingEntity entity){
        documents.remove(entity);
        entity.setIndividual(this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getIndividualName() {
        return individualName;
    }

    public void setIndividualName(String individualName) {
        this.individualName = individualName;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
