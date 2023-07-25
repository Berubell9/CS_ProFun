import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        findResult(arr);
        sc.close();
    }

    static int[] findPointStart(int[][] arr){
        int[] location = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == -1){
                    location[0] = i;
                    location[1] = j;
                    return location;
                }
            }
        }
        return location;
    }

    static boolean find(int[][] arr, int row, int col, int[][] arrClone){
        //System.out.println(row+" : "+col);
        if(arrClone[row][col] == 9){
            return true;
        }
        else if(row - 1 >= 0 && (arrClone[row-1][col] == 1 || arrClone[row-1][col] == 9)){
            arrClone[row][col] = 0;
            return find(arr, row-1, col, arrClone);
        }
        else if(row + 1 < arr.length && (arrClone[row+1][col] == 1 || arrClone[row+1][col] == 9)){
            arrClone[row][col] = 0;
            return find(arr, row+1, col, arrClone);
        }
        else if(col - 1 >= 0 && (arrClone[row][col-1] == 1 || arrClone[row][col-1] == 9)){
            arrClone[row][col] = 0;
            return find(arr, row, col-1, arrClone);
        }
        else if(col + 1 < arr[0].length && (arrClone[row][col+1] == 1 || arrClone[row][col+1] == 9)){
            arrClone[row][col] = 0;
            return find(arr, row, col+1, arrClone);
        }
        
        if(arr[row][col] == -1){
            arr[row][col] = -1;
        }
        else {
            arr[row][col] = 0;
        }
        return false;
    }

    static int countOne(int[][] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    static void clone(int[][] arr, int[][] arrClone){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arrClone[i][j] = arr[i][j];
            }
        }
    }

    static void findResult(int[][] arr){
        int[][] clone = new int[arr.length][arr[0].length];
        int[] locationStart = findPointStart(arr);
        int count1 = countOne(arr);
        boolean check = false;
        while (count1 >= 0) {
            clone(arr, clone);
            check = find(arr, locationStart[0], locationStart[1], clone);
            if(check){
                System.out.println("Yes");
                break;
            }
            count1--;
        }
        if(!check){
            System.out.println("No");
        }
    }
}

/*
4 4
-1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 9
 */