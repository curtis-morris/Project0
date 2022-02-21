package com.morriscm.Project0;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> getUsers() throws SQLException;

    User getUserById(int id) throws SQLException;
    UserLogin getUserByName(String username) throws SQLException;

//    void authUser001(String username, String password) throws SQLException;

    //    public void authUser001(String username, String password) throws SQLException {
    String authUser() throws SQLException;
}
