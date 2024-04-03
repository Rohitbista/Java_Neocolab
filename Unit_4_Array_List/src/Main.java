import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            list.add(sc.nextLine());
        }
        System.out.println(list);
    }
}
