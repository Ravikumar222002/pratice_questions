package questions.java_Assignment;

// 9. WAP to create singleton class.

class SingletonEarlyInitialize {    // singleton class

    static SingletonEarlyInitialize t = new SingletonEarlyInitialize();  // make 't' static bcoz, getInstance() method are static i.e static method
                                 // use only static variable or member
    private SingletonEarlyInitialize(){
        System.out.println("constructor" + this);
    }

    static SingletonEarlyInitialize getInstance(){  // return 't' address
        return t;
    }
}

class SingletonLazyInitialize{

    private static SingletonLazyInitialize  t = null;

    private SingletonLazyInitialize (){
        System.out.println("constructor" + this);
    }

    static SingletonLazyInitialize getInstance(){
         if(t==null){
             t=new SingletonLazyInitialize();
         }
         return t;
    }
}

public class Singleton {

    public static void main(String[] args) {
        SingletonEarlyInitialize t1 = SingletonEarlyInitialize.getInstance();
        System.out.println("t1 :" + t1);


         SingletonLazyInitialize t10 = SingletonLazyInitialize.getInstance();
        System.out.println("t10 :" + t10);
        SingletonLazyInitialize t20 = SingletonLazyInitialize.getInstance();
        System.out.println("t20 :" + t20);

    }

}
