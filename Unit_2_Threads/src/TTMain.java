import java.util.Scanner;

class Thread1 implements Runnable{
    int n;
    Thread1(int a){
        n = a;
    }
    public void run(){
        try{
            for(int i=1;i<=n;i++){
                if((n%i)==0){
                    System.out.println(n+" is divisible by "+i);
                }
            }
        }catch(Exception e){}
    }
}

class Thread2 implements Runnable{
    int n;
    Thread2(int a){
        n = a;
    }
    public void run(){
        int fact = 1, i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i%j)==0){
                    fact*=j;
                }
            }
            System.out.println("Factorial : "+i+"! = "+fact);
            fact = 1;
        }
    }
}
public class TTMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        Thread1 ob1 = new Thread1(a);
        Thread2 ob2 = new Thread2(b);
        Thread obj = new Thread(ob1);
        Thread obj2 = new Thread(ob2);
        try{
            obj.start();
            obj2.start();
        }catch(Exception e){}
    }
}