import java.util.Scanner;

interface rotate{
    abstract void leftRotate(int arr[], int d, int n);
    abstract void leftRotatebyOne(int arr[], int n);
    abstract void printArray(int arr[], int n);
}

public class RMain implements rotate{
    public void leftRotate(int arr[], int d, int n){
        if(d==1){
            new RMain().leftRotatebyOne(arr, n);
        }
    }
    
    public void leftRotatebyOne(int arr[], int n){
        int temp = 0;
        for(int i=1;i<n;i++){
            temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        new RMain().printArray(arr, n);
    }
    
    public void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        new RMain().leftRotate(A, 1, n);
    }
}
