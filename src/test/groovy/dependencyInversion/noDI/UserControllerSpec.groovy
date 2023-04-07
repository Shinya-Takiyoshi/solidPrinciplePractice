package dependencyInversion.noDI


import spock.lang.Specification
import spock.lang.Unroll

class UserControllerSpec extends Specification {
    static UserController userController

    def setup(){
        userController = new UserController()
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
