import java.util.Scanner;

interface NyInter{
    void diagonalsMinMax(int a[][]);
}

class MinMax implements NyInter{
    public void diagonalsMinMax(int a[][]){
        int n = a.length;
        if(n==0){
            return;
        }
        int i, j, min1 = a[0][0], min2 = a[n-1][0], max1 = a[0][0], max2 = a[n-1][0];
        //System.out.println(min1+" "+max1+" "+min2+" "+max2+" "+n);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i+j)==(n-1)){
                    //System.out.print(a[i][j]+" ");
                    if(min2>a[i][j]){
                        min2=a[i][j];
                    }
                    if(max2<a[i][j]){
                        max2=a[i][j];
                    }
                }
                if(i==j){
                    //System.out.print(a[i][j]);
                    if(min1>a[i][j]){
                        min1 = a[i][j];
                    }
                    if(max1<a[i][j]){
                        max1 = a[i][j];
                    }
                }
            }
        }
        System.out.println("Smallest Element - 1: "+min1);
        System.out.println("Greatest Element - 1: "+max1);
        System.out.println("Smallest Element - 2: "+min2);
        System.out.println("Greatest Element - 2: "+max2);
    }
}

public class NMMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[][] = new int[N][N];
        int i, j;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                A[i][j] = sc.nextInt();
            }
        }
        MinMax obj = new MinMax();
        obj.diagonalsMinMax(A);
    }
}
