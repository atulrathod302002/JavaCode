package Payment$GateWay;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;
        boolean flag=false;
            System.out.println("---------------------------welcome To Payment gateways--------------------------------");
        do {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Press 1 : CrediCard Payment");
            System.out.println("Press 2 : PayPal Payment");
            System.out.println("Press 3 : Upi Payment");
            System.out.println("Press 4 : Exit");

            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        p = PaymentFactory.getPaymentMethod(new CreditCardPayment());

                        if (p.validatePaymentDetails()) {
                            p.makePayment();
                        }
                        break;
                    case 2:
                        p = PaymentFactory.getPaymentMethod(new PayPalPayment());
                        if (p.validatePaymentDetails()) {
                            p.makePayment();

                        }
                        break;
                    case 3:
                        p = PaymentFactory.getPaymentMethod(new UPIPayment());
                        if (p.validatePaymentDetails()) {
                            p.makePayment();
                            
                        }
                        break;
                    case 4:
                        System.out.println("thank you For visting");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                       

                        break;
                }

            } catch (Exception e) {
                System.out.println("Exception Occured " + e.getMessage());
            }
            System.out.println("--------------------------------------------------------------------------------------");
             System.out.println("Enter Again (yes / no)");
                        sc.nextLine();
                        String inpuString = sc.nextLine();
                   
                        if (inpuString.equalsIgnoreCase("yes")) {
                            flag = true;

                        }
        } while (flag);
        sc.close();
    }

}
