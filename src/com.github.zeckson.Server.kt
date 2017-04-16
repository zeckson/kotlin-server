import stub.http

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