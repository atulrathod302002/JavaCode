package Payment$GateWay;

public class PaymentFactory {
    public static Payment getPaymentMethod(Payment type){

        if (type instanceof CreditCardPayment) {
            return new CreditCardPayment();
            
        }
        else if (type instanceof PayPalPayment) {
            return new PayPalPayment();
            
        }
        else if (type instanceof UPIPayment) {
            return new UPIPayment();
            
        }
        else{
            return null;
        }
        
    }
}
