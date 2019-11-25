package com.delibrary.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "restaurantdocument")
public class RestaurantDocumentEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "doc_name")
        private String name;
        @Column(name = "doc_code")
        private String docCode;

    public RestaurantDocumentEntity(String name, String docCode) {
        this.name = name;
        this.docCode = docCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
}
