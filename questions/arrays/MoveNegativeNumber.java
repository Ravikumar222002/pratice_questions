package questions.arrays;

// Move all the negative elements to one side of the array
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5

import java.util.Arrays;

public class MoveNegativeNumber {

    public static void main(String[] args) {

        int [] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        check1(a);
    }

    static void check1(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
