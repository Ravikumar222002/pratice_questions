package questions.java_Assignment;

// 8.  WAP to sort string without using string Methods?

public class Sorting {

    public static void main(String[] args) {
        String s = "edcbaancve";
        char[] m = s.toCharArray();
        System.out.println(" After sort : " +  check(m));
    }

    static String check(char[] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if ((int) m[i] > (int) m[j]) {
                    char t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
        }
        return String.valueOf(m); // String.valueOf - convert char[] to string
    }
}