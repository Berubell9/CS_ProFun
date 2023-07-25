// package ProFun.Lab13;
import java.io.IOException;
import java.nio.file.Paths;
// import java.nio.file.NoSuchFileException;
import java.util.Scanner;
public class ProFun13_ReadCSV650022 {
    static Employee[] empList = new Employee[2]; 
    public static void main(String[] args) {
        
        int cnt = 0, cntReal = 0;
        try(Scanner input = new Scanner(Paths.get("./employee.csv"))){
            while(input.hasNext()){
                try{
                    cnt++;
                    String row = input.nextLine();
                    String[] dataArr = row.split(",");
                    int employeeID = Integer.parseInt(dataArr[0]);
                    String firstName = dataArr[1];
                    String lastName = dataArr[2];
                    double salary = Double.parseDouble(dataArr[3]);
                    empList[cntReal] = new Employee(employeeID,firstName,lastName,salary);
                    cntReal++;
                }
                catch(NumberFormatException e){ //มีสิ่งเเปลกปลอมเข้าไปในตัวเลข
                    System.out.printf("Data format error at line: %d; %s\n",(cnt),e);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array is full – cannot load remaining rows");
                    // e.printStackTrace(); 
                }
            }
            printAllEmployee(cntReal);
            printEmpList(cntReal);
        }
        catch(IOException e){
            System.out.printf("Unknown I/O error: %s%n",e);
            e.printStackTrace(); //printบอกตำเเหน่งผิด
        }
        
    }
    public static void printAllEmployee(int cnt){
        System.out.printf("%-10s %-12s %-12s %10s %n","Emp Id","First Name","Last Name","Salary");
        for(int i=0;i<cnt;i++){
            System.out.printf("%-10s %-12s %-12s %10s %n",empList[i].getEmpId(),empList[i].getFirstName(),empList[i].getLastName(),empList[i].getSalary());
        }
    }

    public static void printEmpList(int cnt){
        System.out.println("----------------- printEmpList ----------------");
        System.out.printf("%-10s %-12s %-12s %10s %n","Emp Id","First Name","Last Name","Salary");
        for(int i=0;i<cnt;i++){
            System.out.printf("%-10s %-12s %-12s %10s %n",empList[i].getEmpId(),empList[i].getFirstName(),empList[i].getLastName(),empList[i].getSalary());
        }
    }
}
