import java.util.Scanner;
class haha{
    public static int[] locateLargest(double[][] A, int n, int m){
        int Arr[];
        Arr = new int[2];
        Arr[0] = 0;
        Arr[1] = 0;
        double Max = A[0][0];
        //System.out.println(Max);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Max<A[i][j]){
                    //System.out.println(Max);
                    Arr[0]=i;
                    Arr[1]=j;
                    Max = A[i][j];
                }
            }
        }
        //System.out.print(Arr[0]);
        return Arr;
    }
}

public class locateLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double A[][];
        A = new double[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextDouble();
            }
        }
        System.out.print("The largest is located at [");
        int Arr[];
        Arr = haha.locateLargest(A, n, m);
        System.out.print(Arr[0]+", "+Arr[1]+"]");
    }
}