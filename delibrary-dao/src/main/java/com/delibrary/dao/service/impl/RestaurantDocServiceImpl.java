package com.delibrary.dao.service.impl;

import com.delibrary.api.model.DocumentModel;
import com.delibrary.dao.entity.RestaurantDocumentEntity;
import com.delibrary.dao.repository.RestaurantDocumentRepository;
import com.delibrary.dao.service.RestaurantDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantDocServiceImpl implements RestaurantDocService {

    @Autowired
    private RestaurantDocumentRepository documentRepository;


    @Override
    public List<DocumentModel> findAll() {
        List<RestaurantDocumentEntity> entities = documentRepository.findAll();
        List<DocumentModel> models = new ArrayList<>();
        DocumentModel model;
        for (RestaurantDocumentEntity item : entities) {
            model = new DocumentModel();
            model.setId(Math.toIntExact(item.getId()));
            model.setDocName(item.getName());
            model.setDocCode(item.getDocCode());
            models.add(model);
        }
        return models;
    }

    @Override
    public void create(DocumentModel model) throws ParseException {
        RestaurantDocumentEntity entity = new RestaurantDocumentEntity();
        entity.setName(model.getDocName());
        entity.setDocCode(model.getDocCode());
        documentRepository.save(entity);
    }

    @Override
    public void edit(DocumentModel model) throws ParseException {
        RestaurantDocumentEntity entity = new RestaurantDocumentEntity();
        entity.setId((long) model.getId());
        entity.setName(model.getDocName());
        entity.setDocCode(model.getDocCode());
        documentRepository.save(entity);
    }

    @Override
    public void delete(long id) {
        documentRepository.deleteById(id);
    }


}
