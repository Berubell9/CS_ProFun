public class ProFun10_Q2_650022{
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int n = 2;
        System.out.print(occurrences(arr,n));
    }
    public static int occurrences(int[] a, int n){
        return occurrences(a,n,0);
    }
    public static int occurrences(int[] a,int n,int idx){
        int cnt = 0;
        if(idx == a.length){
            return 0;
        }
        if(a[idx] == n){
            System.out.println(cnt+1);
            return 1+occurrences(a,n,idx+1);
        }
        return occurrences(a,n,idx+1);
    }
}