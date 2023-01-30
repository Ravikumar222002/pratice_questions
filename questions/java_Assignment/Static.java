package questions.java_Assignment;

// Q7. Write a program to print your Firstname,LastName & age using static block,
// static method & static variable respectively

class Testing {
    static String firstName;
    static String lastName;
    static int age;

    static{
        firstName ="Ravikant";
        lastName = "Pandit";
        age=20;
    }

    static void show(){
        System.out.println(" firstName : " + firstName + "  lastName : " + lastName + "  Age :" + age);
    }
}
public class Static {

    public static void main(String[] args) {
        Testing.show();
    }
}
