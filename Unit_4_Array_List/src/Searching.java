import java.util.*;

public class Searching{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String temp = sc.nextLine();
            list.add(temp);
        }
        String s = sc.nextLine();
        boolean c =false;
        c = list.contains(s);
        int ind = list.indexOf(s);
        if(c==true){
            System.out.println(ind);
        }else{
            System.out.println(s+" hall is not found");
        }
    }
}