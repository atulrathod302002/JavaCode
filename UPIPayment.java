package Payment$GateWay;

import java.util.Scanner;

public class UPIPayment extends Payment {
    Scanner sc = new Scanner(System.in);

    public boolean validatePaymentDetails() {
        System.out.println("Enter User Id :");
        String id = sc.nextLine();
        if (id.contains("@") && id.length() >= 7) {
            return true;

        } else {
            System.out.println("invalid user id..");
            return false;
        }

    }

    public void makePayment() {
        System.out.println("Processing UPI Payment..");
    }

}
