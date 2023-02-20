import java.util.*;
class Pascal_triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int i, j, a = 1;
        for(i=0;i<N;i++){
            a = 1;
            for(j=0;j<=i;j++){
                System.out.print(a+" ");
                a = a * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}