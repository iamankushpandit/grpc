package com.cerner.viewer.demo.java.grpc.server;

import com.cerner.viewer.demo.java.grpc.GreetingServiceGrpc.GreetingServiceImplBase;
import com.cerner.viewer.demo.java.grpc.HelloRequest;
import com.cerner.viewer.demo.java.grpc.HelloResponse;

import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceImplBase
{
    @Override
    public void greeting(final HelloRequest request, final StreamObserver<HelloResponse> responseObserver)
    {
        // TODO Auto-generated method stub
        // super.greeting(request, responseObserver);

        final String name = request.getName();
        final HelloResponse value = HelloResponse.newBuilder().setGreeting("Hello " + name).build();

        responseObserver.onNext(value);
        responseObserver.onCompleted();
    }
}
