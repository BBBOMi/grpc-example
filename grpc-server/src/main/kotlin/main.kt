import io.grpc.Server
import io.grpc.ServerBuilder

/**
 * @date 2020/12/27
 * @author Bomi
 */

fun main() {
    val port = 9595
    val server: Server = ServerBuilder
        .forPort(port)
        .addService(UserService())
        .build()

    server.start()
    server.awaitTermination()
}