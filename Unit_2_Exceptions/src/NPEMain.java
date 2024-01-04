import java.util.Scanner;

public class NPEMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = null;
        try{
            int i = a.indexOf("", n);
            System.out.print(i);
        }catch(NullPointerException e){
            System.out.print("null\njava.lang.NullPointerException");
        }
    }
}