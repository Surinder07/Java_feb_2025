package mar8.inheritancedemo;

public class Computer {
    String brand;
    double capacity;
    String color;


    public Computer(){
    }

    public Computer(String brand, double capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public void display() {
        System.out.println("Brand  : " + brand);
        System.out.println("Capacity  : " + capacity);
        System.out.println("Color :   " + color);
    }


}

