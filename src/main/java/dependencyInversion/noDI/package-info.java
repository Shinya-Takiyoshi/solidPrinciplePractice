/**
 * package-info SOLID原則の依存性逆転の原則のbad例
 * badの理由
 * 下記の依存関係となっているが、下位の依存関係が完成してない場合、上位の開発もできない。
 * 依存してしまっている状態。またテストも切り替えができない。
 * UserController ->  UserService -> UserRepository
 * 例)
 * UserRepositoryが未完成
 * UserController,UserServiceが完成
 * しかし、UserRepositoryが未完成のため、テストができない状態になる。
 * **/
package dependencyInversion.noDI;