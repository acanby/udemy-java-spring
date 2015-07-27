package com.canby.spring.web.common;

import org.springframework.dao.DataAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by acanby on 28/05/2015.
 */
@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleExceptions(DataAccessException dae) {
        System.out.println(dae);
        return "error";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public String handleAccessDeniedException(AccessDeniedException ade) {
        System.out.println(ade);
        return "denied";
    }
}
