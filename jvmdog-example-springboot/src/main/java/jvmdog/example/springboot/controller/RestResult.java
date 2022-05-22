package jvmdog.example.springboot.controller;

public class RestResult<T> {
    private final T data;
    public RestResult(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    
}
