package com.delibrary.dao.repository;

import com.delibrary.dao.entity.IndiMappingEntity;
import com.delibrary.dao.entity.IndividualDocumentMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualDocumentMappingRepository extends JpaRepository<IndiMappingEntity,Long> {


    @Query(value = "SELECT m.id,d.doc_code,d.doc_name,m.number_of_doc,m.date_of_execution,m.date_of_signing,m.note,m.content " +
            "FROM individualdocumentmapping m " +
            "inner join individual i on i.id = m.individual_id " +
            "inner join individualdocument  d on d.id = m.doc_id " +
            "where i.id =  ?",nativeQuery = true)
    List<IndiMappingEntity> searchRelatedDocument(long  id);


}
