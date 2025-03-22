package mar22.exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = scanner.nextInt();

        System.out.println("Enter the first number ");
        int y = scanner.nextInt();
        int result = 1000;

        try {
            System.exit(0);
              result = x / y;
            System.out.println(result);

        }

        finally{
            System.out.println("Executed always...");
            scanner.close();
            System.out.println(result);
            //database connection close
        }


        System.out.println("Hello at last line");

    }
}

/*

Nullpointer
arithmetic

ArrayIndexOutOfBoundException

 */
