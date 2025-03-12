package mar11;

public class Vehicle {

    int fuelCap = 50;

    public Vehicle() {
        System.out.println("Super class constructor...");
    }

    public void display(){
        System.out.println("Fuel Cap : "+ fuelCap);
        show();
    }


    public void show(){
        System.out.println("Vehicle class show method..");
    }
}
