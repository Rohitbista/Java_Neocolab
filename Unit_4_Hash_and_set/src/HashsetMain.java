import java.util.*;

public class HashsetMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String temp = sc.nextLine();
            hs.add(temp);
        }
        String search = sc.nextLine();
        boolean found = false;
        Iterator it = hs.iterator();
        while(it.hasNext()){
            if(search.equals((String)it.next())){
                found = true;
                break;
            }
        }
        if(found==true){
            System.out.println(search+" is in the hash set.");
        }else{
            System.out.println(search+" is not in the hash set.");
        }
    }
}