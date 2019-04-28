package math.problems;

import org.testng.Assert;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {

        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};



        //sorting arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        //getting lowest difference for array1
        int LowDiff1 = array1[1]-array1[0];
        for (int i = 2 ; i != array1.length ; i++) {
            LowDiff1 = Math.min(LowDiff1, array1[i]-array1[i-1]);
        }
        System.out.println("Lowest difference  in array1 : " +LowDiff1);


        System.out.println("\n");
        //getting lowest difference for array2
        int LowDiff2 = array2[1]-array2[0];
        for (int k = 2 ; k != array2.length ; k++) {
            LowDiff2 = Math.min(LowDiff2, array2[k]-array2[k-1]);
        }
        System.out.println("Lowest difference  in array2 : " +LowDiff2);

        //for getting best lowest difference between two arrays
        if(LowDiff1>LowDiff2){
            System.out.println("Lowest difference  between both arrays : " +LowDiff2);
        }else if(LowDiff1<LowDiff2){
            System.out.println("Lowest difference  between both arrays : " +LowDiff1);
        }else if(LowDiff1==LowDiff2){
            System.out.println("Lowest difference  between both arrays : " +LowDiff1);
        }





    }

}
