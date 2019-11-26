package com.delibrary.dao.service.impl;

import com.delibrary.api.model.CorporateModel;
import com.delibrary.dao.entity.RestaurantEntity;
import com.delibrary.dao.repository.RestaurantRepository;
import com.delibrary.dao.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<RestaurantEntity> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public RestaurantEntity findById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public void createNewRestaurant(CorporateModel model) {
         RestaurantEntity entity = new RestaurantEntity();
         entity.setName(model.getName());
         entity.setAddress(model.getCity());
         restaurantRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
         restaurantRepository.deleteById(id);
    }

    @Override
    public void updateRestaurantInfo(CorporateModel model) {
        RestaurantEntity entity = new RestaurantEntity();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setAddress(model.getCity());
        restaurantRepository.save(entity);
    }
}
