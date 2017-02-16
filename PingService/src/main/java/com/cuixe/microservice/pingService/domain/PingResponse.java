package com.cuixe.microservice.pingService.domain;

/**
 * Created by hfuentes on 15/02/17.
 */
public class PingResponse {

    private String message;

    public PingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
