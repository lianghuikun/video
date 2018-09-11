package com.zkar.enums;

public enum  ResultCodeEnum {



;






    private Integer resultCode;// 错误码
    private String errorCode;// 定义
    private String message; // 描述

    ResultCodeEnum(Integer resultCode, String errorCode, String message) {
        this.resultCode = resultCode;
        this.errorCode = errorCode;
        this.message = message;
    }
}
