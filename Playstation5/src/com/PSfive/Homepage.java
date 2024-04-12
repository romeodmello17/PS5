package com.PSfive;

import java.util.Scanner;

public class Homepage extends PSregistration {

    Scanner sc = new Scanner(System.in);
    PSregistration ps = new PSregistration();

    Store store = new Store();
    boolean duplicateObj = false;

    public void displayHomePage() throws Exception {
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
        System.out.println("1) Your profile");
        System.out.println("2) Game Store");
        System.out.println("3) My Library");
        System.out.println("4) Exit");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                myDetails();
                break;
            case 2:
                store.gameStore();
                break;
            case 3:
                store.myLibrary();
                break;
                case 4:
                System.out.println("PS5 Exiting....");
                Thread.sleep(1000);
                System.exit(0);
                break;

            default:
                System.err.println("Invalid Option ! Try Again.");
                displayHomePage();
                break;
        }

    }

    // public void addGamestoCart(){
    // if(duplicateObj == true){
    // store.action();
    // }else{

    // }
    // }

    public void myDetails() throws Exception {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("");
        System.out.println("1) Game Store");
        System.out.println("2) Home Page");
        System.out.println("3) Exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                store.gameStore();
                break;
            case 2:
                displayHomePage();
                break;
            case 3:
                System.out.println("PS5 Exiting...");
                Thread.sleep(1000);
                System.exit(0);
                break;
                default:
                System.out.println("Enter Above Options Only");
                myDetails();
                break;
        }

    }
}
