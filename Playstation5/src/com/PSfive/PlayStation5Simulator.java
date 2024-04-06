package com.PSfive;

import java.util.Scanner;

public class PlayStation5Simulator {
	static {
		System.out.println(
				"                                                              					 Welcome to PlayStation 5");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("Enter 1 to Sign in");
		System.out.println("Enter 2 to Create an Account");
		System.out.println("Enter 3 to Guest Login");
		System.out.println("Enter 4 to Exit");

		Scanner sc = new Scanner(System.in);
		int Choose = sc.nextInt();
		sc.nextLine();
		//PSregistration register = new PSregistration();
		Homepage  homePage = new Homepage();

		switch (Choose) {
			case 1:
				// register.signIn();
			case 2:

				// register.createAcc();

			case 3:
				homePage.displayHomePage();

				break;
			case 4:
				System.out.println("Bye Bye");
				System.exit(0);
				break;
			default:
				System.err.println("Choose above value only");
				main(null);
		}
	}

}
