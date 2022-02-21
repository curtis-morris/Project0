package com.morriscm.Project0;

//import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        UserDao dao = UserDaoFactory.getUserDao();
        BankAccountDao bankAccountDao = BankAccountDaoFactory.getBankAccountDao();
//        dao.getUsers();

//        dao.getUserById(3);

//        dao.getUserByName("Mike");

//        UserData.storeData(ConnectionFactory.getConnection());

//        dao.authUser();
        String userLoggedIn = dao.authUser();
        System.out.println();
        System.out.println("\n\n------------------------------------");
        System.out.println("*** Welcome to The Bank App ***");
        System.out.println("------------------------------------");

        do {
            System.out.println("------------------------------------");
            System.out.println("Main Menu");
            System.out.println("------------------------------------");
            System.out.println("Please make a selection from the following choices: ");
            System.out.println("\n 1. Check Balances\n 2. Deposit Money\n 3. Withdraw Money\n");
            System.out.println("Press 4 to exit the system.");


            switch (sc.nextInt()) {
                case 1:
                    bankAccountDao.checkBalance(userLoggedIn);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("How much to deposit?");
                    int depositMoney = sc.nextInt();
                    bankAccountDao.depositMoney(depositMoney, userLoggedIn);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("How much to withdraw?");
                    int withdrawMoney = sc.nextInt();
                    bankAccountDao.withdrawMoney(withdrawMoney, userLoggedIn);
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);



    }
}
