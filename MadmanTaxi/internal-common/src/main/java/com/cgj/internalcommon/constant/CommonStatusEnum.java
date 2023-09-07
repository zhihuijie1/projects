package com.cgj.internalcommon.constant;


import lombok.Data;
import lombok.Getter;

public enum CommonStatusEnum {
    SUCCESS(1,"success"),
    FAIL(0,"fail");
    @Getter
    private int code;
    @Getter
    private String value;

    /*构造器私有化，智能自己调用*/
    CommonStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
