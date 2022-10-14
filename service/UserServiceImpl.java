package service;

import userModel.User;
import dao.UserDao;
import dao.UserDaoJDBCImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();

    @Override
    public void creatUsersTable() {
        userDao.createUsersTable();


    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

        userDao.saveUser(name, lastName, age);
        System.out.println("User name -" + name + " added to database");


    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userDao.getAllUsers();

        users.stream().forEach(System.out::println);
        return users;
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
