package com.PSfive;

import java.util.Scanner;

public class Homepage {
    
    
    Scanner sc = new Scanner(System.in);
    Store  store = new Store();
  
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
        System.out.println("1) Game Store");
        System.out.println("2) My Library");
        System.out.println("3) Game Pass");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                store.gameStore();
            
                break;
        
            default:
                break;
        }

    }
}
