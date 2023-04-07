package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

import lombok.RequiredArgsConstructor;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来serviceクラスは、application/serviceに作成する
 * **/
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final IUserRepository userRepository;
    @Override
    public User create(User user) {
        return this.userRepository.create(user);
    }
    @Override
    public User findById(String id) {
        return this.userRepository.findById(id);
    }
}
