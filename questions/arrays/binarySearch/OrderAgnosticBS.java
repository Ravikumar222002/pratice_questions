package questions.arrays.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] a = {2,4,6,7,9,12,14,28,30};
      //  int[] a={99,87,84,76,54,48,32};
        int k = 28;
        System.out.println(orderAgnosticBS(a,k));
    }

    static int orderAgnosticBS(int[] a, int k){
        int s=0;
        int e=a.length-1;
        Boolean isAsc=a[s] < a[e];

        while(s<=e) {
            int m = s + (e-s)/2;
            if (a[m] == k)
                return m;
            if(isAsc){
                if (k > a[m])
                    s = m + 1;
                else
                    e = m - 1;
            }else{
                 if (k > a[m])
                     e = m - 1;
                else
                    s = m + 1;
            }
        }
        return -1;
    }

}
