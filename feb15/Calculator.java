package feb15;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("*******************");
        System.out.println("Welcome to My Calculator");
        System.out.println("*******************");

        System.out.println("1. Additon");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        int input = 1;
        switch (input) {
            case 1:

                int x = 10;
                int y = 20;
                int sum = x + y;
                System.out.println(sum);

                break;

            case 2 :
                // Subtraction
                break;

            case 3:
                // Multiplication
                break;

            default:
                System.out.println("Power down ");
        }
    }
}
