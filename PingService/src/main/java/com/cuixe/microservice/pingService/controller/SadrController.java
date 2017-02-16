package com.cuixe.microservice.pingService.controller;

import com.cuixe.microservice.pingService.domain.PingRequest;
import com.cuixe.microservice.pingService.domain.PingResponse;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hfuentes on 15/02/17.
 */
@Api
@RestController
@RequestMapping("sadr/")
public class SadrController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.POST, value = "ping/")
    @ApiOperation(value = "ping", nickname = "ping", response = PingResponse.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 201, message = "Created"), @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
    public PingResponse ping(
            @ApiParam(value = "request", required = true) @RequestBody(required = true) PingRequest request) {

        logger.debug("--> ping received");
        logger.debug("--> id: {}", request.getId());
        logger.debug("--> content: {}", request.getMessage());

        return new PingResponse("Hello from Sadr - " + request.getId() + " - " + request.getMessage());
    }
}