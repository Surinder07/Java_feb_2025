package april1;

import java.util.*;

public class Testing {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        if(list.contains(10)) {
            list.remove();
        }

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
        Iterator
        Create ListIterator
        Use iterator for HashSet


        Smallest and largest number in arraylist
        Numbers greater than 10 and less than 10




Big O

Time complexity
Space Complexity

O(1), O(n)

search 3
Arraylist       1 4 34 34 34 34 3




String s = "Big O, also known as Big O notation, represents an algorithm's worst-case complexity. It uses algebraic terms to describe the complexity of an algorithm.

Big O defines the runtime required to execute an algorithm by identifying how the performance of your algorithm will change as the input size grows. But it does not tell you how fast your algorithm's runtime is.

Big O notation measures the efficiency and performance of your algorithm using time and space complexity.";


can you remove duplicates from this String ?


         */










    }
}
