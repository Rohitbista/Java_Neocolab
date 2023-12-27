import java.util.Scanner;

public class Hello{
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sayHello();
        sayHello(a);
    }
}
