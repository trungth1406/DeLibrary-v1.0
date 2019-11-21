package com.delibrary.dao.service;

import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;

import java.text.ParseException;
import java.util.List;

public interface IndividualDocumentMappingService {
    void createNewMapping(IndiMappingModel model) throws ParseException;
    void update(IndiMappingModel model);
    void delete(Long id);
    List<IndiMappingModel> findById(long id);

}
