package com.my.wiki.resp;

//通用返回类
public class CommonResp<T> {

    private boolean success = true;

    private String message;

    /**
     * 返回的泛型数据
     */
    private T content;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
