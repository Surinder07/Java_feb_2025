package feb22.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(1000.00);
        double myCurrentBalance = bank.currentBalance();
        System.out.println("Current Balance in the account : "+myCurrentBalance);


        double balanceAfterDeposit = bank.deposit(250.00);
        System.out.println("New Balance : "+ balanceAfterDeposit);


        double balanceAfterWithdraw = bank.withdraw(150000);
        System.out.println("Balance after withdraw "+balanceAfterWithdraw);

    }
}
