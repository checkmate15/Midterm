package string.problems;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String str1, str2, str3, str4;

        str1 = "MOM";
        str2 = "DAD";
        str3 = "MADAM";
        str4 = "FATHER";

        palindrome(str1);
        palindrome(str2);
        palindrome(str3);
        palindrome(str4);
    }


     public static boolean palindrome(String word){
         String reverse = "";

        for(int i=word.length()-1;i>=0;i--)
            reverse+=word.charAt(i);

        if(word.equalsIgnoreCase(reverse))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is Not Palindrome");

         return word.equalsIgnoreCase(reverse);
    }
    }
