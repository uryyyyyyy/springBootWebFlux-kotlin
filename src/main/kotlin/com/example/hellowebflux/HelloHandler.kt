package com.example.hellowebflux;

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
open class HelloHandler {

  fun hello(req: ServerRequest): Mono<ServerResponse> {
    return ok().body(Mono.just("hello wossrld"))
  }

  fun helloJson(req: ServerRequest): Mono<ServerResponse> {
    return ok()
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(Mono.just(Response(true)))
  }
}
