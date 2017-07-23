package com.example.hellowebflux;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {

  public Mono<ServerResponse> hello(ServerRequest req) {
    return ok().body(Flux.just("aaaa", "vvbbbb!"), String.class);
  }
}
