import java.util.Arrays;

public class ProFun08_Q3_650022 {
    public static void main(String[] args) {
        int[] data = {5,3,8,4,10,3,1,5,9,7,2,0}; //12
        topK(data);
    }
    static void topK(int[] intArr){
        int[] arr = new int[10]; 
        int temp=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = intArr[i];
            System.out.println("---------------------");
            System.out.println(Arrays.toString(arr));
            

            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<intArr[j+1]){
                    temp = arr[i];
                    arr[i] = intArr[j+1];
                    intArr[j+1] = temp;     
                }
            }
            System.out.println(Arrays.toString(arr));   
        }
    }
}
