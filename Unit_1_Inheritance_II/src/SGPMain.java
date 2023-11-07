import java.util.Scanner;

class SilverStall{
    String name, detail, owner;
    int cost;
    SilverStall(String a, String b, String c, int d){
        name = a;
        detail = b;
        owner = c;
        cost = d;
    }
    void display(){
        System.out.print(cost);
    }
}

class GoldStall extends SilverStall{
    int tvSet;
    GoldStall(String a, String b, String c, int d, int e){
        super(a, b, c, d);
        tvSet = e;
    }
    void display(){
        System.out.print((tvSet*100+super.cost));
    }
}

class PlatinumStall extends GoldStall{
    int projector;
    PlatinumStall(String a, String b, String c, int d, int e, int f){
        super(a, b, c, d, e);
        projector = f;
    }
    void display(){
        System.out.print((projector*500)+(super.tvSet*100)+super.cost);
    }
}

public class SGPMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        if(choice!='1'&&choice!='2'&&choice!='3'){
            System.out.print("Invalid Input");
        }else{
            String name, detail, owner;
            int cost;
            name = sc.nextLine();
            detail = sc.nextLine();
            owner = sc.nextLine();
            sc.nextLine();
            cost = sc.nextInt();
            //sc.nextLine();
            if(choice=='1'){
                SilverStall obj = new SilverStall(name, detail, owner, cost);
                obj.display();
            }else if(choice=='2'){
                int tvSet = sc.nextInt();
                GoldStall obj = new GoldStall(name, detail, owner, cost, tvSet);
                obj.display();
            }else{
                int tvSet = sc.nextInt();
                sc.nextLine();
                int projector = sc.nextInt();
                PlatinumStall obj = new PlatinumStall(name, detail, owner, cost, tvSet, projector);
                obj.display();
            }
        }
    }
}
