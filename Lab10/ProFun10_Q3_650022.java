import java.util.Arrays;

public class ProFun10_Q3_650022 {
    public static void main(String[] args) {
        int[] a = {1,-2, 3, 4, -5};
        System.out.println(Arrays.toString(negativesToZero(a)));
    }
    public static int[] negativesToZero(int[] a){
        int[] b = Arrays.copyOf(a,a.length);
         negativesToZero(a,b,0);
         return b;
    }
    public static void negativesToZero(int[] a,int[] b,int idx){
        if(idx == a.length){
            return;
        }
        if(a[idx]<0){
            b[idx] = 0;
        }
        negativesToZero(a,b,idx+1);
    }
}
