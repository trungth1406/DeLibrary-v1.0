package com.delibrary.controller.api;


import com.delibrary.api.model.DocumentModel;
import com.delibrary.api.model.DocumentModelResponse;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.spec.RestaurantsApi;
import com.delibrary.dao.service.RestaurantDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantDocumentController implements RestaurantsApi {

    @Autowired
    private RestaurantDocService docService;

    @Override
    public ResponseEntity<ResponseMessage> createRestaurantDocuments(DocumentModel body) {
        try{
            docService.create(body);
            return new ResponseEntity(new ResponseMessage().description("Ok"),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> deleteRestaurantDoc(Integer id) {
        try{
            docService.delete(id);
            return new ResponseEntity(new ResponseMessage().description("Ok"),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<DocumentModelResponse> getAllRestaurantDocuments() {
        DocumentModelResponse response = new DocumentModelResponse();
        try{
            List<DocumentModel>  models = docService.findAll();
            response.data(models);
            return new ResponseEntity(response,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> updateRestaurantDocument(Integer id, DocumentModel body) {
        try{
            docService.edit(body);
            return new ResponseEntity(new ResponseMessage().description("Ok"),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
