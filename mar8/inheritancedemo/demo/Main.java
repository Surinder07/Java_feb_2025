package mar8.inheritancedemo.demo;

public class Main {
    public static void main(String[] args) {
        // x = 10 ,  10 < 20
        // x = 20, 20<20
        for(int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x ); // 10
            System.out.println();
        }
    }
}


/*
Animal


Dog  - if this class has makeSound(), then object of dog will also call first preference to the
dog class

however, if the same name method is not present in the dog or child class
then the parent class method will be called.






 */