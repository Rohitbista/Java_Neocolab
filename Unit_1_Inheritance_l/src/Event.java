import java.util.Scanner;
public class Event{
    public Double projectedRevenue(){
        return 0.0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name, detail, ownerName;
        name = sc.nextLine();
        detail = sc.nextLine();
        ownerName = sc.nextLine();
        int choice = sc.nextInt();
        if(choice==1){
            Exhibition obj = new Exhibition();
            obj.noOfStall = sc.nextInt();
            System.out.print(obj.projectedRevenue());
        }else{
            StageEvent obj = new StageEvent();
            obj.noOfShows = sc.nextInt();
            obj.noOfSeatsPerShow = sc.nextInt();
            System.out.print(obj.projectedRevenue());
        }
    }
}

class Exhibition extends Event{
    int noOfStall;
    public Double projectedRevenue(){
        Double h = (double)noOfStall * 10000;
        return h;
    }
}

class StageEvent extends Event{
    int noOfShows, noOfSeatsPerShow;
    public Double projectedRevenue(){
        Double h = (double)noOfShows * (double)noOfSeatsPerShow * 50;
        return h;
    }
}
