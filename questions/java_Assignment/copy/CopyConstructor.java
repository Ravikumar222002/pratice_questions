package questions.java_Assignment.copy;

class Test{
    int a;
    int b;

    public Test(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public Test(Test t1) {
        this.a=t1.a;
        this.b=t1.b;
    }
}
 class CopyConstructor {

     public static void main(String[] args) {

         Test t1 = new Test(2,5);
         Test t2 = new Test(t1);

         System.out.println("t1 :" + t1.a + "  " + t1.b );
         System.out.println("t2 :" + t2.a + "  " + t2.b );
     }

}



