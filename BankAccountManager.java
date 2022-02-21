package com.morriscm.Project0;

import java.sql.SQLException;

public class BankAccountManager {

//    public static void main(String[] args) {
//        System.out.println("*** Welcome to Haliburton National Bank ***");
//        System.out.println("****** Please Log in ******");
//        try {
////            LoginVerify00.authUser(ConnectionFactory.getConnection());
////            if(LoginVerify00.authUser(ConnectionFactory.getConnection())){
////                System.out.println("Please make a selection from the following choices:");
////                System.out.println(MenuSection.menu);
////            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public class MenuSection {
        static String mainMenu = String.format("Main Menu %n");
        static String selection = String.format("Please make a selection from the following choices: %n");
        static String choices = String.format("\n 1. Check Balances\n 2. Transfer Money\n 3. View Transactions\n");
        static String exit = String.format("Press 5 to exit the system %n");

        static String menu = mainMenu + selection + choices + exit;
    }
}
