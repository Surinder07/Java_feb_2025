package april1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(null);
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);

        System.out.println(list);
        System.out.println(list.set(0, 1000));
        System.out.println(list);

        Object[] objects = list.toArray();


        List<Integer> list2 = new ArrayList<>();
        list.add(1000);
        list.add(20000);

        list.addAll(list2);

        System.out.println(list);


        System.out.println(list.lastIndexOf(50));




    }

}

