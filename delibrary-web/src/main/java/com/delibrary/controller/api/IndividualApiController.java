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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


@RestController
public class IndividualApiController implements IndividualsApi {

    @Autowired
    private IndividualService individualService;

    @Override
    public @ResponseBody ResponseEntity<ResponseMessage> createIndividual(IndividualModelRequest body) {
        try{
            individualService.create(body);
            return new ResponseEntity(new ResponseMessage().description("Success"),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> deleteIndividual(Integer id) {
        try{
            individualService.delete(id);
            return  new ResponseEntity(new ResponseMessage().description("Delete individual successfully"),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    public ResponseEntity<ResponseMessage> updateIndividual(Integer id, IndividualModelRequest body) {
        IndividualModel model = new IndividualModel();
        try {
            model.setId(id);
            model.setName(body.getName());
            model.setCompanyName(body.getCompanyName());
            model.setPosition(body.getPosition());
            model.setDob(body.getDob());
            individualService.edit(model);
            return new ResponseEntity(new ResponseMessage().description("Update ok"),HttpStatus.OK);
        } catch (ParseException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
