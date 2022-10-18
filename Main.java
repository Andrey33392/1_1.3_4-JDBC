package com.jdbc.database;

import service.UserService;
import service.UserServiceImpl;
import userModel.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        User user1 = new User("Miki", "Stoun", (byte) 24);
        User user2 = new User("Masha", "Luny", (byte) 20);
        User user3 = new User("Tom", "Anderson", (byte) 65);
        User user4 = new User("Max", "Barskih", (byte) 45);

//       userService.creatUsersTable();
       userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        userService.getAllUsers();
//        userService.removeUserById(5);
//        userService.cleanUsersTable();
        userService.dropUsersTable();


    }

}
