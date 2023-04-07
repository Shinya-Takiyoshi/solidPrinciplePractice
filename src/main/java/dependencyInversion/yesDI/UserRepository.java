package dependencyInversion.yesDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来repositoryクラスは、infrastructureに作成する
 * **/
public class UserRepository implements IUserRepository {
    @Override
    public dependencyInversion.yesDI.User create(dependencyInversion.yesDI.User user) {
        System.out.println("DBにUserを登録");
        return user;
    }
    @Override
    public dependencyInversion.yesDI.User findById(String id) {
        System.out.println(id+"のユーザーを検索");
        return new User(id);
    }
}
