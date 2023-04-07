package com.example.designPatternPractice.domain.model.dependencyInversion.noDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来controllerクラスは、presentation/controllerに作成する
 * **/
public class UserController {
    private UserService userService = new UserService();

    public User create(User user) {
        return this.userService.create(user);
    }

    public User findById(String id) {
        return this.userService.findById(id);
    }
}
