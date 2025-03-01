package mar1.staticdemo;

public class BlockDemo {

    // Constructor
    BlockDemo(){
        System.out.println("Inside the constructor...");
    }

    // static block
    static {
        System.out.println("Static Block ");
    }

    // instance block
    {
        System.out.println("Instance Block");
    }

    // normal method
    public void set(){
        System.out.println("Inside non static method");
    }
    // static method
    public static void show(){
        System.out.println("Static Method.");
    }

}
