package feb15;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        // to take user input, we have something called Scanner
        // a class
        // what it does, rather than how it does

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int x = scanner.nextInt();

        System.out.println("Enter the second number ");
        int y = scanner.nextInt();


        System.out.println("Enter the name ");
        String name = scanner.next();
        System.out.println("Name " + name);

        int sum = x + y;

        System.out.println("Sum of x and y : "+ sum);

        // + overload operator -
        // it behaves differently when you have two integers - SUM
        // string and integer - concatenation


    }
}
