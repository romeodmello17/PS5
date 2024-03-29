package com.PSfive;

import java.util.Scanner;

public class PSregistration {
    String username;
    String password;
    String cpasswaord;
    long contact;
    String mail;
    boolean isRegistered = false;
    
    public void signin(){
        if (isRegistered == false){
            System.out.println("Please register first by Creating an PS Account!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to sign in with contact");
        System.out.println("Press 2 to sign in with email id");
    }
}
