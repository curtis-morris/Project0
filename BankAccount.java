package com.morriscm.Project0;

class InSufficientFundException extends Exception{
    public InSufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InSufficientFundException(String message){
        System.out.println(message);
    }
}

public class BankAccount {
    private int account_balance;
    private int account_number;
    private String account_name;

    public BankAccount(int account_number, String account_name) {
        this.account_number = account_number;
//        this.account_balance = account_balance;
        this. account_name = account_name;
    }







}
