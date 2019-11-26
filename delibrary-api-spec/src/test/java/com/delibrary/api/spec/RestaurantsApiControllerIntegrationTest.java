package com.delibrary.api.spec;

import com.delibrary.api.model.CorporateModel;
import com.delibrary.api.model.CorporateModelResponse;
import com.delibrary.api.model.DocumentModel;
import com.delibrary.api.model.DocumentModelResponse;
import com.delibrary.api.model.ErrorResponse;
import com.delibrary.api.model.IndiMappingModel;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.model.RestaurantMappingModel;
import com.delibrary.api.model.RestaurantMappingResponse;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantsApiControllerIntegrationTest {

    @Autowired
    private RestaurantsApi api;

    @Test
    public void createMappingTest() throws Exception {
        IndiMappingModel body = new IndiMappingModel();
        ResponseEntity<ResponseMessage> responseEntity = api.createMapping(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createRestaurantDocumentsTest() throws Exception {
        DocumentModel body = new DocumentModel();
        ResponseEntity<DocumentModelResponse> responseEntity = api.createRestaurantDocuments(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteRestaurantTest() throws Exception {
        Integer id = 56;
        ResponseEntity<CorporateModelResponse> responseEntity = api.deleteRestaurant(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteRestaurantDocTest() throws Exception {
        Integer id = 56;
        ResponseEntity<ResponseMessage> responseEntity = api.deleteRestaurantDoc(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteRestaurantMappingTest() throws Exception {
        Integer id = 56;
        ResponseEntity<ResponseMessage> responseEntity = api.deleteRestaurantMapping(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findRestaurantMappingByIdTest() throws Exception {
        Integer id = 56;
        ResponseEntity<IndiMappingModel> responseEntity = api.findRestaurantMappingById(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllRestaurantDocumentsTest() throws Exception {
        ResponseEntity<DocumentModelResponse> responseEntity = api.getAllRestaurantDocuments();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getRestaurantMappingTest() throws Exception {
        ResponseEntity<RestaurantMappingResponse> responseEntity = api.getRestaurantMapping();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getRestaurantsTest() throws Exception {
        ResponseEntity<CorporateModelResponse> responseEntity = api.getRestaurants();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void saveRestaurantTest() throws Exception {
        CorporateModel body = new CorporateModel();
        ResponseEntity<CorporateModelResponse> responseEntity = api.saveRestaurant(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateRestaurantTest() throws Exception {
        Integer id = 56;
        CorporateModel body = new CorporateModel();
        ResponseEntity<CorporateModelResponse> responseEntity = api.updateRestaurant(id, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateRestaurantDocumentTest() throws Exception {
        Integer id = 56;
        DocumentModel body = new DocumentModel();
        ResponseEntity<ResponseMessage> responseEntity = api.updateRestaurantDocument(id, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateRestaurantMappingTest() throws Exception {
        Integer id = 56;
        RestaurantMappingModel body = new RestaurantMappingModel();
        ResponseEntity<ResponseMessage> responseEntity = api.updateRestaurantMapping(id, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
