package mar15.methodoverloading;

public class Calculator {
    public static double sum(int a, int b){
        return a + b;
    }

    public static double sum(int a, int b, int c){
        return a + b + c;
    }


    public static double sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {

        sum(10,10);
        sum(10,30,40);
    }
}
