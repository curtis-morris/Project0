package com.morriscm.Project0;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {

    private static final Scanner sc = new Scanner(System.in);

    static String userLoggedIn;

    Connection connection;
    Statement statement;

    public UserDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public List<User> getUsers() throws SQLException {
        statement = connection.createStatement();
        String sql = "select id, username, email from users";
        ResultSet resultSet = statement.executeQuery(sql);

        List<User> users;
        users = new ArrayList<>();

        while (resultSet.next()) {
            User userList = new User(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3)); //resultSet.getString(4)); // This works out to be
                                                        // the number of the outputs rather than
                                                        // the number of actual columns

            users.add(userList);
        }
        System.out.println(users);
        return null;
    }

    @Override
    public User getUserById(int id) throws SQLException {
        statement = connection.createStatement();
        String sql = "select id, username, email from users where id = " + id;
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("Id: " + resultSet.getInt(1) + ", UserName: " +
                    resultSet.getString(2) + ", Email: " + resultSet.getString(3));
        }
        return null;
    }

    @Override
    public UserLogin getUserByName(String username) throws SQLException {
        statement = connection.createStatement();
        String sql = "select username from users where username = " + "'" + username + "'"; //will not work without the forward ticks in the string
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("Username: " + resultSet.getString(1));
        }

        return null;
    }

    @Override
    public String authUser() throws SQLException{
        String username;
        String password;

        boolean found = false;
        System.out.println("Please enter your username:");
        username = sc.next();
        System.out.println("Please enter your password:");
        password = sc.next();

        String sql = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next() && !found) {
            String tempUsername = resultSet.getString(2);
            String tempPassword = resultSet.getString(3);
            if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
                found = true;
//                userLoggedIn = tempUsername;
            } else {
                System.out.println("You have used an incorrect password and username combination");
                System.exit(0);
            }
        }
//        sc.close();

//        System.out.println(found);
        return username;

    }


}
