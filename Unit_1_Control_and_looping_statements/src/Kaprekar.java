import java.util.*;
public class Kaprekar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N==1){
            System.out.print("Kaprekar Number");
        }else{
            int S, l, p, q, sum = 0;
            String a, b, c;
            S = N*N;
            a = Integer.toString(S);
            l = a.length();
            b = a.substring(0, l/2);
            c = a.substring(l/2);
            p = Integer.parseInt(b);
            q = Integer.parseInt(c);
            sum = p+q;
            if(sum == N){
                System.out.print("Kaprekar Number");
            }else{
                System.out.print("Not a Kaprekar Number");
            }
        }
    }
}
