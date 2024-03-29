package com.PSfive;

import java.util.Scanner;

public class PSregistration {
    String username;
    String password;
    String cpassword;
    long contact;
    String mail;
    String location;
    boolean isRegistered = false;

    public void signin() {
        if (isRegistered == false) {
            System.out.println("Please register first by Creating an PS Account!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to sign in with contact");
        System.out.println("Press 2 to sign in with email id");

    }

    // Account Creation Method
    public void createAcc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SONY");
        System.out.print("Enter your Country");
        location = sc.nextLine();

        do {
            System.out.print("Username : ");
            username = sc.nextLine();

            if (username.isEmpty()) {
                System.err.println("Invalid Username! Please enter only alphanumeric characters.");
            }
        } while (username.isEmpty());

        passwordValidation();
        contactValidation();

        isRegistered = true;

    }

    // Password Validation Method
    public void passwordValidation() {
        Scanner sc = new Scanner(System.in);
        boolean validPass = false;
        do {
            System.out.println("Enter the password");
            password = sc.nextLine();
            System.out.println("Enter the Confirm Password");
            cpassword = sc.nextLine();

            validPass = isStrongPass(password);
            if (!validPass) {
                System.err.println(
                        "Password is not strong enough. Please ensure it has at least 8 characters, including uppercase letters, lowercase letters, numbers, and special characters.");
            } else if (!password.equals(cpassword)) {
                System.err.println("Password and Confirm Password do not match. Please try again!!");
                validPass = false;
            }
        } while (!validPass);
        System.out.println("Password is Valid");

    }

    // Strong password method
    public boolean isStrongPass(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean specialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercase = true;
            } else if (Character.isLowerCase(ch)) {
                lowercase = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else {
                specialChar = true;
            }
        }
        return uppercase && lowercase && digit && specialChar;

    }

    // Contact Validation Method
    public void contactValidation() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

        do {
            System.out.println("Enter your contact number: ");
            contact = sc.nextLong();
            if (contact > 999999999L && contact < 10000000000L) {
                System.out.println("Contact is valid");
            } else {
                System.err.println("Enter 10 digits number");
            }
        } while (!isValid);

    }

}
