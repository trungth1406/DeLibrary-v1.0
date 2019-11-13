package com.delibrary.dao.service;

import com.delibrary.api.model.IndividualModel;
import com.delibrary.api.model.IndividualModelRequest;

import java.text.ParseException;
import java.util.List;

public interface IndividualService {

    List<IndividualModel> findAll();
    void create(IndividualModelRequest model) throws ParseException;
    void edit(IndividualModel model) throws ParseException;
    void delete(long id);
    void delete(IndividualModel model) throws ParseException;
}
