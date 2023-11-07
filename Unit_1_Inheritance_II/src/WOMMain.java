import java.util.Scanner;
class WorkerDetail{
    int e_code, b_sal;
    String name;
    Double HRA;
    WorkerDetail(int a, String b, int c){
        e_code = a;
        name = b;
        b_sal = c;
    }
    public void calculateHRA(){
        HRA = (60*(double)b_sal)/100;
    }
    public void display(){
        System.out.println("Code :"+e_code);
        System.out.println("Name : "+name);
        System.out.println("Salary "+b_sal);
        System.out.println("HRA :"+HRA);
    }
}

class OfficerSal extends WorkerDetail{
    Double DA;
    OfficerSal(int a, String b, int c){
        super(a, b, c);
    }
    public void calculateDA(){
        DA = (98*(double)super.b_sal)/100;
    }
    public void display(){
        super.display();
        System.out.println("DA :"+DA);
    }
}

class ManagerSal extends OfficerSal{
    Double CA, GP;
    ManagerSal(int a, String b, int c){
        super(a, b, c);
    }
    public void calculateCA(){
        CA = (20*(double)super.b_sal)/100;
    }
    public void Gross_pay(){
        GP = CA + super.DA + super.HRA + (double)super.b_sal;
    }
    public void display(){
        super.display();
        System.out.println("City Allowance :"+CA);
        System.out.println("Gross Salary :"+GP);
    }
}

public class WOMMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, c;
        String b;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextLine();
        c = sc.nextInt();
        ManagerSal obj = new ManagerSal(a, b, c);
        obj.calculateHRA();
        obj.calculateDA();
        obj.calculateCA();
        obj.Gross_pay();
        obj.display();
    }
}
