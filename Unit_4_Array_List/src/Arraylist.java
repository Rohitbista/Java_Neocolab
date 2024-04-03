import java.util.*;

public class Arraylist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> obj = new ArrayList<Integer>();
        int temp1, temp2;
        temp1 = sc.nextInt();
        obj.add(temp1);
        for(int i=1;i<N;i++){
            temp2 = sc.nextInt();
            if(temp2>temp1){
                obj.add(temp2);
                temp1 = temp2;
            }
        }
        System.out.println(obj);
    }
}