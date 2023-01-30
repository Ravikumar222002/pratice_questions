package questions.java_Assignment;

import java.util.Scanner;

/*
13. WAP to read words from the keyboard until the word done is entered. For each word except done,
 report whether its first character is equal   to  its last character. For the required loop, use a

a)while statement
b)do-while statement

 */


public class FirstLastWord {


     static void While(){

        String s = "";
        Scanner sc = new Scanner(System.in);
        while(s.compareTo("done") != 0){

            if (s.length() > 0){
                if(s.charAt(0) == s.charAt(s.length()-1) ){
                    System.out.println("Equal :" + s.charAt(0) + " : " + s.charAt(s.length()-1) );
                }else{
                    System.out.println("Not Equal :" + s.charAt(0) + " : " + s.charAt(s.length()-1) );
                }
            }
            s=sc.nextLine();
        }

    }

    static void Do_While(){
        String s = "";
        Scanner sc = new Scanner(System.in);

         do{
             if (s.length() > 0){
                 if(s.charAt(0) == s.charAt(s.length()-1) ){
                     System.out.println("Equal :" + s.charAt(0) + " : " + s.charAt(s.length()-1) );
                 }else{
                     System.out.println("Not Equal :" + s.charAt(0) + " : " + s.charAt(s.length()-1) );
                 }
             }
             s=sc.nextLine();

         }while(s.compareTo("done") != 0);
    }

    public static void main(String[] args) {
        Do_While();

    }
}
