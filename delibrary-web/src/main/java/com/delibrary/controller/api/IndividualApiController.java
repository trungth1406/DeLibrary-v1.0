package com.delibrary.controller.api;

import com.delibrary.api.model.IndividualModel;
import com.delibrary.api.model.IndividualModelRequest;
import com.delibrary.api.model.IndividualModelResponse;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.spec.IndividualsApi;
import com.delibrary.dao.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class IndividualApiController implements IndividualsApi {

    @Autowired
    private IndividualService individualService;

    @Override
    public ResponseEntity<ResponseMessage> createIndividual(IndividualModelRequest body) {

        return null;
    }

    @Override
    public ResponseEntity<ResponseMessage> deleteIndividual(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<IndividualModelResponse> getAllIndividual() {
        IndividualModelResponse message = new IndividualModelResponse();
        try{
            List<IndividualModel> models = individualService.findAll();
            for(IndividualModel item : models){
                message.addDataItem(item);
            }
            return new ResponseEntity(message,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> updateIndividual(Integer id) {
        return null;
    }
}