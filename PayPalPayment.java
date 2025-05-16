package Payment$GateWay;

import java.util.Scanner;

public class PayPalPayment extends Payment {
    Scanner sc = new Scanner(System.in);

    public boolean validatePaymentDetails() {
        System.out.println("Enter Email id");
        String emailString = sc.nextLine();
        System.out.println("Enter Password");
        String passString = sc.nextLine();

        int emaillength=emailString.trim().length();
        int passlength=passString.trim().length();

        if (emailString.contains("@") && emailString.contains(".") && emaillength >= 10 && passlength >= 6) {
                  
            return true;
        } else {
            System.out.println("invalid email or password");
            return false;
        }

    }

    public void makePayment() {
        System.out.println("Processing PayPal Payment...");

    }

}
