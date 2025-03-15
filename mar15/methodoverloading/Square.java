package mar15.methodoverloading;

public class Square extends Shape{

    double side = 10.10;
    @Override
    double area() {
         double area = side * side;
         return area;
    }

    double test(){
        return 0.0;
    }
}
