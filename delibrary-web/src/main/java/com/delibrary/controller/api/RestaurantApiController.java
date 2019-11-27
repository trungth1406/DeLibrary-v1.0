package com.delibrary.controller.api;

import com.delibrary.api.model.CorporateModel;
import com.delibrary.api.model.CorporateModelResponse;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.spec.RestaurantsApi;
import com.delibrary.dao.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestaurantApiController  implements RestaurantsApi {

    @Autowired
    private RestaurantService restaurantService;

    @Override
    public ResponseEntity<ResponseMessage> deleteRestaurant(Integer id) {
        try {
            restaurantService.deleteById((long) id);
            return new ResponseEntity(new ResponseMessage().description("Ok"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new ResponseMessage().description("Fail to delete restaurant"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<CorporateModelResponse> getRestaurants() {
        CorporateModelResponse response = new CorporateModelResponse();
        try {
            List<CorporateModel> models = restaurantService.findAll();
            response.data(models);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> saveRestaurant(CorporateModel body) {
        ResponseMessage responseMessage = new ResponseMessage();
        try {
            restaurantService.createNewRestaurant(body);
            responseMessage.description("Save restaurant successfully");
            return new ResponseEntity(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> updateRestaurant(Integer id, CorporateModel body) {
        ResponseMessage responseMessage = new ResponseMessage();
        try {
            restaurantService.updateRestaurantInfo(body);
            responseMessage.description("Update successfully");
            return new ResponseEntity(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
