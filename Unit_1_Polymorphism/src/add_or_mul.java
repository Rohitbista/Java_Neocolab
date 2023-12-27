import java.util.Scanner;

public class add_or_mul{
    static void fun1(int a,int b){
        System.out.println((a+b));
    }
    
    static void fun1(int a,int b,int c){
        System.out.println((a*b*c));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Arr;
        Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        if(n>3||n<2){
            System.out.print("WRONG INPUT");
        }else{
            if(n==2){
                fun1(Arr[0], Arr[1]);
            }else{
                fun1(Arr[0], Arr[1], Arr[2]);
            }
        }
    }
}
