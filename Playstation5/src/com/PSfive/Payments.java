package com.PSfive;



interface PaymentMethod {
    void creditCardPayment() throws Exception;
    void payPalPayment() throws Exception;
    void upiPayment() throws Exception;

}

public class Payments implements PaymentMethod{
    Store store = new Store();


    public void creditCardPayment() throws Exception{
        System.out.println("Processing payment using Credit Card...");
        Thread.sleep(3000);
        System.out.println("Payment successful!");

        store.addLibrary();
        store.afterPayment();
    }
    

    public void payPalPayment() throws Exception{
        System.out.println("Processing payment using PayPal...");
        Thread.sleep(3000);
        System.out.println("Payment successful!");
        store.addLibrary();
        store.afterPayment();
    }
    public void upiPayment() throws Exception{
        System.out.println("Processing payment using UPI...");
        Thread.sleep(3000);
        System.out.println("Payment successful!");
        store.addLibrary();
        store.afterPayment();
    }

}