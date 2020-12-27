import me.study.UserRequest

/**
 * @date 2020/12/27
 * @author Bomi
 */

fun main() {
    // 데이터 요청
    // grpc-server의 main을 먼저 실행하지 않을 시, Exception 발생
    val user = userServiceBlockingStub(channel())
        .getUser(
            UserRequest.newBuilder()
                .setId(1)
                .build()
        )

    println("User Id: " + user.id)
    println("User Name: " + user.name)
}