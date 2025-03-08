package mar8.inheritancedemo.demo;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(); // dog class object
        dog.makeSound();
    }
}


/*
Animal


Dog  - if this class has makeSound(), then object of dog will also call first preference to the
dog class

however, if the same name method is not present in the dog or child class
then the parent class method will be called.






 */