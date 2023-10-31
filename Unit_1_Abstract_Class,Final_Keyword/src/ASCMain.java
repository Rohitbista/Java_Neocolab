import java.util.Scanner;

abstract class Accounts{
    protected int balance;
    int accno;
    String name;
    String address;
    Accounts(int a, int b, String c, String d){
        accno = a;
        balance = b;
        name = c;
        address = d;
    }
    abstract public void withdrawal(int amount);
    abstract public void deposit(int amount);
    public void display(){
        System.out.println(accno+" "+name+" "+balance+" "+address);
    }
}

class SavingsAccount extends Accounts{
    int rateOfInterest, cc;
    SavingsAccount(int a, int b, String c, String d, int e){
        super(a, b, c, d);
        rateOfInterest = e;
    }
    public void calcamt(int balance){
        cc = balance + (rateOfInterest * balance / 100);
        System.out.println(cc);
    }
    public void display(){
        super.display();
    }
    public void deposit(int amount){
        System.out.println((balance + amount));
    }
    public void withdrawal(int amount){
        System.out.println((balance - amount));
    }
}

class CurrentAccount extends Accounts{
    int draftLimit;
    CurrentAccount(int a, int b, String c, String d, int e){
        super(a, b, c, d);
        draftLimit = e;
    }
    public void display(){
        super.display();
        System.out.println(draftLimit);
    }
    public void deposit(int amount){
        System.out.println((super.balance + amount));
    }
    public void withdrawal(int amount){
        System.out.println((super.balance - amount));
    }
}

public class ASCMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        String c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextLine();
        d = sc.nextLine();
        int choice = sc.nextInt();
        if(choice==1){
            int rateOfInterest = sc.nextInt();
            SavingsAccount obj = new SavingsAccount(a, b, c, d, rateOfInterest);
            int tt = sc.nextInt();
            if(tt==1){
                int de = sc.nextInt();
                obj.display();
                obj.calcamt(b);
                obj.deposit(de);
            }else if(tt==2){
                int wi = sc.nextInt();
                obj.display();
                obj.calcamt(b);
                obj.withdrawal(wi);
            }
        }else if(choice==2){
            int draftLimit = sc.nextInt();
            CurrentAccount obj = new CurrentAccount(a, b, c, d, draftLimit);
            int tt = sc.nextInt();
            if(tt==1){
                int de = sc.nextInt();
                obj.display();
                obj.deposit(de);
            }else if(tt==2){
                int wi = sc.nextInt();
                obj.display();
                obj.withdrawal(wi);
            }
        }
    }
}
