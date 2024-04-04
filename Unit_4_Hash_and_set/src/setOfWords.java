import java.util.*;

public class setOfWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        HashSet<String> ha = new HashSet<String>();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        int j = 0, i, t = 0;
        String temp = "";
        String temp1 = "";
        for(i=0;i<n1;i++){
            if(s1.charAt(i)!=' '){
                temp+=s1.charAt(i);
            }else{
                hs.add(temp);
                temp = "";
            }
        }
        hs.add(temp);
        for(j=0;j<n2;j++){
            if(s2.charAt(j)!=' '){
                temp1+=s2.charAt(j);
            }else{
                if(hs.contains(temp1)){
                    ha.add(temp1);
                }
                temp1="";
            }
        }
        if(hs.contains(temp1)){
            ha.add(temp1);
        }
        System.out.println(ha);
    }
}
