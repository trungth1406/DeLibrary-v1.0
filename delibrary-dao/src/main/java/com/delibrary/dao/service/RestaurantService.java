package com.delibrary.dao.service;

import com.delibrary.api.model.CorporateModel;
import com.delibrary.dao.entity.RestaurantEntity;
import com.delibrary.dao.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService  {

    List<RestaurantEntity> findAll();

    RestaurantEntity findById(Long id);

    void createNewRestaurant(CorporateModel model);

    void deleteById(Long id);

    void updateRestaurantInfo(CorporateModel model);

}
