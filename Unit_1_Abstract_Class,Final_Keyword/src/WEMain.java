import java.util.Scanner;

abstract class ItemType{
    abstract Double calculateAmount();
}

class wooden extends ItemType{
    int noOfItems;
    Double cost;
    wooden(int a, Double b){
        noOfItems = a;
        cost = b;
    }
    Double calculateAmount(){
        return (cost*(double)noOfItems);
    }
}

class electronics extends ItemType{
    String type;
    Double amount;
    electronics(String a, Double b){
        type = a;
        amount = b;
    }
    Double calculateAmount(){
        if(type.equals("Commercial")){
            return amount;
        }else if(type.equals("Academics")){
            return (amount - (5 * amount)/100);
        }else{
            return 0.0;
        }
    }
}

public class WEMain{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            int a = sc.nextInt();
            Double b = sc.nextDouble();
            System.out.println(new wooden(a, b).calculateAmount());
        }else if(choice==2){
            sc.nextLine();
            String a = sc.nextLine();
            Double b = sc.nextDouble();
            System.out.println(new electronics(a, b).calculateAmount());
        }
    }
}
