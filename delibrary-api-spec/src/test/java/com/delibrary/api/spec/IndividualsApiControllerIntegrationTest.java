package com.delibrary.api.spec;

import java.math.BigDecimal;
import com.delibrary.api.model.ErrorResponse;
import com.delibrary.api.model.IndividualModelRequest;
import com.delibrary.api.model.IndividualModelResponse;
import com.delibrary.api.model.ResponseMessage;

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
public class IndividualsApiControllerIntegrationTest {

    @Autowired
    private IndividualsApi api;

    @Test
    public void createIndividualTest() throws Exception {
        IndividualModelRequest body = new IndividualModelRequest();
        ResponseEntity<ResponseMessage> responseEntity = api.createIndividual(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteIndividualTest() throws Exception {
        ResponseEntity<ResponseMessage> responseEntity = api.deleteIndividual(null);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllIndividualTest() throws Exception {
        ResponseEntity<IndividualModelResponse> responseEntity = api.getAllIndividual();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateIndividualTest() throws Exception {
        ResponseEntity<ResponseMessage> responseEntity = api.updateIndividual(null);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
