package mar1.staticdemo;

public class CounterDemo {
     int x = 10; // 9
    CounterDemo(){
        System.out.println(x);
        x--;
    }

    public static void main(String[] args) {

        new CounterDemo();
        new CounterDemo();
        new CounterDemo();
    }
}
