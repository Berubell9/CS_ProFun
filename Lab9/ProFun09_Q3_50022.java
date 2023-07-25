import java.util.*;
class ProFun09_Q3_50022 {
  public static void main(String[] args) {
    int[][] boom = new int[8][13];
    Random ran = new Random();
    int n = ran.nextInt(30); //จน.ระเบิด
    //ใส่ระเบิด
    for(int i=0 ;i<n;i++){
      int x = ran.nextInt(8); //เเนวนอน
      int y = ran.nextInt(13); //เเนวตั้ง
      boom[x][y] = 9;
    }
    System.out.println("------------- MineSweeper -------------");
    for(int j=0 ;j<boom.length;j++){
      System.out.println(Arrays.toString(boom[j]));
    }
    System.out.println("---------------------------------------");
    markMap(boom);
    for(int j=0 ;j<boom.length;j++){
      System.out.println(Arrays.toString(boom[j]));
    }

  }
  static int[][] markMap(int [][] bMap){
    for(int i=0 ;i<bMap.length;i++){
      for(int j=0;j<bMap[i].length;j++){
        //ข้ามระเบิด
        if(bMap[i][j] == 9){
          continue;
        }
        /*--------------------------------*/
        //3ทิศ บนซ้าย
        else if (i==0 && j==0){
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j+1]==9){
            bMap[i][j]+=1;
          }
        }
        //3ทิศ ล่างซ้าย
        else if(i == bMap.length-1 && j == 0){
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
        }
        //3ทิศ ล่างขวา
        else if(i == bMap.length-1 && j == bMap[i].length-1){
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
        }
        //3ทิศ ล่างซ้าย
        else if(i == bMap.length-1 && j == 0){
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
        }
        //3ทิศ บนขวา
        else if(i == 0 && j == bMap[i].length-1){
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
        }
        //ขอบบน
        else if(i == 0){
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
        }
        //ขอบซ้าย
        else if(j == 0){
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
        }
        //ขอบล่าง
        else if(i == bMap.length-1){
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
        }
        //ขอบขวา
        else if(j == bMap[i].length-1){
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
        }
        //ข้างใน 8 ทิศ
        else{
          if(bMap[i-1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i-1][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i][j+1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j-1]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j]==9){
            bMap[i][j]+=1;
          }
          if(bMap[i+1][j+1]==9){
            bMap[i][j]+=1;
          }
        }
      }
    }
    return bMap;
  }
}