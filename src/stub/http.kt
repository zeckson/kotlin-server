package stub

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
