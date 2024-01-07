import java.util.Scanner;

class MyThread extends Thread{
    int n;
    MyThread(int a){
        n = a;
    }
    public void run(){
        System.out.println("Thread = "+n);
    }
}
public class MMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1){
            System.out.println("Thread is alive :: true");
        }
        try{
            for(int i=1;i<=n;i++){
                MyThread t = new MyThread(i);
                t.start();
                if(t.isAlive()==true){
                    t.join();
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("END Of = Thread");
        System.out.println("Thread is alive = false");
        System.out.println("End of main.");
    }
}
