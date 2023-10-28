import java.util.Scanner;
public class consecutive_four{
    public static boolean isConsecutiveFour(int[] values){
        int a = values.length;
        int count =1;
        for(int i=1;i<a;i++){
            if(values[i-1]==values[i]){
                count+=1;
                if(count==4){
                    return true;
                }
            }else{
                count = 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[];
        Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        if(isConsecutiveFour(Arr)){
            System.out.print("The list has consecutive four equal numbers.");
        }else{
            System.out.print("The list does not have consecutive four equal numbers.");
        }
    }
}
