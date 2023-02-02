package questions.java_Assignment;

import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {

        String[] s = {"a","b","a","d","b"};

       // check1(s);
        check2(s);
    }

    static void check1(String[] s){
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                 if(s[i].equals(s[j])){
                     System.out.println(s[i]);
                 }
            }

        }
    }

    static void check2(String[] s){
        HashSet<String> set = new HashSet<>();
        for(String m : s){
            if( set.add(m) == false) {
                System.out.println(m);
            }
        }
    }
}
