import java.util.Scanner;

class Thread1 extends Thread{
    int n;
    Thread1(int a){
        n = a;
    }
    
    public void run(){
        System.out.println("Thread "+n+" is running");
    }
}

public class TMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=11;i<=(b+10);i++){
            Thread1 obj = new Thread1(i);
            try{
                obj.start();
            }catch(Exception e){}
        }
    }
}
