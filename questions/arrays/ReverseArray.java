package questions.arrays;

// Reverse the array

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {1,2,3,5,4};
        System.out.println( "Before Reverse : " + Arrays.toString(a));
        reverse(a,0,a.length-1);
        System.out.println( "After Reverse : " + Arrays.toString(a));
    }

    static void reverse(int[] a,int s,int e){
        int temp;
        while(s<e){
            temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++; e--;
        }
    }

}
