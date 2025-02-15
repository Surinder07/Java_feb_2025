package feb15;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {


        System.out.println("*******************");
        System.out.println("Welcome to My Telecom");
        System.out.println("*******************");

        System.out.println("1. English");
        System.out.println("2. French");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your language input");
        int language = scanner.nextInt();

        if(language == 1){



        }else if (language == 2){

        }else {
            System.out.println("Invalid input ");
        }











        // customer service, rogers, bell, telus
        // press 1 for english
        /*

        press 2 for french

        1.   Billing
                    1. Payment arrangement
                    2. Over charge
        2. Technical support
                1. Internet
                    sout("Welcome to internet services, department");
                2. Mobile
                3. TV
        3. For sales
                1. existing customer
                2. new customer
        4. Speak to an agent....
                sout("Hi my name is mark, how can I help?");
        5. go back to main menu ...sout
        if else, scanner and switch case

         */

    }
}
