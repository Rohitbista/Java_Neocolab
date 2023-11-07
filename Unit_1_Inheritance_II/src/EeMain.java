import java.util.Scanner;
class Employee{
    protected int empId;
    protected float salary;
}

class empLevel extends Employee{
    void top_management(){
        System.out.print(empId+"\n"+salary+"\n1");
    }
    
    void staff(){
        System.out.print(empId+"\n"+salary+"\n2");
    }
}

public class EeMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        empLevel obj = new empLevel();
        obj.empId = sc.nextInt();
        obj.salary = sc.nextFloat();
        if(obj.salary > 100){
            obj.top_management();
        }else{
            obj.staff();
        }
    }
}
