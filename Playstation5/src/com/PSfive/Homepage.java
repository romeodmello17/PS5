package com.PSfive;

import java.util.Scanner;

public class Homepage extends PSregistration {

    Scanner sc = new Scanner(System.in);
    Store store = new Store();
boolean duplicateObj = false;
    public void displayHomePage() {
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                               Welcome to the PS5 Console!");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }

    
        System.out.println();
        System.out.println("Please choose an option:");
        System.out.println("1) " + getUsername());
        System.out.println("2) Game Store");
        System.out.println("3) My Library");
        System.out.println("4) Game Pass");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                myDetails();
                break;
            case 2:
                store.gameStore();
                break;
            default:
                System.err.println("Invalid Option ! Try Again.");
                break;
        }

    }

    // public void addGamestoCart(){
    //     if(duplicateObj == true){
    //         store.action();
    //     }else{
        
    //     }
    // }

    public void myDetails() {

        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println(
                "                                                                                          YOUR PROFILE                    ");
        for (int i = 0; i < 50; i++) {
            System.out.print("            -");
        }
        System.out.println();
        System.out.println("Your Country : " + getLocation());
        System.out.println("Name : " + getName() + " " + getLastname());
        System.out.println("Email ID : " + getMail());
        System.out.println("Contact : " + getContact());
        System.out.println("Username : " + getUsername());

    }
}
