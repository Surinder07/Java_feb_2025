package mar25.innerclassdemo.staticclass;

public class Main {
    public static void main(String[] args) {

        // static method can be called with the name of the class
        //Computer computer = new Computer();
        Computer.test(); // static methods does not need object to be called

        // this is the object for static inner class
        Computer.MotherBoard comp = new Computer.MotherBoard();

        comp.makeCalculations();


    }
}
