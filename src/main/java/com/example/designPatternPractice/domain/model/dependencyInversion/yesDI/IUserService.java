package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;

public interface IUserService {
    User create(User user);
    User findById(String id);
}
