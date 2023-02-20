import java.util.*;
public class One_more_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a = 6, b = 5;
        for(int i=0;i<N;i++){
            System.out.print(a+" ");
            a+=b;
            b+=5;
        }
    }
}
