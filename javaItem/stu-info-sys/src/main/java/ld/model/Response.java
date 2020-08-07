package ld.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author LD
 * @date 2020/8/7 20:00
 */
@Getter
@Setter
@ToString
public class Response {
    private boolean success;//业务是否处理成功
    private  String code;//错误码
    private String message;//错误消息
    private Object data;//业务字段
    private String stackTrace;//出现异常时，堆栈信息

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
