package com.delibrary.api.spec;

import java.math.BigDecimal;
import com.delibrary.api.model.DocumentModelRequest;
import com.delibrary.api.model.DocumentModelResponse;
import com.delibrary.api.model.ErrorResponse;
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
public class IndidocumentsApiControllerIntegrationTest {

    @Autowired
    private IndidocumentsApi api;

    @Test
    public void createIndDocTest() throws Exception {
        DocumentModelRequest body = new DocumentModelRequest();
        ResponseEntity<DocumentModelResponse> responseEntity = api.createIndDoc(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteIndiDocumentTest() throws Exception {
        BigDecimal id = new BigDecimal();
        ResponseEntity<ResponseMessage> responseEntity = api.deleteIndiDocument(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllIndDocumentsTest() throws Exception {
        ResponseEntity<DocumentModelResponse> responseEntity = api.getAllIndDocuments();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateIndiDocumentTest() throws Exception {
        BigDecimal id = new BigDecimal();
        ResponseEntity<ResponseMessage> responseEntity = api.updateIndiDocument(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
