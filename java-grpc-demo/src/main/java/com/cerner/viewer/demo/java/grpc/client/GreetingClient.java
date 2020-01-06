package com.cerner.viewer.demo.java.grpc.client;

import com.cerner.viewer.demo.java.grpc.GreetingServiceGrpc;
import com.cerner.viewer.demo.java.grpc.GreetingServiceGrpc.GreetingServiceBlockingStub;
import com.cerner.viewer.demo.java.grpc.HelloRequest;
import com.cerner.viewer.demo.java.grpc.HelloResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient
{
    public static void main(final String args[])
    {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2021).usePlaintext().build();
        final GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        final HelloResponse response = stub.greeting(HelloRequest.newBuilder().setName("Ankush").build());
        System.out.println(response);
    }
}
