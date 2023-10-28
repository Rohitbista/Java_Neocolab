import java.util.Scanner;
public class sum_of_diagonal{
    public static double sumMajorDiagonal(double[][] m){
        double sum =0 ;
        int i, j;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(i==j){
                    sum+=m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        double a[][];
        a = new double[4][4];
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(a);
        System.out.print("The sum of the elements in the major diagonal is: "+sum);
    }
}