package com.dawnop.server.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {

    private long code;
    private String message;
    private Object data;

    public static RespBean success(String message) {
        return new RespBean(200, message, null);
    }

    public static RespBean success(String message, Object o) {
        return new RespBean(200, message, o);
    }

    public static RespBean error(String message) {
        return new RespBean(500, message, null);
    }

    public static RespBean error(String message, Object o) {
        return new RespBean(500, message, o);
    }
}
