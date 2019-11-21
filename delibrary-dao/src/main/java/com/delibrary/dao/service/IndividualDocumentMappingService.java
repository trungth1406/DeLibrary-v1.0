package com.delibrary.dao.service;

import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;

import java.util.List;

public interface IndividualDocumentMappingService {
    void createNewMapping(IndiMappingModel model);
    void update(IndiMappingModel model);
    void delete(IndiMappingModel model);
    List<IndiMappingModel> findById(long id);

}
