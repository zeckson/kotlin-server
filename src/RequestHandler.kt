import stub.IncomingMessage
import stub.ServerResponse

val handler = { req:IncomingMessage, res:ServerResponse ->
    console.log(req.url);
    res.end("Hello World!")
}