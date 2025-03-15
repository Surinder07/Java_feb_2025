package mar15.payment;

public class MainPayment {
    public static void main(String[] args) {

        // object is of CreditCardPayment class
        // assigned to Payment class
        Payment cc = new CreditCardPayment();
        cc.makePayment();

        Payment interac = new Interac();
        interac.makePayment();

    }
}
