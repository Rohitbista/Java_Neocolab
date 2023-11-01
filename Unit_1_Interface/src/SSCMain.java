import java.util.Scanner;

interface ShapeCalculator{
    abstract void calc(int n);
}

class Square implements ShapeCalculator{
    public void calc(int s){
        System.out.println((s*s)+" "+(4*s));
    }
}

class Circle implements ShapeCalculator{
    public void calc(int r){
        System.out.printf("%.2f",(3.14*r*r));
        System.out.printf(" %.2f",(2*3.14*r));
    }
}

public class SSCMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Square().calc(n);
        new Circle().calc(n);
    }
}
