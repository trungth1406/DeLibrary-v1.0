package com.delibrary.dao.service.impl;

import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.dao.entity.IndiMappingEntity;
import com.delibrary.dao.entity.IndiMappingPersistEntity;
import com.delibrary.dao.repository.DocMappingJpaRepository;
import com.delibrary.dao.repository.IndividualMappingCriteriaRepository;
import com.delibrary.dao.service.IndividualDocumentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class IndividualDocumentMappingServiceImpl  implements IndividualDocumentMappingService {


    @Autowired
    private EntityManager entityManager;
    @Autowired
    private IndividualMappingCriteriaRepository individualMappingCriteriaRepository;
    @Autowired
    private DocMappingJpaRepository mappingJpaRepository;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dfToDb = new SimpleDateFormat("yyyy-mm-dd");

    @Transactional
    @Override
    public void createNewMapping(IndiMappingModel model) throws ParseException {
        IndiMappingPersistEntity entity = new IndiMappingPersistEntity();
        entity.setIndividualId(model.getIndiId());
        entity.setDocId(model.getDocId());
        entity.setNumberOfDoc(Long.valueOf(model.getNumOfDoc()));
        entity.setNote(model.getNote());
        entity.setDateOfExecution(model.getDateOfExecution() == ""?  null :dfToDb.parse(model.getDateOfExecution()));
        entity.setDateOfSigning(model.getDateOfSigning() == "" ? null : dfToDb.parse(model.getDateOfSigning()));
        entity.setDocType(model.getDocType());
        entityManager.persist(entity);
    }

    @Override
    public void update(IndiMappingModel model) {

    }

    @Override
    public void delete(Long id) {
        mappingJpaRepository.deleteById(id);
    }

    @Override
    public List<IndiMappingModel> findById(long id) {
        List<IndiMappingEntity> entities = individualMappingCriteriaRepository.searchWithCriteriaBuilder(id);
        List<IndiMappingModel> models = new ArrayList<>();
        IndiMappingModel model;
        for(IndiMappingEntity item : entities){
            model = new IndiMappingModel();
            model.setId(String.valueOf(item.getId()));
            model.setDocName(item.getDocName());
            model.setDocType(item.getDocCode());
            model.setNumOfDoc(Math.toIntExact(item.getNumberOfDoc()));
            model.setDateOfExecution(item.getDateOfExecution() == null ? null : sdf.format(item.getDateOfExecution()));
            model.setDateOfSigning(item.getDateOfSigning() == null? null : sdf.format(item.getDateOfSigning()));
            model.setNote(item.getNote());
            models.add(model);
        }
        return models;
    }
}
