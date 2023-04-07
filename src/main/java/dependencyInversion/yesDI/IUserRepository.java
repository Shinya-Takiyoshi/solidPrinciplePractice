package dependencyInversion.yesDI;

public interface IUserRepository {
    dependencyInversion.yesDI.User create(dependencyInversion.yesDI.User user);
    User findById(String id);
}
