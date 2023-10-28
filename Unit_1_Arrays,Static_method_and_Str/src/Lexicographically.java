import java.util.Scanner;
public class Lexicographically{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);
        int a = s1.compareTo(s2);
        if(s1.equals(s2)){
            System.out.println("\""+s1+"\" is equal to \""+s2+"\"");
        }else if(a>0){
            System.out.println("\""+s1+"\" is greater than \""+s2+"\"");
        }else{
            System.out.println("\""+s1+"\" is less than \""+s2+"\"");
        }
    }
}
