import java.util.Scanner;
class Bank{
    int accno;
    String name;
    Double balance;
    Bank(int a, String b, Double c){
        accno = a;
        name = b;
        balance = c;
    }
}

class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String str){
        super(str);
    }
}
class BankBO{
    static void validate(Bank b) throws InvalidBalanceException{
        if(b.balance<1000){
            throw new InvalidBalanceException("Balance is less than 1000\nInvalidBalanceException");
        }else{
            System.out.print(b.accno+" "+b.name+" "+b.balance);
        }
    }
}

public class BIBMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        Double c = sc.nextDouble();
        BankBO obj = new BankBO();
        try{
            obj.validate(new Bank(a, b, c));
        }catch(InvalidBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
