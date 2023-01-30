package questions.java_Assignment;

// 11. WAP showing try, multi-catch and finally blocks.

public class Exception {

    public static void main(String[] args) {
        int a[] = {5,10};
        int b = 5;

        try{
            int x = a[1]/b-a[1];

        }catch(ArithmeticException e){
            System.out.println("Division by zero");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error");
        }finally {
            System.out.println("I am always here");
        }
    }
}
