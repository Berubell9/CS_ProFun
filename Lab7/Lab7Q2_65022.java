package ProFun.Lab7;

public class Lab7Q2_65022 {
    public static void main(String[] args){
        int[] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        System.out.print("Maximun is "+maxElement(data));
    }
    static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int i;
        for(i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
