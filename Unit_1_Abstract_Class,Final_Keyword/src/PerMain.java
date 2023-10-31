import java.util.Scanner;

abstract class math{
    abstract void rectanglePerimeter();
    abstract void squarePerimeter();
    abstract void trianglePerimeter();
    abstract void trapezoidPerimeter();
    abstract void circlePerimeter();
}

class perimeter extends math{
    int[] P = new int[5];
    int[] V = new int[11];
    //P = new int[5];
    //V = new int[11];
    perimeter(Integer[] A){
        for(int i=0;i<11;i++){
            V[i] = A[i];
        }
    }
    
    void rectanglePerimeter(){
        P[0] = (2*V[0] + 2*V[1]);
        System.out.println(P[0]);
    }
    
    void squarePerimeter(){
        P[1] = 4 * V[2];
        System.out.println(P[1]);
    }
    
    void trianglePerimeter(){
        P[2] = (V[3]+V[4]+V[5]);
        System.out.println(P[2]);
    }
    
    void trapezoidPerimeter(){
        P[3] = (V[6]+V[7]+V[8]+V[9]);
        System.out.println(P[3]);
    }
    
    void circlePerimeter(){
        P[4] = (2*(22/7)*V[10]);
        System.out.println(P[4]);
    }
    
    void calculateSum(){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum+=P[i];
        }
        System.out.println(sum);
    }
    void sortPerimeter(){
        int i, j, temp;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                if(P[i]<P[j]){
                    temp = P[j];
                    P[j] = P[i];
                    P[i] = temp;
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.print(P[i]+" ");
        }
    }
}

public class PerMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] B = new Integer[11];
        for(int i=0;i<11;i++){
            B[i] = sc.nextInt();
        }
        perimeter obj = new perimeter(B);
        obj.rectanglePerimeter();
        obj.squarePerimeter();
        obj.trianglePerimeter();
        obj.trapezoidPerimeter();
        obj.circlePerimeter();
        obj.calculateSum();
        obj.sortPerimeter();
    }
}
