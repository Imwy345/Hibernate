package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserServiceImpl userService = new UserServiceImpl();
    private static final User user1 = new User("Vladimir","Chernenko",(byte)20);
    private static final User user2 = new User("Ivan","Krivoruchko",(byte)23);
    private static final User user3 = new User("Maksim","Kalymulin",(byte)19);
    private static final User user4 = new User("Nikita","Keshishev",(byte)35);

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();
        userService.saveUser(user1.getName(),user1.getLastName(),user1.getAge());
        userService.saveUser(user2.getName(),user2.getLastName(),user2.getAge());
        userService.saveUser(user3.getName(),user3.getLastName(),user3.getAge());
        userService.saveUser(user4.getName(),user4.getLastName(),user4.getAge());
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
