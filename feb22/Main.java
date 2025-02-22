package feb22;

public class Main {
    public static void main(String[] args) {

        // Objects
        // How to create an object
        // new keyword gives memory to the object

        Furniture furniture = new Furniture();
        furniture.show(); // calling the method

        furniture.set();

        furniture.color = "Red";
        furniture.width = 19.12;

        System.out.println(furniture.color);
    }
}
