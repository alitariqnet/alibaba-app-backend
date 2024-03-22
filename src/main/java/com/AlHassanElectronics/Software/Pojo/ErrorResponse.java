package com.AlHassanElectronics.Software.Pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("error_response")
@JsonInclude(
        value = JsonInclude.Include.NON_NULL
)
public class ErrorResponse {

    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "error_code")
    private String errorCode;
    @JsonProperty(value = "message")
    private String message;
//    @JsonProperty(value = "exception")
//    private Exception exception;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public Exception getException() {
//        return exception;
//    }
//
//    public void setException(Exception exception) {
//        this.exception = exception;
//    }
}
