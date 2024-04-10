package com.PSfive;

import java.util.Random;
import java.util.Scanner;

public class PSregistration {
   
    private String username;
    private String password;
    private String cpassword;
    private long contact;
    private String mail;
    String name;
    String lastname;
    private String location;
    boolean isRegistered = false;
    boolean signPass = false;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    

        

    public void signIn() {
        Scanner sc = new Scanner(System.in);
        
        if (!isRegistered) {
            System.out.println("Please register by Creating an PS Account!");
            createAcc();
        }
        
        boolean signedIn = false;
        do {
            System.out.println("Press 1 to sign in with Username");
            System.out.println("Press 2 to sign in with Sign-In ID");
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (n) {
                case 1:
                    System.out.println("Enter your registered Username : ");
                    String username = sc.nextLine();
                    if (username.equals(this.username)) {
                        signedIn = true;
                    } else {
                        System.out.println("Username does not match! Try again.");
                    }
                    break;
                case 2:
                    System.out.println("Enter your registered Sign-In ID : ");
                    String mail = sc.nextLine();
                    if (mail.equals(this.mail)) {
                        signedIn = true;
                    } else {
                        System.out.println("Sign-In ID does not match! Try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!signedIn);
    
    
        boolean signPass = false;
        do {
            System.out.println("Enter your Password");
            String pass = sc.nextLine();
            if (pass.equals(this.password)) {
                System.out.println("Sign In Successful. Welcome " + this.name + " " + this.lastname);
                signPass = true;
          
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (!signPass);
    }
    

    // Account Creation Method
    public void createAcc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SONY");
        System.out.print("Enter your Country : ");
        location = sc.nextLine();

        emailValidation();
        passwordValidation();
       // contactValidation();
       //onlineID();
        //captcha();

        System.out.println("Your account has been created successfully.");
        isRegistered = true;


    }

    // email Validation method
    public void emailValidation() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.println("Sign-In ID");
            mail = sc.nextLine();
            if (isValidEmail(mail)) {
                isValid = true;
            } else {
                System.err.println("Invalid email. Please enter a valid email address.");
                isValid = false;
            }
        } while (!isValid);
    }

    public static boolean isValidEmail(String mail) {
        return mail.contains("@") && mail.contains(".");
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
    public static boolean isStrongPass(String password) {
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
            if (sc.hasNextLong()) {
                long contact = sc.nextLong();
                if (contact >= 999999999L && contact <= 9999999999L) {
                    isValid = true;
                } else {
                    System.err.println("Enter a 10-digit number");
                    isValid = false;
                    sc.nextLine();
                }
            } else {
                System.err.println("Enter a valid number");
                isValid = false;
                sc.nextLine();
            }
        } while (!isValid);
    }

    // online ID method
    public void onlineID() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Username : ");
            username = sc.nextLine();

            if (username.isEmpty()) {
                System.err.println("Invalid Username! Please enter only alphanumeric characters.");
            }
        } while (username.isEmpty());

        do {
            System.out.print("First Name : ");
            name = sc.nextLine();

            if (name.isEmpty()) {
                System.err.println("Invalid Username! Please enter only alphanumeric characters.");
            }
        } while (name.isEmpty());

        do {
            System.out.print("Last Name : ");
            lastname = sc.nextLine();

            if (lastname.isEmpty()) {
                System.err.println("Invalid Username! Please enter only alphanumeric characters.");
            }
        } while (lastname.isEmpty());

    }

    public static void captcha() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String captcha = "";
        do {
            captcha = "";
            while (captcha.length() < 6) {
                int n = r.nextInt(122);
                if ((n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
                    captcha = captcha + (char) n;
                }
            }
            System.out.println("Enter the Below Captcha");
            System.out.println(captcha);
            String userCaptcha = sc.nextLine();
            if (captcha.equals(userCaptcha)) {
                System.out.println("Correct Captcha!");
                break;
            } else {
                System.out.println("Incorrect Captcha! Try Again.");
            }
        } while (true);
    }
}
