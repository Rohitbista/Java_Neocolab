import java.util.*;
public class half_diamond{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int i, j;
        for(i=1;i<N+1;i++){
            for(j=1;j<N+1;j++){
                if((j!=1)&&(i>=j)){
                    System.out.print("*"+i);
                }else if(i>=j){
                    System.out.print(i);
                }
            }
            System.out.print("\n");
        }
        for(i=N;i>0;i--){
            for(j=N;j>0;j--){
                if((i>j)&&(i>=j)){
                    System.out.print("*"+i);
                }else if(i>=j){
                    System.out.print(i);
                }
            }
            System.out.print("\n");
        }
    }
}
