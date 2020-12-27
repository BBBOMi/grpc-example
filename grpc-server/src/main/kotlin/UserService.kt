import io.grpc.stub.StreamObserver
import me.study.UserRequest
import me.study.UserResponse
import me.study.UserServiceGrpc

/**
 * @date 2020/12/27
 * @author Bomi
 */

class UserService: UserServiceGrpc.UserServiceImplBase() {
    override fun getUser(request: UserRequest, responseObserver: StreamObserver<UserResponse>) {
        val userResponse = UserResponse.newBuilder()
            .setId(1)
            .setName("test user")
            .build()

        responseObserver.onNext(userResponse)
        responseObserver.onCompleted()
    }
}