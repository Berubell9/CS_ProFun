import java.util.*;
public class Quiz1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // M*N
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[][] arr = new int[N][M];
    // Input
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        int num = sc.nextInt();
        arr[i][j] = num;
      }
    }
    // Sort
    int S = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j][S] > arr[j + 1][S]) {
          for (int v = 0; v < arr[0].length; v++) {
            int temp = arr[j][v];
            arr[j][v] = arr[j+1][v];
            arr[j+1][v] = temp;
          }
        }
      }
    }
    // Print
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if(j == arr[i].length-1){
          System.out.print(arr[i][j]);
        }
        else{
          System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();
    }
    sc.close();

  }
}