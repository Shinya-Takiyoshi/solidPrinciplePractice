package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

public interface IUserRepository {
    User create(User user);
    User findById(String id);
}
