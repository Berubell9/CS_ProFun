package ProFun.Lab4;
import java.util.Scanner;

// หาผลรวมของราคาสินค้า 3 ชิ้นโดย คิดเฉพาะ 2 ชิ้นที่มีค่ามากที่สุดใน 3 ชิ้น

public class Lab4Q265022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of the first item : ");
        int a = sc.nextInt();
        System.out.print("Price of the second item : ");
        int b = sc.nextInt();
        System.out.print("Price of the third item : ");
        int c = sc.nextInt();
        
        //a+b abc
        if(a>c && b>c){
            System.out.print(a+b);
        }

        //a+c acb
        else if(a>b && c>b){
            System.out.print(a+c);
        }
        
        //b+c bca
        else if(b>a && c>a){
            System.out.print(b+c);
        }

        sc.close();
    }
}
