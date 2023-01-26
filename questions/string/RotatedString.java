package questions.string;

//Write a Code to check whether one string is a rotation of another

public class RotatedString {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        check1(s1, s2);
    }

    static void check1(String s1, String s2) {
        s1 = s1.concat(s1); // concatenate the s1
        if (s1.indexOf(s2) != -1) {
            System.out.println("yes ! s2 are rotation of s1 ");
        } else {
            System.out.println("Not a rotation");
        }

    }

    static void check2(String s1, String s2) {
        s1 = s1.concat(s1); // concatenate the s1
        if (s1.contains(s2)) {
            System.out.println("yes ! s2 are rotation of s1 ");
        } else {
            System.out.println("Not a rotation");
        }

    }

}

