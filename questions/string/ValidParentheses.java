package questions.string;

// Valid Parentheses

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "([{)]";

        System.out.println(check1(s));
    }

    static boolean check1(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                 stack.push(s.charAt(i));
            }

        }


        return true;
    }
}
