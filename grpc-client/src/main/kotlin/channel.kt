import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import java.util.concurrent.TimeUnit

/**
 * @date 2020/12/27
 * @author Bomi
 */

fun channel(): ManagedChannel {
    val host = "localhost"
    val port = 9595

    return ManagedChannelBuilder
        .forAddress(host, port)
        .keepAliveTimeout(5000, TimeUnit.MILLISECONDS)
        .keepAliveTime(5000, TimeUnit.MILLISECONDS)
        .keepAliveWithoutCalls(true)
        .useTransportSecurity()
        .usePlaintext().build()
}