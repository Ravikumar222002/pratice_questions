package questions.string;

// Find count of  Duplicate characters in a string

public class Duplicate_char {

    public static void main(String[] args) {

        String s= "apppppple";
        System.out.println(count('p',s));
    }

    static int count(char key,String s){
        int count =0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == key){
                count++;
            }
        }
        return count;
    }
}
