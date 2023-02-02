package questions.java_Assignment;

// Q1. Write a program to replace a substring inside a string with other string ?
//Input: S = “aba b aba”, S1 = “aba”, S2 = “a”
//        Output: aba

public class ReplaceSubstring {

    public static void main(String[] args) {

//        char chg='b';
//        char key='d';
//        char[] m = s.toCharArray();
      //  check(m,key,chg);
      //  check1(s,"a","d");

        String s="abcde";
        String tar="cd";
        String chg="fgfd";

        System.out.println(check1(s,tar,chg));



    }

    static void check(char[] m, char key,char chg){
        for (int i = 0; i < m.length; i++) {
            if(m[i] == chg){
                m[i]=key;
            }
        }
        System.out.println("result :" + String.valueOf(m));
    }

    static String check1(String s, String target, String repl ){

        for (int i = 0; i < s.length()-target.length(); i++) {
            String t = s.substring(i,i+target.length());
            if(t.equalsIgnoreCase(target)){
                String ans = s.substring(0,i);
                ans = ans + repl;
                ans = ans + s.substring(i+target.length());
                return ans;
             }
        }
        return s;
    }
}
