package com.delibrary.api.spec;

import java.math.BigDecimal;
import com.delibrary.api.model.ErrorResponse;
import com.delibrary.api.model.IndiMappingModelRequest;
import com.delibrary.api.model.IndiMappingModelResponse;
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
public class IndimappingsApiControllerIntegrationTest {

    @Autowired
    private IndimappingsApi api;

    @Test
    public void createMappingTest() throws Exception {
        IndiMappingModelRequest body = new IndiMappingModelRequest();
        ResponseEntity<ResponseMessage> responseEntity = api.createMapping(null);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteMappingTest() throws Exception {
        ResponseEntity<ResponseMessage> responseEntity = api.deleteMapping(null);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllMappingTest() throws Exception {
        ResponseEntity<IndiMappingModelResponse> responseEntity = api.getAllMapping();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateMappingTest() throws Exception {
        ResponseEntity<ResponseMessage> responseEntity = api.updateMapping(null);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
