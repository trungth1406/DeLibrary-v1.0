package com.delibrary.dao.service;

import com.delibrary.api.model.DocumentModel;

import java.text.ParseException;
import java.util.List;

public interface RestaurantDocService {

    List<DocumentModel> findAll();

    void create(DocumentModel model) throws ParseException;

    void edit(DocumentModel model) throws ParseException;

    void delete(long id);
}
