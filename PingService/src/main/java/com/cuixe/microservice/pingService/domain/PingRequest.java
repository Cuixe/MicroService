package com.cuixe.microservice.pingService.domain;

/**
 * Created by hfuentes on 15/02/17.
 */
public class PingRequest {

    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
