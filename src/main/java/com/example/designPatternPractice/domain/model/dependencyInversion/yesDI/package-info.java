/**
    * package-info SOLID原則の依存性逆転の原則のgood例
    * goodの理由
    * 下記の依存関係となっているが、下位の依存関係が完成してない場合でも上位の開発ができる。
    * 依存性をクラス毎に切り離しているため、一部クラスを置き換えてテストができる。
    * UserController ->  UserService -> UserRepository
    * 例)
    * UserRepositoryが未完成
    * UserController,UserServiceが完成
    * UserRepositoryが未完成ではあるが、テスト用のTestUserRepositoryクラスを作成してUserController,UserService自体のテストはできる。
    * UserRepositoryが完成後、テスト用のTestUserRepositoryクラスと置き換えてテストすれば良いためテストが依存しなくなる。
* **/
package com.example.designPatternPractice.domain.model.dependencyInversion.yesDI;