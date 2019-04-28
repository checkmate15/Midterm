package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList <String> Cars = new ArrayList<String>();

        //Adding values in Arraylist
        Cars.add("HONDA");
        Cars.add("TOYOTA");
        Cars.add("BMW");
        Cars.add("NISSAN");

        //checking ArrayList
        System.out.println(Cars);

        //removing Nissan
        Cars.remove("NISSAN");

        //after remove checking again ArrayList
        System.out.println("\n"+Cars);






    }

}
