import java.util.*;

public class ArrayListMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<String> namelist = new ArrayList<String>();
        for(int i=0;i<N;i++){
            namelist.add(sc.nextLine());
            System.out.println(namelist.get(i));
        }
    }
}
