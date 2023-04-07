package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来repositoryクラスは、infrastructureに作成する
 * **/
public class UserRepository implements IUserRepository{
    @Override
    public User create(User user) {
        System.out.println("DBにUserを登録");
        return user;
    }
    @Override
    public User findById(String id) {
        System.out.println(id+"のユーザーを検索");
        return new User(id);
    }
}
