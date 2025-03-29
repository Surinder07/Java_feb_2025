package mar29.genericdemo;

public class Box<K,V> {
    K item1;
    V item2;

    public Box(K item1, V item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
}

class Main {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(12,"Pragra"); // flexity to work with any type.
        System.out.println(box);

        Box<String, Integer> box2 = new Box<>("abc",1212);

    }
}

// Container , product1 , product2
// T,U