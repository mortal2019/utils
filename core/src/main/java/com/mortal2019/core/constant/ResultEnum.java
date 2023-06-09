package com.mortal2019.core.constant;

/**
 * @author wuyiyuan
 * @version v1.0.0.0
 * Created DateTime 2023/4/23 14:14
 */
public enum ResultEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    CUSTOM_ERROR(-1,"自定义错误"),
    ;

    private final Integer code;
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
