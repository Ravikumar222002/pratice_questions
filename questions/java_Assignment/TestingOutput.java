package questions.java_Assignment;

// 14.What will be the  output on new Child(); ?

class Parent extends GParent {

    static {
        System.out.println("parent");
    }
    {
        System.out.println("parent1");
    }
    public  Parent() {
        System.out.println("constructor -  Parent");
    }
}

class GParent {

    static {
        System.out.println("Gparent");
    }

    {
        System.out.println("Gparent1");
    }

    public  GParent() {
        System.out.println("constructor -  GPARENT");
    }
}

class Child extends Parent{
     static{
         System.out.println("child");
     }

    {
        System.out.println("Child1");
    }

    public Child() {
        System.out.println("constructor - child");
    }
}
public class TestingOutput {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
