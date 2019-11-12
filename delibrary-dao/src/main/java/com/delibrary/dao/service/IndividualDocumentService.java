package com.delibrary.dao.service;

import com.delibrary.api.model.DocumentModel;
import com.delibrary.dao.entity.IndividualDocumentEntity;

import java.util.List;

public interface IndividualDocumentService {

    List<DocumentModel> findAll();
    void createDocument(DocumentModel model);
    void updateDocument(DocumentModel model);
    void deleteDocument(long id);
}
