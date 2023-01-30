package questions.java_Assignment;

// 9. WAP to create singleton class.

class Test {    // singleton class

    static Test t = new Test();  // make 't' static bcoz, getInstance() method are static i.e static method
                                 // use only static variable or member

    private Test (){
        System.out.println("constructor" + this);
    }

    static Test getInstance(){  // return 't' address
        return t;
    }
}

public class Singleton {

    public static void main(String[] args) {
        Test t1 = Test.getInstance();
        System.out.println("t1 :" + t1);
    }

}
