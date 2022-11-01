package com.score.scorecalculator.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(value = MyResourceNotFoundException.class)
    protected ResponseEntity<Object> handleNotFound(
            MethodArgumentNotValidException ex, WebRequest request) {
        ApiError apiError =
                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), new ArrayList<>(Collections.singletonList(ex.getMessage())));
        return new ResponseEntity<>(
                apiError, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }


}
