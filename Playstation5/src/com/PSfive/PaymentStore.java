package com.PSfive;

import java.util.Scanner;

public class PaymentStore {
Store  store = new Store();
    public void processPayment() {
        double totalPrice = calculateTotalPrice();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Total amount to be paid: Rs." + totalPrice);
        System.out.println("Enter your payment method (e.g., Credit Card, PayPal, etc.):");
        String paymentMethod = sc.nextLine();
        
        // Here you can implement the logic to process the payment using the chosen method
        System.out.println("Processing payment using " + paymentMethod + "...");
        System.out.println("Payment successful!");
        
        // Clear the cart after successful payment
        Store.cart.clear();
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Store game : Store.cart) {
            totalPrice += game.g_price;
        }
        return totalPrice;
    }
}