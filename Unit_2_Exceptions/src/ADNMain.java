import java.util.Scanner;

public class ADNMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A;
        A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        String str = null;
        try{
            System.out.println(A[a]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Array index out of bound.");
        }
        try{
            System.out.println((b/c));
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        try{
            System.out.print(str.indexOf(d));
        }catch(NullPointerException e){
            System.out.println("null\njava.lang.NullPointerException");
        }
    }
}
