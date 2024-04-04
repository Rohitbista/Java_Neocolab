import java.util.*;

public class count_tehe_words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        String s = sc.nextLine();
        String s1 = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                s1 = s1 + s.charAt(i);
            }else{
                hs.add(s1);
                s1="";
            }
        }
        hs.add(s1);
        System.out.println(hs.size());
    }
}
