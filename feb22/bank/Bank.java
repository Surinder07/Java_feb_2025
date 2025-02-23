package feb22.bank;

public class Bank {

    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double currentBalance(){
        return balance;
    }

    public double withdraw(double amount){
        // 1000,    1200 , put a condition so that we can not withdraw more money
        // than the exisitn one
        balance = balance - amount;
        return balance;
    }


    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
}



// currentBalance()
// deposit(double amount);
// withdraw(double amount);