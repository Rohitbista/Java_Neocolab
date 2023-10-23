import java.util.*;
public class Lucas{
    public static void main(String[] args){
        int N, i, a = 0, b = 0, c = 1, d = 0;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for(i=0;i<N;i++){
            System.out.print(a+" ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
}
