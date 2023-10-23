import java.util.*;
public class Time_travel{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N, V1, V2;
        N = input.nextInt();
        V1 = input.nextInt();
        V2 = input.nextInt();
        double S, E;
        E = N * V2;
        S = Math.sqrt(2) * N * V1;
        if(E > S){
            System.out.print("Elevator");
        }else{
            System.out.print("Stairs");
        }
    }
}