import java.util.Scanner;
class Account{
    int AccountID, balance;
    String HolderName;
    Account(int a, String b, int c){
        if(a>=100 && a<=999){
            AccountID = a;
        }else{
            AccountID = -1;
        }
        HolderName = b;
        if(c>=0){
            balance = c;
        }else{
            balance = 0;
        }
    }
    public void setAccountBalance(int b, int z){
        System.out.println(AccountID+" "+HolderName+" "+balance);
        int new_bal = credit(b);
        System.out.println(new_bal+"\n"+new_bal);
    }
    public int credit(int add){
        return (balance+add);
    }
}

class VIPAccount extends Account{
    Scanner sc = new Scanner(System.in);
    VIPAccount(int a, String b, int c){
        /*int a = sc.nextInt();
        String b = sc.nextLine();
        int c = sc.nextInt();*/
        super(a, b, c);
    }
    public void setAccountBalance(int n_bal){
        if(n_bal>=-10000){
            System.out.println(n_bal);
        }else{
            System.out.println("The balance can be negative but no less than -10000");
        }
    }
}

public class AVMain{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        int c = sc.nextInt();
        VIPAccount obj = new VIPAccount(a, b, c);
        int add_b = sc.nextInt();
        obj.setAccountBalance(add_b, 0);
        int n_bal = sc.nextInt();
        obj.setAccountBalance(n_bal);
    }
}
