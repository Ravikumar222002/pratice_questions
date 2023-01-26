package questions.arrays;


// Find the maximum and minimum element in an array

public class MaxMin {

    public static void main(String[] args) {

        int[] a = {2,34,66,-1,5,22};
        check3(a);

    }

    static void check1(int[] a){
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length ; i++) {
            if(min > a[i]){
                min=a[i];
            }
            if(max < a[i]){
                max=a[i];
            }
        }
        System.out.println("min :" + min + " " + "max :" + max);
    }

    static void check2(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        System.out.println("min :" + min + " " + "max :" + max);

    }

    static void check3(int[] a){
        KthMaxMin.common(a);
        System.out.println("min :" + a[0] + " " + "max :" + a[a.length-1]);
    }
}
