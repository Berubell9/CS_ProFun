public class ProFun10_Q1_650022 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = 2;
        System.out.println(appearsIn(arr,n));
    }
    public static boolean appearsIn(int[] a, int n){
        return appearsIn(a,n,0);
    }
    public static boolean appearsIn(int[] a,int n ,int idx){
        if(idx == a.length){
            return false;
        }
        if(a[idx] == n){
            return true;
        }
        return appearsIn(a,n,idx+1);
    }
}
