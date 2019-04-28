package datastructure;
import java.util.*;
public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> countries = new LinkedList<>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        countries.add("Canada");

        //peeking first value
        System.out.println("peek : "+countries.peek());

        //removing first value
        System.out.println("remove : "+countries.remove());

        System.out.println("After remove a country : "+countries);

        // poll the first one from list
        System.out.println("poll : "+countries.poll());
        for(String x : countries ){
            System.out.println("for loop : "+x);
        }
        Iterator it = countries.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+it.next());
        }

    }

}
