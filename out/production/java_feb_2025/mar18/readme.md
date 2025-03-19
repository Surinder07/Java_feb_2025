## Recap 

1. abtract class 
2. abstract method
3. Polymorphism - Runtime and Compile time
4. Upcasting 


Compile time - Method overloading 
Runtime - Method overriding 


@Override - annotation 


abstraction ? 


hiding internal details. 
hiding the complexity 




abstract class Book {

    public void read(){
    }

    public abstract void pages();

}

class Main {
public static void main(String[] args) {

   Book book = new Book(); // this is Object 
    book.read();
}
## Abstract
1. Object can not be created for abstract class
2. abstract methods does not have body
3. if a class contains abstract method, class must be abstract
4.  - an abstract class may or may not have abstract methods...
5. if any class inherits from abstract class it must implement all abstract the methods.




package mar18.interfaces;

public final class Vehicle {

    
    
    final int x = 10;  // this becomes constant
    
    // final methods can not be overridden 
    public  void test(){
        
    }
    
    // if a class is final, it cannot be inherited. 

}
class Car extends Vehicle{

    public void test(){
        
    }

}



final - keyword 
1. variable - this becomes constant
2. method  - method can not be overriden 
3. class  - class can not be inherited



## Interfaces 

1. Implement multiple inheritance 
2. Implement 100% abstraction 
3. all the variables are public static and final by default
4. all the methods are public and abstract by default 
5. you can not create the object of interfaces 
















