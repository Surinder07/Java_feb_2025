package mar15.methodoverloading;

public class Rectangle extends Shape{
    double length;
    double width;


    @Override
    double area() {
        return length * width;
    }
}
