package com.delibrary.dao.service.impl;

import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;
import com.delibrary.dao.repository.IndividualDocumentMappingRepository;
import com.delibrary.dao.service.IndividualDocumentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndividualDocumentMappingServiceImpl  implements IndividualDocumentMappingService {

    @Autowired
    private IndividualDocumentMappingRepository repository;

    @Override
    public List<IndiMappingModel> findAll() {
        List<IndividualDocumentMappingEntity> entities = repository.findAll();
        List<IndiMappingModel> models = new ArrayList<>();
        IndiMappingModel model;
        for(IndividualDocumentMappingEntity item : entities){
            model = new IndiMappingModel();
            model.setId(String.valueOf(item.getId()));
        }
        return null;
    }

    @Override
    public void createNewMapping(IndiMappingModel model) {

    }

    @Override
    public void update(IndiMappingModel model) {

    }

    @Override
    public void delete(IndiMappingModel model) {

    }
}
