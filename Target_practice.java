import java.util.*;
public class Target_practice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0, ta = 0;
        while(n>a){
            a+=input.nextInt();
            ta+=1;
        }
        System.out.print("The number of turns is "+ta);
    }
}
