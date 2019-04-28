package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String,Integer> sentence = new HashMap<>();
        String [] splitWords = st.split("   ");
        for(String word : splitWords){
            Integer counts = sentence.get(splitWords);
            if(counts == null){
                counts = 0;
            }

            sentence.put(word, counts+1);

        }
        for(Map.Entry<String,Integer> s : sentence.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue()+" Time(s)" );
        }

    }

}
