package april1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilityClasses {
    public static void main(String[] args) {

     /*  int[] arr = {10,20,40,50,23,4523,23,324,53,343,34};

        List<int[]> ints = Arrays.asList(arr);*/

        List<Integer> list = Arrays.asList(10, 20, 40, 50, 23, 4523, 23, 324, 53, 343, 34);

/*
        int result = Arrays.binarySearch(arr, 10);
        System.out.println("Element is present in arra " + result );


        Arrays.sort(arr);

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add(10);*/

        Collections.swap(list, 0, 1);

        System.out.println(list);



    }
}
