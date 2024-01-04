import java.util.Scanner;
public class AEMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            System.out.print((a/b));
        }catch(ArithmeticException e){
            System.out.print("java.lang.ArithmeticException: / by zero");
        }catch(Exception e){
            System.out.print("Some other exception");
        }
    }
}
