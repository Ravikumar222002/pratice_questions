package questions.java_Assignment;

// There is an array with every element repeated twice except one. Find that element
public class PresentAtOnce {

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(check(a));

    }

    static int check(int[] a){

        for(int i=0;i<a.length;i++){
            int count = 0;
            for(int j=0;j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count==1){
                return a[i];
            }
        }
        return -1;
    }
}
