import java.util.Scanner;
public class Short_name{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("");
        sb.append(sc.nextLine());
        int a = sb.length();
        int i = 0;
        int b = 1;
        int z = 1;
        char space = ' ';
        char temp;
        while(i<a){
            temp = sb.charAt(i);
            if(Character.compare(temp, space)==0){
                //System.out.println(z+" "+i);
                //b = i+1;
                sb.replace(z, i, ".");
                //System.out.println(sb);
                z+=3;
                a=sb.length();
                i=z;
            }else{
                i+=1;
            }
        }
        System.out.println(sb);
    }
}
