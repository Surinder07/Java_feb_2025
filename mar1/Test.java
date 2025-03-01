package mar1;

public class Test {

    int sum(int x, int y){

        return x + y;
    }

    float sum(float x, float y, float z){

        return x + y + z;

    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum(10, 10));
        t.sum(10.12f, 12.12f, 43.12f);
    }
}


// method overiding