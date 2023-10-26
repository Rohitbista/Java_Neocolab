import java.util.Scanner;
class Box{
    void volume(){
        Scanner sc = new Scanner(System.in);
        Double w, h, d;
        w = sc.nextDouble();
        h = sc.nextDouble();
        d = sc.nextDouble();
        if(w<=0||h<=0||d<=0){
            System.out.print("Invalid");
        }else{
            System.out.printf("%.2f",(w*h*d));
        }
    }
}

public class VolumeMain{
    public static void main(String[] args){
        Box obj1 = new Box();
        obj1.volume();
    }
}
