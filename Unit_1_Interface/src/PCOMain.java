import java.util.Scanner;

interface Product{
    void ProductDetails(String[] cost);
    void show_Bill();
}

class Customer{
    int ID;
    String name;
    public void getdetails(int a, String b){
        ID = a;
        name = b;
    }
    
    public void showdetails(){
        System.out.println("ID:"+ID);
        System.out.println("NAME:"+name);
    }
}

class OrderOnline extends Customer implements Product{
    int total_bill = 0;
    public void ProductDetails(String[] cost){
        int noOfitems = cost.length;
        int temp = 0;
        for(int i=0;i<noOfitems;i++){
            temp = Integer.parseInt(cost[i]);
            total_bill+=temp;
        }
        if((total_bill>10000) && (total_bill<=30000)){
            total_bill+=(5 * total_bill / 100);
        }else if((total_bill>30000) && (total_bill<=50000)){
            total_bill+=(7 * total_bill / 100);
        }else if(total_bill>50000){
            total_bill+=(9 * total_bill / 100);
        }
    }
    
    public void show_Bill(){
        System.out.println("Bill:"+total_bill);
    }
}

public class PCOMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int n = Integer.parseInt(N);
        for(int i=0;i<n;i++){
            String A = sc.nextLine();
            int a = Integer.parseInt(A);
            String B = sc.nextLine();
            String C = sc.nextLine();
            int c = Integer.parseInt(C);
            String[] itemNames = new String[c];
            String[] cost =  new String[c];
            for(int j=0;j<c;j++){
                itemNames[j] = sc.nextLine();
                cost[j] = sc.nextLine();
            }
            OrderOnline obj = new OrderOnline();
            obj.getdetails(a, B);
            obj.ProductDetails(cost);
            obj.showdetails();
            obj.show_Bill();
        }
    }
}
