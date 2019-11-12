package com.delibrary.dao.service;

import com.delibrary.api.model.IndividualModel;

import java.util.List;

public interface IndividualService {

    List<IndividualModel> findAll();
    void edit(IndividualModel model);
    void delete(long id);
    void delete(IndividualModel model);
}
