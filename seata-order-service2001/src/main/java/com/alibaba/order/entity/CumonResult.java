package com.alibaba.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CumonResult<T> implements Serializable {
    private int code;
    private String message;
    private T data;


    public static <T> CumonResult<T> ok() {
        return restResult(1, "SUCCESS", null);
    }

    public static <T> CumonResult<T> ok(T data) {
        return restResult(1, "SUCCESS", data);
    }

    public static <T> CumonResult<T> ok(T data, String msg) {
        return restResult(1, msg, data);
    }

    public static <T> CumonResult<T> failed() {
        return restResult(1, "FAIL", null);
    }

    public static <T> CumonResult<T> failed(String msg) {
            return restResult(0, msg, null);
    }

    public static <T> CumonResult<T> failed(T data) {
        return restResult(0, "FAIL", data);
    }

    public static <T> CumonResult<T> failed(T data, String msg) {
        return restResult(0, msg, data);
    }

    private static <T> CumonResult<T> restResult(int code, String message, T data) {
          CumonResult<T> apiResult= new CumonResult<>();
          apiResult.setCode(code);
          apiResult.setMessage(message);
          apiResult.setData(data);
          return apiResult;

    }

}
