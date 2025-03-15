package mar15.methodoverloading;

public class Main {
    public static void main(String[] args) {

        // Upcasting
        // child class object can be assigned to Parent class ref
        Shape square = new BigSquare();
        System.out.println("Area of sqaure :"+square.area());


       /* Square square1 = new BigSquare();
        square1.test();*/







       /* Shape circle = new Circle();

        System.out.println("Area of sqaure :"+circle.area());

        Shape rectangle = new Rectangle();
        System.out.println("Area of Rectangle : "+rectangle.area());
*/
    }
}
