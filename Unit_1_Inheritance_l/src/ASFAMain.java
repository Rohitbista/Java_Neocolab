import java.util.Scanner;
class Account{
    protected String accountNumber;
    protected Double balance;
    protected String accountHolderName;
    
    public Account(String accountNumber, Double balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
}

class SavingAccount extends Account{
    protected Double minimumBalance;
    
    public SavingAccount(String accountNumber, Double balance, String accountHolderName, Double minimumBalance){
        super(accountNumber, balance, accountHolderName);
        this.minimumBalance = minimumBalance;
    }
}

class FixedAccount extends SavingAccount{
    private int lockingPeriod;
    
    public FixedAccount(String accountNumber, Double balance, String accountHolderName, Double minimumBalance, int lockingPeriod){
        super(accountNumber, balance, accountHolderName, minimumBalance);
        this.lockingPeriod = lockingPeriod;
    }
    public String toString(){
        return String.format("%-20s %-10.2f %-20s %-20.0f %s", accountNumber, balance, accountHolderName, minimumBalance, lockingPeriod);
    }
}

class AccountBO{
    public void getAccountDetail(String detail){
        String[] parts = detail.split(",");
        FixedAccount account = new FixedAccount(parts[0], Double.parseDouble(parts[1]), parts[2], Double.parseDouble(parts[3]), Integer.parseInt(parts[4]));
        System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
        System.out.println(account);
    }
}

public class ASFAMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        AccountBO obj1 = new AccountBO();
        obj1.getAccountDetail(input);
    }
}