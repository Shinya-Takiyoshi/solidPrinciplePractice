package dependencyInversion.yesDI;

import lombok.RequiredArgsConstructor;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来serviceクラスは、application/serviceに作成する
 * **/
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final IUserRepository userRepository;
    @Override
    public dependencyInversion.yesDI.User create(dependencyInversion.yesDI.User user) {
        return this.userRepository.create(user);
    }
    @Override
    public User findById(String id) {
        return this.userRepository.findById(id);
    }
}
