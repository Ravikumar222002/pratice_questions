package questions.java_Assignment;

// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

public class CharPercentage {
    public static void main(String[] args) {

        String s = "I love my India 123";
        check(s);
    }

    static void check(String s){
        int lowercase=0;
        int uppercase=0;
        int digit=0;
        int other=0;
        int length = s.length();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLowerCase(s.charAt(i))){
                lowercase++;
            }
            if (Character.isUpperCase(s.charAt(i))){
                uppercase++;
            }
            if (Character.isDigit(s.charAt(i))){
                 digit++;
            }
            else{
                other++;
            }
        }
        System.out.println(" upper : " + uppercase + " lower :" + lowercase + " digit :" + digit + " other :" + other);

        int upperPer = (uppercase*100)/length;
        int lowerPer = (lowercase*100)/length;
        int digitPer = (digit*100)/length;
        int otherPer = (other*100)/length;

        System.out.println(" upper : " + upperPer + "% "
                + " lower :" + lowerPer +  "% " +
                " digit :" + digitPer  + "% " +
                " other :" + otherPer + " % ");
    }
}
