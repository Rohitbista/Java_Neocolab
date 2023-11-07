import java.util.Scanner;
class VISACard{
    String holdername, ccv;
    VISACard(String a, String b){
        holdername = a;
        ccv = b;
    }
    public Double computeRewardPoints(String purchaseType, Double amount){
        return (1*amount/100);
    }
}

class HPVISACard extends VISACard{
    HPVISACard(String a, String b){
        super(a, b);
    }
    public Double computeRewardPoints(String purchaseType, Double amount){
        if(purchaseType.equals("fuel")){
            return ((1*amount/100)+10);
        }else{
            return (super.computeRewardPoints(purchaseType, amount));
        }
    }
}

public class VHMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a, b, c;
        Double d;
        int choice;
        a = sc.nextLine();
        b = sc.nextLine();
        d = sc.nextDouble();
        sc.nextLine();
        c = sc.nextLine();
        choice = sc.nextInt();
        if(choice==1){
            VISACard obj = new VISACard(a, b);
            System.out.printf("%.1f",obj.computeRewardPoints(c, d));
        }else if(choice==2){
            HPVISACard obj = new HPVISACard(a, b);
            System.out.printf("%.1f",obj.computeRewardPoints(c, d));
        }else{
            System.out.print("Invalid Choice");
        }
    }
}
