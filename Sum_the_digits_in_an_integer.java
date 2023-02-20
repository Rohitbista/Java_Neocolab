import java.util.*;
public class Sum_the_digits_in_an_integer {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 0 and 1000:");
        int a = sc.nextInt();
        int s = 0;
        while(a!=0){
            s = s + (a%10);
            a = a / 10;
        }
        System.out.print("The sum of the digits is "+s);
    }
}
