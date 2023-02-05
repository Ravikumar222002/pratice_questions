package questions.arrays.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a = {2,4,6,7,9,12,14,28,30};
        int k = 40;
        System.out.println(binarySearch(a,k));
    }

    static int binarySearch(int[] a, int k){
        int s=0;
        int e=a.length-1;
        while(s<=e) {
            int m = s + (e-s)/2;  // m=(s+e)/2
            if (a[m] == k) return m;
            else if (k > a[m]) s = m + 1;
            else e = m - 1;
        }
        return -1;
    }
}
