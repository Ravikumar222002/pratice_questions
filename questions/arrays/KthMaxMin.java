package questions.arrays;

// Find the "Kth" max and min element of an array

import java.util.Arrays;

public class KthMaxMin {

    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        System.out.println(Arrays.toString(a));
        int k = 2;
        min(a,k);
        max(a,k);
        check2(a,k);
    }

    static void min(int[] a,int k){
        common(a);
        System.out.println("min :" + a[k-1]);
    }

    static void max(int[] a,int k){
        common(a);
        System.out.println("max :" + a[a.length-k]);
    }

    static void common(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i] > a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    static void check2(int[] a, int k){
        Arrays.sort(a);
        System.out.println("after : " + Arrays.toString(a));
        System.out.println("min :" + a[k-1] + " " + "max :" + a[a.length-k]);
    }
}

