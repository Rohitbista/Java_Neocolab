import java.util.Scanner;

public class Multiply{
    public void Mul(int a, int b){
        System.out.println((a*b));
    }
    
    public void Mul(int a, int b, int c){
        System.out.println((a*b*c));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Multiply obj = new Multiply();
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        obj.Mul(a[0], a[1]);
        obj.Mul(a[2], a[3], a[4]);
    }
}
