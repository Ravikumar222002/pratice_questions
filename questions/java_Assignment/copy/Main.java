package questions.java_Assignment.copy;

class Testing implements Cloneable {

    int a;

    public Testing(int i) {
        this.a=i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class Main implements Cloneable  {

    public static void main(String[] args) throws CloneNotSupportedException {

        Testing t1 = new Testing(2);
        Testing t2 = (Testing) t1.clone();

        System.out.println("t1 :" + t1.a);
        System.out.println("t2 :" + t2.a);


    }

}
