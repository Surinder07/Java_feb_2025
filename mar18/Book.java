package mar18;

abstract class Book {

    public abstract void read();

    public abstract void pages();

}
class Novel extends Book {


    @Override
    public void read(){

    }

    @Override
    public void pages(){

    }

}
class HarryPotter extends Novel{

}

class Main{
    public static void main(String[] args) {

        // type casting
        Book book = new Novel(); // Upcasting
        book.pages();

        HarryPotter harryPotter = (HarryPotter) new Novel(); // downcasting..

    }
}

/*

2. abstract methods does not have body
3. if a class contains abstract method, class must be abstract
4.  - an abstract class may or may not have abstract methods...
5. if any class inherits from abstract class it must implement all abstract the methods.
 */