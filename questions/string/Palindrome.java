package questions.string;

public class Palindrome {

    public static void main(String[] args) {

        String a = "abm";
        System.out.println(check2(a));
    }

    static boolean check3(String a){
        for (int i = 0; i < a.length()/2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() -1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    static boolean check1(String a){
        String reverse="";
        for (int i = a.length()-1; i >= 0; i--) {
            reverse=reverse + a.charAt(i);
        }
        if(a.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

    static boolean check2(String a){
        StringBuilder builder = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            char m = a.charAt(i);
            builder.append(m);
        }
        if(a.equals(builder.toString())){
            return true;
        }else{
            return false;
        }

    }
}
