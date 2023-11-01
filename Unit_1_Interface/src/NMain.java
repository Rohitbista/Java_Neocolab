import java.util.Scanner;

interface Myinter{
    void upperbehind(String a);
}

public class NMain implements Myinter{
    public void upperbehind(String a){
        int n = a.length();
        String s1 = "",s2 = "";
        for(int i=0;i<n;i++){
            char ch = a.charAt(i);
            if(ch!=Character.toUpperCase(ch)){
                s1 = s1 + String.valueOf(ch);
            }else{
                s2 = s2 + String.valueOf(ch);
            }
        }
        System.out.println(s1+s2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        new NMain().upperbehind(s);
    }
}
