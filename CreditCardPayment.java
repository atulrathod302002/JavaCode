package Payment$GateWay;

import java.time.LocalDate;

import java.util.Scanner;

public class CreditCardPayment extends Payment{
    Scanner sc=new Scanner(System.in);
  LocalDate ld=LocalDate.now();
     public boolean validatePaymentDetails(){
      System.out.println("Enter Credit Card Number : ");
      long creditCardNumber=sc.nextLong();
      System.out.println("Enter Expiry date (in MM/YY Format)");
      int mm=sc.nextInt();
      int yy=sc.nextInt();
      
      String stringCreditCardNumber=String.valueOf(creditCardNumber);
      if (stringCreditCardNumber.length()==16 &&  mm <= 12 && yy<ld.getDayOfYear() ) {
    return true;  
      }
      else{
        System.out.println("Invalid Credit card number  or Date ");
        return false;
      }


     }
   public void makePayment(){
    System.out.println("Processing Credit Card Payment...");


   }
    
}
