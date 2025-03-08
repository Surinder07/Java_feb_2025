package mar8.inheritancedemo;

public class Mobile {
    // propeties
    String brand;
    double capacity;
    String color;

    public Mobile() {
    }

    public Mobile(String brand, double capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public void showMobileSpecifications(){
        System.out.println("Mobile Specifications");
        System.out.println("Brand : "+brand);
        System.out.println("Capacity : "+capacity);
        System.out.println("Color : "+color);
    }
}
