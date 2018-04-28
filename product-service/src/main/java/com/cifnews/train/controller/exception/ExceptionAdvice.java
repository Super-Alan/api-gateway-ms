package com.cifnews.train.controller.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucky on 2018/4/27.
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex){
        Map map = new HashMap();
        map.put("cause",ex.getCause().toString());
        map.put("message",ex.getLocalizedMessage());
        return map;
    }
}
