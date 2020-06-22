package Java2.Lesson3;

import java.util.*;

    public class EmptyWords {
        public static void main(String[] args) {

            ArrayList<String> someStuff = new ArrayList<>();

            someStuff.add("Carbon");
            someStuff.add("Rebel");
            someStuff.add("Cowboy");
            someStuff.add("Ronin");
            someStuff.add("Tooth");
            someStuff.add("Tear");
            someStuff.add("Error");
            someStuff.add("Foot");
            someStuff.add("Carbon");
            someStuff.add("HIV");
            someStuff.add("HeraldOfRivia");
            someStuff.add("Rebel");
            someStuff.add("Foot");
            someStuff.add("Error");

            System.out.println("All these meaningful words are: " + someStuff + "\n");

            Set<String> uniqueSet = new LinkedHashSet<>(someStuff);
            System.out.println("Words that are not repeated are: " + uniqueSet + "\n");

            HashMap<String, Integer> repeatedWords = new HashMap<>();
            Integer repWords;
            for (String i : someStuff) {

                repWords = repeatedWords.get(i);
                repeatedWords.put(i, repWords == null ? 1 : repWords + 1);
            }

            System.out.println(repeatedWords);
        }
    }