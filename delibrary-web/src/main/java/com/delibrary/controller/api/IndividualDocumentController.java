package com.delibrary.controller.api;


import com.delibrary.api.model.DocumentModel;
import com.delibrary.api.model.DocumentModelRequest;
import com.delibrary.api.model.DocumentModelResponse;
import com.delibrary.api.model.ResponseMessage;
import com.delibrary.api.spec.IndidocumentsApi;
import com.delibrary.dao.service.IndividualDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndividualDocumentController  implements IndidocumentsApi {

    @Autowired
    private IndividualDocumentService documentService;

    @Override
    public ResponseEntity<DocumentModelResponse> createIndDoc(DocumentModelRequest body) {

        return null;
    }

    @Override
    public ResponseEntity<ResponseMessage> deleteIndiDocument(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<DocumentModelResponse> getAllIndDocuments() {
        DocumentModelResponse response = new DocumentModelResponse();
        try{
            List<DocumentModel> models = documentService.findAll();
            for(DocumentModel item : models){
                response.addDataItem(item);
            }
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception e){
          e.printStackTrace();
          return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ResponseMessage> updateIndiDocument(Integer id) {
        return null;
    }
}
