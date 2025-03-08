package mar8.inheritancedemo;

public class ComputerMain {
    public static void main(String[] args) {
        // with the help of Tablet class object , tablet class can access Parent[Laptop, Computer] class methods
        Tablet tablet = new Tablet();
        tablet.brand = "Sony";
        tablet.color = "Black";
        tablet.capacity = 256;
        tablet.display();
    }
}
