package com.AlHassanElectronics.Software.advice;

import com.AlHassanElectronics.Software.Pojo.ErrorResponse;
import com.AlHassanElectronics.Software.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice(annotations = RestController.class)
public class GlobalExceptionAdvice {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleObjectNotFoundException(ObjectNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
//        errorResponse.setException(ex);
        errorResponse.setMessage(ex.getMessage() != null ? ex.getMessage() : "Error occurred please refer to the exception object for details");
        errorResponse.setId(0);
        errorResponse.setErrorCode("400");
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }


}
