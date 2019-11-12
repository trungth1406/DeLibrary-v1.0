package com.delibrary.dao.service.impl;

import com.delibrary.api.model.IndividualModel;
import com.delibrary.dao.entity.IndividualEntity;
import com.delibrary.dao.repository.IndividualRepository;
import com.delibrary.dao.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class IndividualServiceImpl implements IndividualService {

    @Autowired
    private IndividualRepository  individualRepository;

    @Override
    public List<IndividualModel> findAll() {
        List<IndividualEntity> entities = individualRepository.findAll();
        List<IndividualModel> models = new ArrayList<>();
        IndividualModel model;
        for(IndividualEntity item : entities){
            model = new IndividualModel();
            model.setName(item.getIndividualName());
            model.setId(model.getId());
            model.setCompanyName(item.getCompanyName());
            model.setDob(item.getDob());
            model.setPosition(item.getPosition());
            models.add(model);
        }
        return models;
    }


    @Override
    public void edit(IndividualModel model) {
        IndividualEntity entity = new IndividualEntity();
        entity.setCompanyName(model.getCompanyName());
        entity.setDob(model.getDob());
        entity.setId(model.getId());
        entity.setIndividualName(model.getName());
        entity.setPosition(model.getPosition());
        individualRepository.save(entity);
    }

    @Override
    public void delete(long id) {
    individualRepository.deleteById(id);
    }

    @Override
    public void delete(IndividualModel model) {
        IndividualEntity entity = new IndividualEntity();
        entity.setCompanyName(model.getCompanyName());
        entity.setDob(model.getDob());
        entity.setId(model.getId());
        entity.setIndividualName(model.getName());
        entity.setPosition(model.getPosition());
        individualRepository.delete(entity);
    }
}
