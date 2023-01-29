package questions.java_Assignment;

// 12. WAP to convert seconds into days, hours, minutes and seconds.

public class ConvertSeconds {

    public static void main(String[] args) {

        double sec = 86400;

        check(sec);
    }

    static void check(double sec){

         double  hrs = sec/(60 * 60);
         double minutes = sec/60  ;
         double day = sec/(60 * 60 * 24);
         double seconds = sec/(24 * 60 * 60);

        System.out.printf("days : %.2f" , day);
        System.out.println( "\n  hours : " + hrs + " minutes : " + minutes + " seconds : " + seconds);

    }
}
