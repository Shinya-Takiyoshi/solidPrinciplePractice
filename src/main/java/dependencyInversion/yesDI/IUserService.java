package dependencyInversion.yesDI;

public interface IUserService {
    dependencyInversion.yesDI.User create(dependencyInversion.yesDI.User user);
    User findById(String id);
}
