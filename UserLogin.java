package com.morriscm.Project0;

public class UserLogin {

    private String username;
    private String password;

    public UserLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String toString(){
        String s = "Username: " + username + ", Password: " + password;
        return s;
    }
}
