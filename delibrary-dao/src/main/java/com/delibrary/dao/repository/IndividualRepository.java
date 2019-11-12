package com.delibrary.dao.repository;

import com.delibrary.dao.entity.IndividualEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualRepository  extends JpaRepository<IndividualEntity,Long> {
}
