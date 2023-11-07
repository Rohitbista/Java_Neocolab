import java.util.Scanner;
class Account{
    protected String accName;
    protected String accNo;
    protected String bankName;
    Account(String a, String b, String c){
        accName = a;
        accNo = b;
        bankName = c;
    }
    protected void display(){
        System.out.println(accName);
        System.out.println(accNo);
        System.out.println(bankName);
    }
}

class CurrentAccount extends Account{
    private String tinNumber;
    CurrentAccount(String a, String b, String c, String d){
        super(a, b, c);
        tinNumber = d;
    }
    protected void display(){
        super.display();
        System.out.println(tinNumber);
    }
}

class SavingsAccount extends Account{
    private String orgName;
    SavingsAccount(String a, String b, String c, String d){
        super(a, b, c);
        orgName = d;
    }
    protected void display(){
        super.display();
        System.out.println(orgName);
    }
}

public class ACSMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        String a, b, c, d;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        d = sc.next();
        if(choice==1){
            SavingsAccount obj = new SavingsAccount(a, b, c, d);
            obj.display();
        }else{
            CurrentAccount obj = new CurrentAccount(a, b, c, d);
            obj.display();
        }
    }
}