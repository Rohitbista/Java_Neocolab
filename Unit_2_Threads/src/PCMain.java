import java.util.Scanner;

class thread{
    int n;
    boolean v = false;
    
    synchronized int get(){
        while(!v)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException Caught");
            }
            System.out.println("Consumer ::: "+n);
            v = false;
            notify();
            return n;
    }
    synchronized void put(int n){
        while(v)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException Caught");
            }
            this.n = n;
            v = true;
            System.out.println("Producer ::: "+n);
            notify();
    }
}

class Producer implements Runnable{
    thread a;
    int k;
    
    Producer(thread a, int b){
        k = b;
        this.a = a;
        new Thread(this, "Producer").start();
    }
    
    public void run(){
        int i = 1;
        while(k>0){
            a.put(i++);
            k-=1;
        }
        System.out.println("Producer Terminating.");
    }
}

class Consumer implements Runnable{
    thread a;
    Consumer(thread a){
        this.a = a;
        new Thread(this, "Consumer").start();
    }
    
    public void run(){
        while(true){
            a.get();
        }
    }
}

public class PCMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thread a = new thread();
        new Producer(a, n);
        new Consumer(a);
    }
}