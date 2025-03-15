package mar15.payment;

public class Interac extends Payment{
    @Override
    public void makePayment() {
        System.out.println("Payment through interac");
    }

    @Override
    public void showReceiptOnTransaction() {
        System.out.println("sending email receipt...");
    }
}
