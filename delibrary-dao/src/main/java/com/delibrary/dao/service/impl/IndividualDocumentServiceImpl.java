package com.delibrary.dao.service.impl;


import com.delibrary.api.model.DocType;
import com.delibrary.api.model.DocumentModel;
import com.delibrary.dao.entity.IndividualDocumentEntity;
import com.delibrary.dao.repository.IndividualDocumentRepository;
import com.delibrary.dao.service.IndividualDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndividualDocumentServiceImpl implements IndividualDocumentService {

    @Autowired
    private IndividualDocumentRepository individualDocumentRepository;

    @Override
    public List<DocumentModel> findAll() {
        List<IndividualDocumentEntity> entities = individualDocumentRepository.findAll();
        List<DocumentModel> models = new ArrayList<>();
        DocumentModel model;
        for(IndividualDocumentEntity item : entities){
            model = new DocumentModel();
            model.setId(Math.toIntExact(item.getId()));
            model.setDocName(item.getDocName());
            model.setDocCode(item.getDocCode());
            models.add(model);
        }
        return models;
    }

    @Override
    public void createDocument(DocumentModel model) {
        IndividualDocumentEntity entity = new IndividualDocumentEntity();
        entity.setDocCode(model.getDocCode());
        entity.setDocName(model.getDocName());
        individualDocumentRepository.save(entity);
    }

    @Override
    public void updateDocument(DocumentModel model) {
        IndividualDocumentEntity entity = new IndividualDocumentEntity();
        entity.setDocCode(model.getDocCode());
        entity.setDocName(model.getDocName());
        entity.setId(model.getId());
        individualDocumentRepository.save(entity);
    }

    @Override
    public void deleteDocument(long id) {
         individualDocumentRepository.deleteById(id);
    }
}
