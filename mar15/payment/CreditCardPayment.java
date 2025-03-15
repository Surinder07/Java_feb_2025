package mar15.payment;

public class CreditCardPayment extends Payment{

    @Override
    public void makePayment() {
        System.out.println("Payment through Credit Card...");
    }

    @Override
    public void showReceiptOnTransaction() {
        System.out.println("Printing Paper receipts...");
    }


}
