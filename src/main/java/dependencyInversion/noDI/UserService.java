package dependencyInversion.noDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来serviceクラスは、application/serviceに作成する
 * **/
public class UserService {
    private final UserRepository userRepository = new UserRepository();
    public dependencyInversion.noDI.User create(dependencyInversion.noDI.User user) {
        return this.userRepository.create(user);
    }

    public User findById(String id) {
        return this.userRepository.findById(id);
    }
}
