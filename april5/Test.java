package april5;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(40);
        System.out.println("List : "+list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set : "+set);




        /*
         10    20    30   40  50

        Arrays.
        Iterator

         */



       /* set.add(10);
        set.add(10);
        set.add(30);
        set.add(30);
        set.add(50);
        set.add(null);
        set.add(null);

        System.out.println(set);
        System.out.println(set.remove(10));
        System.out.println(set);

        System.out.println(set.contains(50));


        // TreeSet
        List<Integer> list = Arrays.asList(10,34,53,23,53,32,34,53,232,53,54323,43,34);

        Set<Integer> treeSetDemo = new TreeSet<>(list);
        treeSetDemo.add(30);
        treeSetDemo.add(550);
        treeSetDemo.add(3230);
        treeSetDemo.add(420);
        treeSetDemo.add(5230);

        System.out.println(treeSetDemo);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(120);
        linkedHashSet.add(40);
        linkedHashSet.add(3420);
        linkedHashSet.add(1230);
        System.out.println(linkedHashSet);


        //  Given an array
        // int[] arr = {10,34,53,23,53,32,34,53,232,53,54323,43,34};
        // remove the duplicates from this array.

        // find duplicates from the array.


       // List<Object> list = Arrays.asList(10,34,53,23,53,32,34,53,232,53,54323,43,34);

        int[] arr = {10,34,53,23,53,32,34,53,232,53,54323,43,34};




        // HashSet ---- HashMap ---- LinkedList of ArrayList
        //   0 1 2 3 4 5 ..... 9
*/

    }
}
