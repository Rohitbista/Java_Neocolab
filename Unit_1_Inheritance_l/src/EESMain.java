import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

class Event{
    String name, detail, type, ownerName;
    double costPerDay;
    Event(String n, String d, String t, String on, double cpd){
        name = n;
        detail = d;
        type = t;
        ownerName = on;
        costPerDay = cpd;
    }
}

class Exhibition extends Event{
    int noOfStalls;
    Exhibition(String nn, String dd, String tt, String oonn, double cpd, int nos){
        super(nn, dd, tt, oonn, cpd);
        noOfStalls = nos;
    }
    
    public void GST(String sd, String ed){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        String str1 = sd.replace('/', ' ');
        String str2 = ed.replace('/', ' ');
        
        try{
            LocalDate date1 = LocalDate.parse(str1, dtf);
            LocalDate date2 = LocalDate.parse(str2, dtf);
            long days = ChronoUnit.DAYS.between(date1, date2);
            System.out.println(days*super.costPerDay*(5.0/100.0));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class StageEvent extends Event{
    int noOfSeats;
    StageEvent(String nn, String dd, String tt, String oonn, double cpd, int ns){
        super(nn, dd, tt, oonn, cpd);
        noOfSeats = ns;
    }
    
    public void GST(String sd, String ed){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        String str1 = sd.replace('/', ' ');
        String str2 = ed.replace('/', ' ');
        
        try{
            LocalDate date1 = LocalDate.parse(str1, dtf);
            LocalDate date2 = LocalDate.parse(str2, dtf);
            long days = ChronoUnit.DAYS.between(date1, date2);
            System.out.println(days*super.costPerDay*(15.0/100.0));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class EESMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String n, d, t, on;
        n = sc.nextLine();
        d = sc.nextLine();
        t = sc.nextLine();
        on = sc.nextLine();
        double cpd = sc.nextDouble();
        sc.nextLine();
        int nos = Integer.parseInt(sc.nextLine());
        String st_date = sc.nextLine();
        String end_date = sc.nextLine();
        if(a==1){
            Exhibition obj = new Exhibition(n, d, t, on, cpd, nos);
            obj.GST(st_date, end_date);
        }else{
            StageEvent obj = new StageEvent(n, d, t, on, cpd, nos);
            obj.GST(st_date, end_date);
        }
    }
}