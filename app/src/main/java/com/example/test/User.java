package com.example.test;

/**
 * Created by Mitch on 2016-05-13.
 */
public class User {
    private String FirstText;
    private String SecondText;
    private String ThirdText;
    private String fourText;


    public User(String name, String phone, String email, String age){
        FirstText = name;
        SecondText = phone;
        ThirdText = email;
        fourText  = age ;

    }

    public String getFirstText() {
        return FirstText;
    }

    public void setFirstText(String name) {
        FirstText = name;
    }

    public String getSecondText() {
        return SecondText;
    }

    public void setSecondText(String phone) {
        SecondText = phone;
    }

    public String getThirdText() {
        return ThirdText;
    }

    public void setThirdText(String email) {
        ThirdText = email;
    }
    public String getfourText() {
        return fourText;
    }

    public void setfourText(String age) {
        fourText = age;
    }

}
