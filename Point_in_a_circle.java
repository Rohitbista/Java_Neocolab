import java.util.*;
public class Point_in_a_circle {
    public static void main(String[] args) throws Exception{
        float x, y;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with 2 coordinates: ");
        x = sc.nextFloat();
        y = sc.nextFloat();
        d = Math.sqrt((y*y)+(x*x));
        if(d>10){
            System.out.println("Point ("+x+", "+y+") is not in the circle");
        }else{
            System.out.println("Point ("+x+", "+y+") is in the circle");
        }
    }
}