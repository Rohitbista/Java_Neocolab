import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
public class ItemType{
    static void data(String na, double a){
        System.out.println(na);
        System.out.println(a);
    }
    static void interest(double k, long a){
        System.out.println(k);
        double pl = a*k;
        if(pl<0){
            pl*=-1;
        }
        System.out.println(pl);
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double am = sc.nextDouble();
        double it = sc.nextDouble();
        String bd = sc.next();
        String bs = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        Date first = sdf.parse(bd);
        Date second = sdf.parse(bs);
        long diff = first.getTime()-second.getTime();
        TimeUnit time = TimeUnit.DAYS;
        long diffs = time.convert(diff, TimeUnit.MILLISECONDS);
        data(name, am);
        interest(it, diffs);
    }
}