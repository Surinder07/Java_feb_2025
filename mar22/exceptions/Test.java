package mar22.exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = scanner.nextInt();

        System.out.println("Enter the first number ");
        int y = scanner.nextInt();

        try {
             int result = x / y;

            System.out.println(result);

        }
        catch (NullPointerException e ){
            e.printStackTrace();
        }
        finally{
            System.out.println("Executed always...");
            scanner.close();
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
