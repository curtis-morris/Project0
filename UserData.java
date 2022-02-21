package com.morriscm.Project0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserData {

//    Connection connection;
//    Statement statement;

    public static void storeData(Connection connection) throws SQLException {
        String sql = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String email = resultSet.getString(4);

            System.out.println("ID: " + id + ", Username:" + username + ", Password:"
            + password + ", Email: " + email);
        }
    }
}
