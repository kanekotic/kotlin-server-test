package com.kanekotic.blindly.server

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

class Server {
    fun start(){
        val server = embeddedServer(Netty, 8080) {
            routing {
                get("/") {
                    call.respondText("Hello Blindly")
                }
            }
        }
        server.start(wait = true)

    }
}