import java.util.*;

public class AMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            list.add(sc.nextLine());
        }
        String s = sc.nextLine();
        int count = 0;
        Iterator it = list.iterator();
        while(it.hasNext()){
            if(s.equals((String)it.next())){
                count+=1;
            }
        }
        System.out.print(count);
    }
}
