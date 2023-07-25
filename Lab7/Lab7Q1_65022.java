package ProFun.Lab7;

import java.util.Scanner;

public class Lab7Q1_65022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int n = sc.nextInt();
        System.out.print(" = "+factorial(n));
        sc.close();
    }
    static int factorial(int n){
        int fac=1;
        int i;
        for(i=n;i>0;i--){
            if(i == 1){
                System.out.print(i);
            }
            else{
                System.out.print(i+" x ");
            }
            fac *= i;
        }
        return fac;
    }
}
