package april1;

import sun.text.normalizer.UnicodeSetIterator;

import java.util.*;

public class Testing {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


       /* if(list.contains(10)) {
            list.remove();
        }*/

       // System.out.println(list);

        // for each

      /*  for (Integer e: list) {
            if(list.contains(10)) {
                list.remove();
            }
        }*/


        // Iterator


        // Basic
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Removing element from the iterator
        /*Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            Integer next = itr.next();
            if(next == 10){
                itr.remove();
            }
            //System.out.println(itr.next());
        }*/


        System.out.println(list);


        /*
        ForLoops
        Itrertor
        Create ListIterator
        Use iterator for HashSet


        Smallest and largest number in arraylist
        Numbers greater than 10 and less than 10





         */










    }
}
