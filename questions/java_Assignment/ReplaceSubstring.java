package questions.java_Assignment;

// Q1. Write a program to replace a substring inside a string with other string ?

public class ReplaceSubstring {

    public static void main(String[] args) {

        String s="abcde";
        String tar="cd";
        String chg="fgfd";

        System.out.println(check1(s,tar,chg));
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
