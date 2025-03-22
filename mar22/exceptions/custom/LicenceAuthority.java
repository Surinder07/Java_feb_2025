package mar22.exceptions.custom;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LicenceAuthority {

    public void carDrive()  {
        checkValidAge();
    }

    public void checkValidAge() throws InvalidAgeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");

        int age = scanner.nextInt();

        try {
            if (age < 18) {
                //throw new RuntimeException("Invalid age!");
                throw new InvalidAgeException("User age is below 18, You are not allowed");
            } else {
                System.out.println("You are allowed to drive");
            }

        }
        catch (InvalidAgeException  e){

        }
        System.out.println("Hello");
    }
}
/*


        Bank class
        1. check balance
        2. withdraw
        3. deposit

        BankMain

        when user try to withdraw more amount than the existing balance
        throw InsufficientFundException...

        show balance
        show user info..












 */