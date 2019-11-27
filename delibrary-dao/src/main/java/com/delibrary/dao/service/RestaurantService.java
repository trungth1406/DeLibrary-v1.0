package com.delibrary.dao.service;

import com.delibrary.api.model.CorporateModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService  {

    List<CorporateModel> findAll();

    CorporateModel findById(Long id);

    void createNewRestaurant(CorporateModel model);

    void deleteById(Long id);

    void updateRestaurantInfo(CorporateModel model);

}
