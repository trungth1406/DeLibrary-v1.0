package com.delibrary.dao.service.impl;

import com.delibrary.api.model.DocType;
import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.dao.entity.IndiMappingEntity;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;
import com.delibrary.dao.repository.DocumentMappingCriteriaRepository;
import com.delibrary.dao.repository.IndividualDocumentMappingRepository;
import com.delibrary.dao.service.IndividualDocumentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class IndividualDocumentMappingServiceImpl  implements IndividualDocumentMappingService {

    @Autowired
    private IndividualDocumentMappingRepository repository;
    @Autowired
    private DocumentMappingCriteriaRepository mappingCriteriaRepository;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



    @Override
    public void createNewMapping(IndiMappingModel model) {

    }

    @Override
    public void update(IndiMappingModel model) {

    }

    @Override
    public void delete(IndiMappingModel model) {

    }

    @Override
    public List<IndiMappingModel> findById(long id) {

//        List<IndiMappingEntity> entities = repository.searchRelatedDocument(id);
        List<IndiMappingEntity> entities = mappingCriteriaRepository.searchWithCriteriaBuilder(id);
        List<IndiMappingModel> models = new ArrayList<>();
        IndiMappingModel model;
        for(IndiMappingEntity item : entities){
            model = new IndiMappingModel();
            model.setId(String.valueOf(item.getId()));
            model.setDocName(item.getDocName());
            model.setDocType(DocType.valueOf(item.getDocCode()));
            model.setNumOfDoc((int) item.getNumberOfDoc());
            model.setDateOfExecution(item.getDateOfExecution() == null ? null : sdf.format(item.getDateOfExecution()));
            model.setDateOfSigning(item.getDateOfSigning() == null? null : sdf.format(item.getDateOfSigning()));
//            model.setContent(item.getContent());
            model.setNote(item.getNote());
            models.add(model);
        }
        return models;
    }
}
