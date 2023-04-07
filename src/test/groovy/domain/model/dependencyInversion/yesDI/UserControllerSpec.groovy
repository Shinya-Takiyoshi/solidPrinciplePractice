package domain.model.dependencyInversion.yesDI

import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.IUserRepository
import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.IUserService
import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.TestUserRepository
import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.UserService
import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.User
import com.example.designPatternPractice.domain.model.dependencyInversion.yesDI.UserController
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
