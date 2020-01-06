package com.cerner.viewer.demo.java.grpc.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GreetingServer
{
    public static void main(final String args[]) throws IOException, InterruptedException
    {
        final Server server = ServerBuilder.forPort(2021).addService(new GreetingServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
