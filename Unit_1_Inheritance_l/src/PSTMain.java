import java.util.*;
class Person{
    String name;
    Person(String n){
        name = n;
    }
    public void display_n(){
        System.out.println("Name : "+name);
    }
}

class Staff extends Person{
    int staff_id;
    Staff(String na, int is){
        super(na);
        staff_id = is;
    }
    
    public void display_is(){
        System.out.println("Staff Id : "+staff_id);
    }
}

class TemporaryStaff extends Staff{
    int days, hrs;
    TemporaryStaff(String na, int is, int d, int h){
        super(na, is);
        days = d;
        hrs = h;
    }
    
    public void display_sal(){
        System.out.println("No. of Days : "+days+"\nNo. of Hours Worked : "+hrs);
        System.out.println("Total Salary : "+(days*hrs*50));
    }
}

public class PSTMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int is = sc.nextInt();
        int d = sc.nextInt();
        int h = sc.nextInt();
        TemporaryStaff obj = new TemporaryStaff(n, is, d, h);
        obj.display_n();
        obj.display_is();
        obj.display_sal();
    }
}
