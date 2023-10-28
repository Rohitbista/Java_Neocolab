import java.util.Scanner;
public class check_last_part_of_strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer s1 = new StringBuffer("");
        StringBuffer s2 = new StringBuffer("");
        StringBuffer e = new StringBuffer("");
        s1.append(sc.nextLine());
        s2.append(sc.nextLine());
        e.append(sc.nextLine());
        int a, b, c, i, d=0;
        char temp1, temp2;
        boolean l = true;
        a = s1.length();
        b = s2.length();
        c = e.length();
        for(i=(a-c);i<a;i++){
            temp1 = s1.charAt(i);
            temp2 = e.charAt(d);
            if(Character.compare(temp1, temp2)!=0){
                l = false;
            }
            d+=1;
        }
        System.out.println("\""+s1+"\" ends with \""+e+"\"? "+l);
        l = true;
        d = 0;
        for(i=(b-c);i<b;i++){
            temp1 = s2.charAt(i);
            temp2 = e.charAt(d);
            if(Character.compare(temp1, temp2)!=0){
                l = false;
            }
            d+=1;
        }
        System.out.println("\""+s2+"\" ends with \""+e+"\"? "+l);
    }
}
