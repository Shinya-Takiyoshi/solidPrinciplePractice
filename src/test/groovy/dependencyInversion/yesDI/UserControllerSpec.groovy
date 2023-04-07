package dependencyInversion.yesDI


import spock.lang.Specification
import spock.lang.Unroll

class UserControllerSpec extends Specification {
    static UserController userController
    static IUserService userService
    static IUserRepository userRepository
    def setup(){
        //Repositoryの中身をテスト用に置き換える
        userRepository = new TestUserRepository()
        //userRepository = new UserRepository()
        userService = new UserService(userRepository)
        userController = new UserController(userService)
    }
    @Unroll
    def "Create"() {
        given:
        User user = new User("1")
        expect:
        userController.create(user) == user
    }

    def "FindById"() {
        given:
        User user = new User("2")
        expect:
        userController.findById("2").getId() == user.getId()
    }
}
