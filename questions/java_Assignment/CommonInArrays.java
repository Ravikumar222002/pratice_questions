package questions.java_Assignment;

// Find common elements between two arrays.

import java.util.HashSet;
import java.util.Set;

public class CommonInArrays {

    public static void main(String[] args) {

        int a[] = {2,4,6,3,7};
        int b[] = {1,3,2,6,9,7};

        check2(a,b);
    }

    static void check(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    set.add(a[i]);
                }
            }
        }
        System.out.println("common elements : " + set);
    }

    static void check2(int[] a,int[] b){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int t : a){
            set1.add(t);
        }
        for (int t : b){
            set2.add(t);
        }
        set1.retainAll(set2);
        System.out.println("common elements : " + set1);
    }
}
