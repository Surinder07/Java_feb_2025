package mar22.exceptions.bank;

public class Bank {

    double balance;

    public double getBalance(){
        return balance;
    }

    // withdraw


    public double withdraw(double amount) throws InsufficientBalanceException{
        if (amount >  balance) {
            throw new InsufficientBalanceException("You dont have enough blanace");
        }
        balance = balance - amount;
        return balance;
    }


    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    //balance


    //deposit
}
