package com.morriscm.Project0;

import java.sql.SQLException;

public interface BankAccountDao {
//    int transferMoney(int amount);

    int withdrawMoney(int amount, String username) throws SQLException;

    int depositMoney(int amount, String username) throws SQLException;
    void checkBalance(String username) throws SQLException;

}
