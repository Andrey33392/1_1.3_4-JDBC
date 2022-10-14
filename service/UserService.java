package service;

import userModel.User;

import java.util.List;

public interface UserService {
    void creatUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
