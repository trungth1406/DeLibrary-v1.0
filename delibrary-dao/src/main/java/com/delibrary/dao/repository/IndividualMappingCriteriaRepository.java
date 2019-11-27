package com.delibrary.dao.repository;

import com.delibrary.dao.entity.IndiMappingEntity;

import java.util.List;

public interface IndividualMappingCriteriaRepository {
    List<IndiMappingEntity> searchWithCriteriaBuilder(long id );
}
