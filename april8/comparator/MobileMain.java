package april8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {

        List<Mobile> list = new ArrayList<>();
        list.add(new Mobile(256, "Iphone 16", "Apple"));
        list.add(new Mobile(128, "Samsung Galaxy", "Samsung"));
        list.add(new Mobile(1024, "Iphone 14", "Apple"));
        list.add(new Mobile(512, "Google Pixel", "Google"));
        list.add(new Mobile(256, "Moto G ", "Motorolla"));

        // this comparison is based on brand
        Collections.sort(list, new BrandComparator());


        // based on Capacity
       // Collections.sort(list, new CapacityComparator());

        // SOLID -
        /*
        S- Single resposin
        O - open close
        L - Liskov substition
        I - Inteface
        D -


            Bank class
            1. Account id
            2. Account Holder Name
            3. Account Balance

            1. Name comparator
            2. Account Balance







         */



        System.out.println(list);



    }
}
