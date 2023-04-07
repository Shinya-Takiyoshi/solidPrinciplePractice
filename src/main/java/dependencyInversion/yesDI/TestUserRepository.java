package dependencyInversion.yesDI;

/**
 * 練習のため、クラスをパッケージでまとめている。
 * 本来repositoryクラスは、infrastructureに作成する
 * **/
public class TestUserRepository implements IUserRepository {
    @Override
    public dependencyInversion.yesDI.User create(dependencyInversion.yesDI.User user) {
        System.out.println("DBにTestUserを登録");
        return user;
    }
    @Override
    public dependencyInversion.yesDI.User findById(String id) {
        System.out.println(id+"のTestユーザーを検索");
        return new User(id);
    }
}
