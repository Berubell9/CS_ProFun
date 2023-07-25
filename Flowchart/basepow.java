package ProFun.Flowchart;

import java.util.Scanner;

public class basepow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Base = ");
        int x = sc.nextInt(); 
        System.out.print("Pow = ");
        int y = sc.nextInt();
        double z = x;
        if(y==0){  //เลขยกกำลัง 0 พิมพ์ 1
            z = 1;
        }
        else if(y>1){ //เลขยกกำลัง 2 ขึ้นไป
            for(int i = y;i>1;i--){
                z = z*x;
            }
        }
        else if(y<0){ //เลขยกกำลังติดลบ
            y = y*(-1);
            if(y>1){
                for(int i=y;i>1;i--){
                    z = z*x;
                }
            }
            else{
                z = 1/z;
            }
        }
        System.out.println(z);
        sc.close();
    }
}
