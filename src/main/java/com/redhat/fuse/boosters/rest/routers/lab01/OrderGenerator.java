package com.redhat.fuse.boosters.rest.routers.lab01;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

import com.redhat.fuse.boosters.rest.service.OrderService;

@Component
public class OrderGenerator extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:generate")
            .log("hello router!");

    }

}
