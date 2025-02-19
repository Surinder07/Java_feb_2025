package feb18;

public class ForLoopDemo {
    public static void main(String[] args) {

      //  for(init ; condition ; increment/decrement)

        // continue
        for (int i = 0; i <= 10; i++) {
           if(i % 2 ==0)
               continue;

            System.out.println(i);
        }


        // break
        for (int i = 0; i <= 10; i++) {
            if(i == 5) {
                break;
            }

            System.out.println(i);
        }
        //  break - break the loop
        //  continue - skip the iteration
        /*
        i = 0 , 0< 10    , print i = 0,    i ++
        i = 1   1 < 10     print i = 1 ,  i ++


         */


        // case 1    - Sunny , manmeet, Simran
        // init variable 0
        // condition
        // increment
        // print i

        // case 2  - Ankita, Yadav, Mehakvir, Niraj, warispal,
        // init variable 0
        // condition
        // print i
        // increment

    }
}

