package service;

import userModel.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void creatUsersTable();

    void dropUsersTable() throws SQLException;

    void saveUser(String name, String lastName, byte age) throws SQLException;

    void removeUserById(long id);

    List<User> getAllUsers() throws SQLException;

    void cleanUsersTable();
}
