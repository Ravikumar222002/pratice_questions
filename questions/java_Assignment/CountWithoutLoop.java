package questions.java_Assignment;

// Q3. Write a program to find the number of occurrences of a character in a string without using loop?

public class CountWithoutLoop {

    // check2
    static int count = 0;
    static int index = 0;

    public static void main(String[] args) {

        String s ="abad";
        System.out.println("count1 : " + check1(s));
        System.out.println("count2 : " + check2(s));

    }

    static int check1(String s){
        if(s.length() == 0)
            return 0;
        int count = s.charAt(0) == 'a' ? 1 : 0;
        return count + check1(s.substring(1));
    }

    public static int check2(String s){
        if(s.charAt(index) == 'a'){
            count++;
        }
        index++;
        if(s.length() - index > 0){
            check2(s);
        }
        return count;
    }


}
