import java.util.Scanner;

class Multiply{
    void Mul(int a, int b){
        System.out.println((a*b));
    }
    
    void Mul(double a, double b){
        System.out.println((a*b));
    }
    
}

public class MMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Multiply obj = new Multiply();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        obj.Mul(a, b);
        double c, d;
        c = sc.nextDouble();
        d = sc.nextDouble();
        obj.Mul(c, d);
    }
}
