package com.morriscm.Project0;

import java.sql.*;
import java.util.Scanner;

public class BankAccountDaoImpl implements BankAccountDao {

    private static final Scanner sc = new Scanner(System.in);

    Connection connection;
    Statement statement;

    public BankAccountDaoImpl() {
            this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public int withdrawMoney(int amount, String username) throws SQLException {

        String sql = "update bank_account set account_balance = account_balance - ? where account_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, amount);
        preparedStatement.setString(2, username);
        int count = preparedStatement.executeUpdate();
        if(count > 0){
            System.out.println("Account updated successfully");
        }else{
            System.out.println("Oops!, something went wrong.");
        }
        return 0;
    }

    @Override
    public int depositMoney(int amount, String username) throws SQLException {

        String sql = "update bank_account set account_balance = account_balance + ? where account_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, amount);
        preparedStatement.setString(2, username);
        int count = preparedStatement.executeUpdate();
        if(count > 0){
            System.out.println("Account updated successfully");
        }else{
            System.out.println("Oops!, something went wrong.");
        }

        return 0;
    }

    @Override
    public void checkBalance(String username) throws SQLException {
        statement = connection.createStatement();
        String sql = "select * from bank_account where account_name = " + "'" + username + "'";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("Account ID: " + resultSet.getInt(1) +
                    ", Account Name: " + resultSet.getString(2) + ", Account Balance: " +
                    resultSet.getInt(3));
        }
    }
}
