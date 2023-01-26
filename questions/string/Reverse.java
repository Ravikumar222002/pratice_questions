package questions.string;

//Reverse a String

public class Reverse {

    public static void main(String[] args) {

        String m = "ravi kant";
        reverse(m);
    }

    static void reverse(String s){

        StringBuilder builder = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            char m = s.charAt(i);
            builder.append(m);
        }

        System.out.println("reverse :" + builder.toString());
    }
}
