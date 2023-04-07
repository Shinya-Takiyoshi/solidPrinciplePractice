package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

import lombok.RequiredArgsConstructor;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来controllerクラスは、presentation/controllerに作成する
 * **/
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    public User create(User user) {
        return this.userService.create(user);
    }

    public User findById(String id) {
        return this.userService.findById(id);
    }
}
