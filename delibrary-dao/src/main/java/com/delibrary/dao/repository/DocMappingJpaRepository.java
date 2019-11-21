package com.delibrary.dao.repository;

import com.delibrary.dao.entity.IndividualDocumentMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocMappingJpaRepository extends JpaRepository<IndividualDocumentMappingEntity,Long> {

      void deleteById(Long id);
}
