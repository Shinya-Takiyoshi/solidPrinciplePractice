package com.example.designPatternPractice.domain.model.dependencyInversion.noDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来serviceクラスは、application/serviceに作成する
 * **/
public class UserService {
    private UserRepository userRepository = new UserRepository();
    public User create(User user) {
        return this.userRepository.create(user);
    }

    public User findById(String id) {
        return this.userRepository.findById(id);
    }
}
