package feb22;

public class Computer {

    int memory;
    String brand;



    // if there is no contructor, class automatically creates a default const

    public Computer(int memory, String brand) {
        this.memory = memory;
        this.brand = brand;
    }

    public static void main(String[] args) {


       /* int x;
        System.out.println(x);*/


        // int             x = 10;
        //                  new Computer(255, "Dell"); - is calling a the constructor
        Computer computer = new Computer(255, "Dell");

        System.out.println(computer.brand);
        System.out.println(computer.memory);

        computer.brand = "HP";
        System.out.println(computer.brand);
    }
}


/*

create a Bank class
account balance
account number

Bank bank = new Bank(10101010, 1000.00 );

// currentBalance()
// deposit(double amount);
// withdraw(double amount);


// create a seperate main class
create object of Bank class
1. check the current balance
2. deposit some amount
3. withdraw some amoutn adn print balance after











 */