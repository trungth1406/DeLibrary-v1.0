package com.delibrary.dao.repository;

import com.delibrary.dao.entity.RestaurantDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantDocumentRepository extends JpaRepository<RestaurantDocumentEntity,Long> {
}
