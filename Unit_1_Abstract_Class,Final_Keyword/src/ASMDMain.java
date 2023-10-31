import java.util.Scanner;

abstract class Complex{
    abstract void calculation(Double r1, Double i1, Double r2, Double i2);
}

class Addition extends Complex{
    void calculation(Double r1, Double i1, Double r2, Double i2){
        System.out.println("Addition:");
        System.out.printf("\t%.4f",(r1+r2));
        if((i2+i1)<0){
            System.out.printf(" %.4f i\n",(i2+i1));
        }else{
            System.out.printf(" +%.4f i\n",(i2+i1));
        }
    }
}

class Substraction extends Complex{
    void calculation(Double r1, Double i1, Double r2, Double i2){
        System.out.println("Subtraction:");
        System.out.printf("\t%.4f",(r1-r2));
        if((i1-i2)<0){
            System.out.printf(" %.4f i\n",(i1-i2));
        }else{
            System.out.printf(" +%.4f i\n",(i1-i2));
        }
    }
}

class Multiplication extends Complex{
    void calculation(Double r1, Double i1, Double r2, Double i2){
        System.out.println("Multiplication:");
        System.out.printf("\t%.4f",(r1*r2-i1*i2));
        Double t = (r1*i2+r2*i1);
        if(t<0){
            System.out.printf(" %.4f i\n",t);
        }else{
            System.out.printf(" +%.4f i\n",(r1*i2+r2*i1));
        }
    }
}

class Division extends Complex{
    void calculation(Double r1, Double i1, Double r2, Double i2){
        System.out.println("Division:");
        System.out.printf("\t%.4f",((r1*r2 + i1*i2)/(r2*r2 + i2*i2)));
        Double t = ((i1*r2 - i2*r1)/(r2*r2 + i2*i2));
        if(i1==0&&i2==0&&i2==0&&r2==0){
            System.out.print(" "+t+" i\n");
        }else if(t<0){
            System.out.printf(" %.4f i\n",t);
        }else{
            System.out.printf(" +%.4f i\n",t);
        }
    }
}

public class ASMDMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double r1, i1, r2, i2;
        r1 = sc.nextDouble();
        i1 = sc.nextDouble();
        r2 = sc.nextDouble();
        i2 = sc.nextDouble();
        new Addition().calculation(r1, i1, r2, i2);
        new Substraction().calculation(r1, i1, r2, i2);
        new Multiplication().calculation(r1, i1, r2, i2);
        new Division().calculation(r1, i1, r2, i2);
    }
}
