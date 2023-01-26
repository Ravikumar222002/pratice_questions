package questions.string;

 // Length of Last Word

public class Length_of_Last_Word {

    public static void main(String[] args) {
        String s = " hello world";
        System.out.println("count :" + check1(s));
    }

    static int  check1( String s){
        int count = 0;
        String m = s.trim();
        for (int i = 0; i < m.length(); i++) {
            if(m.charAt(i) == ' ') {
                count = 0;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
