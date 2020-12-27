import io.grpc.ManagedChannel
import me.study.UserServiceGrpc

/**
 * @date 2020/12/27
 * @author Bomi
 */

fun userServiceBlockingStub(managedChannel: ManagedChannel): UserServiceGrpc.UserServiceBlockingStub {
    return UserServiceGrpc.newBlockingStub(managedChannel)
}