package questions.arrays;

// Move all the negative elements to one side of the array
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5

import java.util.Arrays;

public class MoveNegativeNumber {

    public static void main(String[] args) {

        int [] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println(Arrays.toString(a));
        check3(a);
        System.out.println(Arrays.toString(a));
    }

    static void check1(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void check2(int[] a){
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                int t = a[i];
                a[i]=a[s];
                a[s]=t;
                s++;

            }
        }

    }

    static void check3(int [] a){

        int s = 0;
        int e = a.length-1;

        while(s<e){
            if(a[s] < 0 && a[e] < 0){  // both pointer point to -ve
                s++;
            } else if(a[s] > 0 && a[e] > 0){ // both pointer point to +ve
                e--;
            } else if(a[s] > 0 && a[e] < 0) {    // when only end are -ve
                int t = a[e];
                a[e] = a[s];
                a[s]=t;
                s++;e--;
            }
            else{ s++; e--;}
        }
    }

}
