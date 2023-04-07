package dependencyInversion.noDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来controllerクラスは、presentation/controllerに作成する
 * **/
public class UserController {
    private final dependencyInversion.noDI.UserService userService = new UserService();

    public dependencyInversion.noDI.User create(dependencyInversion.noDI.User user) {
        return this.userService.create(user);
    }

    public User findById(String id) {
        return this.userService.findById(id);
    }
}
