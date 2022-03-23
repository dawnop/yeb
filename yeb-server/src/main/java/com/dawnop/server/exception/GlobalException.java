package com.dawnop.server.exception;

import com.dawnop.server.pojo.RespBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public RespBean mySQLException(SQLException e) {
        return RespBean.error("数据库异常，操作失败");
    }

    @ExceptionHandler(JsonProcessingException.class)
    public RespBean myJsonProcessingException(JsonProcessingException e) {
        return RespBean.error("发送的信息有误，操作失败");
    }
}
