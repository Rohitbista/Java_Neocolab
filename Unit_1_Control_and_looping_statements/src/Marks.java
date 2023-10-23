import java.util.*;
public class Marks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N<0){
            System.out.print("Invalid");
        }else if(N>=85){
            System.out.print("A");
        }else if(N>=75){
            System.out.print("B");
        }else if(N>=65){
            System.out.print("C");
        }else{
            System.out.print("D");
        }
    }
}