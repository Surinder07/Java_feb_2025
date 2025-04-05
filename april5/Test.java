package april5;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
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

        Set<Integer> treeSetDemo = new TreeSet<>();
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



























    }
}
