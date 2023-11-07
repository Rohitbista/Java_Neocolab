import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
abstract class Account{
    protected String name;
    protected int number;
    protected int balance;
    LocalDate startdate;
    Account(String a, int b, int c, LocalDate d){
        name = a;
        number = b;
        balance = c;
        startdate = d;
    }
    abstract Double calculateInterest(LocalDate duedate);
}

class CurrentAccount extends Account{
    CurrentAccount(String a, int b, int c, LocalDate d){
        super(a, b, c, d);
    }
    Double calculateInterest(LocalDate duedate){
        long daysbetween = ChronoUnit.DAYS.between(super.startdate, duedate);
        double time = (int)daysbetween / 365;
        return ((5*super.balance*time)/100);
    }
}

class SavingsAccount extends Account{
    SavingsAccount(String a, int b, int c, LocalDate d){
        super(a, b, c, d);
    }
    Double calculateInterest(LocalDate duedate){
        long daysbetween = ChronoUnit.DAYS.between(super.startdate, duedate);
        double time = (int)daysbetween / 365;
        return ((12*super.balance*time)/100);
    }
}

public class ACSMain2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int num = sc.nextInt();
        //sc.nextLine();
        int bal = sc.nextInt();
        String dateString1 = sc.next();
        String dateString2 = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(dateString1, formatter);
        LocalDate date2 = LocalDate.parse(dateString2, formatter);
        if(choice==1){
            SavingsAccount obj = new SavingsAccount(name, num, bal, date1);
            System.out.println(obj.calculateInterest(date2));
        }else{
            CurrentAccount obj = new CurrentAccount(name, num, bal, date1);
            System.out.println(obj.calculateInterest(date2));
        }
        sc.close();
    }
}
