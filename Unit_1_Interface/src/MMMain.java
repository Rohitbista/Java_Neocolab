import java.util.Scanner;

interface MyInter{
    abstract void CountMinMov(int[] A);
}

class Minimum implements MyInter{
    public void CountMinMov(int[] A){
        int a = A.length;
        int i, count = 0, exe = a;
        for(i=a-1;i>=0;i--){
            if(A[i]==exe){
                exe--;
            }
            count = exe;
        }
        System.out.println(count);
    }
}

public class MMMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for(int i=0;i<N;i++){
            Arr[i] = sc.nextInt();
        }
        Minimum obj = new Minimum();
        obj.CountMinMov(Arr);
    }
}
