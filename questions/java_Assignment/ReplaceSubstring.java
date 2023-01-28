package questions.java_Assignment;

// Q1. Write a program to replace a substring inside a string with other string ?
//Input: S = “aba b aba”, S1 = “aba”, S2 = “a”
//        Output: aba

public class ReplaceSubstring {

    public static void main(String[] args) {

        String s="baby";
        char chg='b';
        char key='d';
        char[] m = s.toCharArray();
        check(m,key,chg);


    }

    static void check(char[] m, char key,char chg){
        for (int i = 0; i < m.length; i++) {
            if(m[i] == chg){
                m[i]=key;
            }
        }
        System.out.println("result :" + String.valueOf(m));
    }
}
