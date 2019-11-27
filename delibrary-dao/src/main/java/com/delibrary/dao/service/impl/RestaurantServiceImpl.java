package com.delibrary.dao.service.impl;

import com.delibrary.api.model.CorporateModel;
import com.delibrary.dao.entity.RestaurantEntity;
import com.delibrary.dao.repository.RestaurantRepository;
import com.delibrary.dao.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<CorporateModel> findAll() {
        List<RestaurantEntity> entities = restaurantRepository.findAll();
        List<CorporateModel> models = new ArrayList<>();
        CorporateModel model;
        for (RestaurantEntity item : entities) {
            model = new CorporateModel();
            model.setId(item.getId());
            model.setName(item.getName());
            model.setCity(item.getAddress());
            models.add(model);
        }
        return models;
    }

    @Override
    public CorporateModel findById(Long id) {
        RestaurantEntity entity = restaurantRepository.findById(id).orElse(null);
        CorporateModel model = new CorporateModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setCity(entity.getAddress());
        return model;
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
