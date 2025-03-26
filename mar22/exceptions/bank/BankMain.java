package mar22.exceptions.bank;

public class BankMain {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.balance = 1000;
        System.out.println("Current Balance : "+bank.getBalance());


        double balanceAfterWithdraw = 0 ;
        try {
            balanceAfterWithdraw = bank.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

        System.out.println("Balalnce after withdraw : "+balanceAfterWithdraw);


        bank.deposit(1000);


        //create object of Bank class
        // call all the Bank class method..
        // create custom exception class
        // InsufficientBalanceException extends RuntimeException
    }
}
