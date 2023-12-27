import java.util.Scanner;

public class Icecream{
    public void Quantity(int r, int h){
        double d = 0.33 * 3.14 * r * r * h;
        System.out.printf("%.2f",d);
    }
    
    public void Quantity(int r){
        double d = Math.pow((double)r,3) * 3.14 * 1.33;
        System.out.printf("%.2f",d);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Icecream obj = new Icecream();
        int a = 0, b;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            obj.Quantity(a, b);
        }catch(Exception e){
            obj.Quantity(a);
        }
    }
}
