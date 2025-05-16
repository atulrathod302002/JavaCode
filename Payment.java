package Payment$GateWay;

abstract class Payment {
   abstract boolean validatePaymentDetails();
   abstract void makePayment();
}