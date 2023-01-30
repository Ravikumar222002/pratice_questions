package questions.java_Assignment;

//  Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import java.util.Arrays;

public class WordsOccurrences {

    public static void main(String[] args) {

        String s = "hello how are you are ?";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count=1;

            for (int j = i+1; j < words.length; j++) {

                if (words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if (words[i] != "0"){
                System.out.println(words[i] + " -> " + count);
            }

        }

    }
}
