import java.util.Scanner;
public class Get_the_character{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        char ch1, ch2;
        ch1 = s.charAt(a);
        ch2 = s.charAt(b);
        System.out.println("Original String = "+s);
        System.out.println("The character at index "+a+" is "+ch1);
        System.out.println("The character at index "+b+" is "+ch2);
    }
}
