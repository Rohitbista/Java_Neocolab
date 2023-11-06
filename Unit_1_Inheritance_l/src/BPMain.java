import java.util.*;

class BasicCustomer{
    String Name, City, Gender;
    int Age, TotalBillAmount;
    
    BasicCustomer(String n, String c, String g, int a, int tba){
        Name = n;
        City = c;
        Gender = g;
        Age = a;
        TotalBillAmount = tba;
    }
    
    public int calculateDiscount(){
        int res = 0;
        if(TotalBillAmount>=1 && TotalBillAmount<=4999){
            res = 100;
        }else if(TotalBillAmount>=5000 && TotalBillAmount<=7499){
            res = 250;
        }else if(TotalBillAmount>=7500 && TotalBillAmount<=9999){
            res = 500;
        }else if(TotalBillAmount>=10000 && TotalBillAmount<=19999){
            res = 750;
        }else if(TotalBillAmount>=20000 && TotalBillAmount<=29999){
            res = 1000;
        }else{
            res = 1500;
        }
        return res;
    }
    
    public void display(){
        System.out.println("Name: "+Name+"\nCity: "+City+"\nAge: "+Age+"\nGender: "+Gender);
        System.out.println("Total Bill Amount: "+TotalBillAmount);
    }
    
    public void dis_bas(){
        System.out.println("Discount: "+calculateDiscount());
    }
}

class PremiumCustomer extends BasicCustomer{
    int sub_fee;
    PremiumCustomer(String n, String c, String g, int a, int tba, int sf){
        super(n, c, g, a, tba);
        sub_fee=sf;
    }
    
    public int calculateDiscount(){
        int res = 0;
        if(super.TotalBillAmount>=1 && super.TotalBillAmount<=4999){
            res = 200;
        }else if(super.TotalBillAmount>=5000 && super.TotalBillAmount<=7499){
            res = 400;
        }else if(super.TotalBillAmount>=7500 && super.TotalBillAmount<=9999){
            res = 700;
        }else if(super.TotalBillAmount>=10000 && super.TotalBillAmount<=19999){
            res = 1000;
        }else if(super.TotalBillAmount>=20000 && super.TotalBillAmount<=29999){
            res = 1500;
        }else{
            res = 2000;
        }
        
        return res;
    }
    
    public void sub_fees(){
        System.out.println("Subscription fee/month: "+sub_fee);
        System.out.println("Discount: "+calculateDiscount());
    }
}

public class BPMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String c = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        String g = sc.nextLine();
        int tba = sc.nextInt();
        int ch = sc.nextInt();
        if(ch==0){
            BasicCustomer obj = new BasicCustomer(n, c, g, a, tba);
            obj.display();
            obj.dis_bas();
        }else{
            int sf = sc.nextInt();
            PremiumCustomer obj = new PremiumCustomer(n, c, g, a, tba, sf);
            obj.display();
            obj.sub_fees();
        }
    }
}
