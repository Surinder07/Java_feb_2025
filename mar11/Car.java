package mar11;

public class Car extends Vehicle{

    int fuelCap = 100;


    public Car() {

        //this();  // Car class default constructor  , this should be the firts statetemtn in constructor body
        // super() has to be the first statement in constructor body
        // this.fuelCap = super.fuelCap;
    }

    @Override
    public void display() {
        super.show();
        System.out.println("Fuel capacity " + super.fuelCap );
    }
}

// super keyword  - super class
// this keyword - refer to this current class object