package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来repositoryクラスは、infrastructureに作成する
 * **/
public class TestUserRepository implements IUserRepository{
    @Override
    public User create(User user) {
        System.out.println("DBにTestUserを登録");
        return user;
    }
    @Override
    public User findById(String id) {
        System.out.println(id+"のTestユーザーを検索");
        return new User(id);
    }
}
