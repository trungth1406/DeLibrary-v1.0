package com.delibrary.controller.api;


import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.api.model.IndiMappingModelRequest;
import com.delibrary.api.model.IndiMappingModelResponse;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.spec.IndimappingsApi;
import com.delibrary.dao.service.IndividualDocumentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndiMappingController implements IndimappingsApi {

    @Autowired
    private IndividualDocumentMappingService service;

    @Override
    public ResponseEntity<ResponseMessage> createMapping(IndiMappingModelRequest body) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseMessage> deleteMapping(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<IndiMappingModelResponse> getAllMapping() {

        return null;
    }

    @Override
    public ResponseEntity<ResponseMessage> updateMapping(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<IndiMappingModelResponse> findMappingById(@NotNull Integer id) {
        IndiMappingModelResponse response = new IndiMappingModelResponse();
        response.data(new ArrayList<>());
        try{
            List<IndiMappingModel> models = service.findById(id);
            response.data(models);
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception e){
           e.printStackTrace();
           return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
