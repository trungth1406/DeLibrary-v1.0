package com.delibrary.dao.repository.impl;

import com.delibrary.dao.entity.IndiMappingEntity;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;
import com.delibrary.dao.repository.IndividualMappingCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository("mappingWithCriteria")
public class IndividualMappingCriteriaRepositoryImpl implements IndividualMappingCriteriaRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<IndiMappingEntity> searchWithCriteriaBuilder(long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery q = cb.createQuery(IndiMappingEntity.class);
        Root<IndividualDocumentMappingEntity> root = q.from(IndividualDocumentMappingEntity.class);
        root.join("indvEntity",JoinType.INNER);
        root.join("indvDocEntity",JoinType.INNER);
        q.multiselect(
                root.get("id"),
                root.get("indvDocEntity").get("docName"),
                root.get("type"),
                root.get("numberOfDoc"),
                root.get("dateOfExecution"),
                root.get("dateOfSigning"),
                root.get("note"),
                root.get("content"));
        q.where(cb.equal(root.get("indvEntity").get("id"),id));

        TypedQuery<IndiMappingEntity> query = entityManager.createQuery(q);
        List<IndiMappingEntity> result = query.getResultList();
        return result;
    }
}