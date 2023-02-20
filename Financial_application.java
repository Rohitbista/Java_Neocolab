import java.util.*;
public class Financial_application {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float g = (b/100)*a;
        float t = a + g;
        System.out.print("The gratuity is $"+g+" and total is $"+t);
    }
}
