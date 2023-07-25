package ProFun.Lab14;
import java.util.*;
//import java.util.stream.*;
public class Q4ProFun14StreamDemo {
    static ArrayList<ProFun14Employee> eList;
    void oldWay(){
        String Query = "Q4 Employee with lowest salary : ";
        ProFun14Employee emp;
        emp = eList.stream()
          .min(Comparator.comparing(ProFun14Employee :: getSalary))
          .get();
        System.out.println(Query);
        System.out.println(emp); //IT B(2011) 5000
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eList = new ArrayList <ProFun14Employee>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] arrStr = str.split(" ");
            eList.add(new ProFun14Employee(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[3])));
        }
        Q4ProFun14StreamDemo demo = new Q4ProFun14StreamDemo();
        demo.oldWay();
        sc.close();
    }
}
class ProFun14Employee{
    String name;
    String dept;
    int salary;
    int yearStart;
  
    ProFun14Employee(String n,String d,int sal, int yr){
      name = n;
      dept = d;
      salary = sal;
      yearStart = yr;
    }
    public String toString(){
      return String.format("%s %s(%d) %d",dept,name,yearStart,salary);
    }
    public String getName(){
      return name;
    }
    public int getYearStart(){
      return yearStart;
    }
    public int getSalary(){
      return salary;
    }
    public String getDepartment(){
      return dept;
    }
    
}
