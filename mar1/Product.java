package mar1;

public class Product {

    // static belongs to the class rather than the object
    // static variable is shared among all the instances.
    // Home - single tap in the home , everyone gets their own tap of water
    // internet = everyone is sharing .
    String description;
    double price;
    static String brand = "Apple";

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public void printProductDetails(){
        System.out.println(description);
        System.out.println(price);
        System.out.println(brand);
    }
}
