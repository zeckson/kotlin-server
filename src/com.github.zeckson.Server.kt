@JsModule("http")
external object http {
    fun get(options: dynamic, callback: (IncomingMessage) -> Unit): IncomingMessage
    fun createServer(requestListener: (IncomingMessage, ServerResponse) -> Unit): Server
}

external interface IncomingMessage {
    val url: String
}

external interface ServerResponse {
    fun end(content: String);
}

external interface Server {
    fun listen(port: Int, handler: (String?) -> Unit)
}

fun main(args: Array<String>) {

    console.log("Starting up...");
    val server = http.createServer({ req, res ->
        console.log(req.url);
        res.end("Hello World!")
    })

    server.listen(3000, { err ->
        if (err != null) {
            console.log(err)
        }
        console.log("Server started")
    })
    console.log("Up and running")
}