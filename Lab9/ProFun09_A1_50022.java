import java.util.Arrays;

public class ProFun09_A1_50022 {
    public static void main(String[] args) {
        int[] data = {0,1,0,1,1,0,0,0,1};
        shake(data);
        System.out.println(Arrays.toString(data));
    }
    static int [] shake (int [] data){
        int temp = 0;
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1;j++){
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
}
