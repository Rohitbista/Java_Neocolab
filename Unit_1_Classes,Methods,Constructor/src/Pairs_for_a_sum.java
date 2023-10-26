import java.util.Scanner;
public class Pairs_for_a_sum{
    Scanner sc = new Scanner(System.in);
    int n, sum;
    int Arr[];
    
    void Reading_input(){
        n = sc.nextInt();
        Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        sum = sc.nextInt();
    }
    
    void find_pairs(){
        int i, j;
        boolean check = true;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((Arr[i]+Arr[j])==sum){
                    check = false;
                    System.out.println(Arr[i]+" "+Arr[j]);
                }
            }
        }
        if(check==true){
            System.out.print("There is no pairs for the given sum.");
        }
    }
    
    public static void main(String[] args){
        Pairs_for_a_sum obj1 = new Pairs_for_a_sum();
        obj1.Reading_input();
        obj1.find_pairs();
    }
}