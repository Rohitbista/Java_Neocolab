import java.util.*;

class Hall{
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;
    Hall(String name, String contactNumber, double costPerDay, String ownerName){
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public String toString(){
        System.out.println(name+" "+contactNumber+" "+costPerDay+" "+ownerName);
        return "";
        //return this.name+":"+this.contactNumber+":"+this.costPerDay+":"+this.ownerName;
    }
    static class CostPerDayComparator implements Comparator<Hall>{
        public int compare(Hall h1, Hall h2){
            if(h1.costPerDay==h2.costPerDay){
                return 0;
            }else if(h1.costPerDay>h2.costPerDay){
                return 1;
            }else{
                return -1;
            }
        }
    }
}

public class HMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Hall> list = new ArrayList<Hall>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String contactNumber = sc.nextLine();
            double costPerDay = sc.nextDouble();
            sc.nextLine();
            String ownerName = sc.nextLine();
            list.add(new Hall(name, contactNumber, costPerDay, ownerName));
        }
        Collections.sort(list, new Hall.CostPerDayComparator());
        for(Hall t:list){
            /*StringTokenizer st = new StringTokenizer(t.toString(),":");
            String[] Arr = new String[4];
            int i=0;
            while(st.hasMoreTokens()){
                Arr[i] = st.nextToken();
                i++;
            }
            System.out.printf("%-15s%-15s%-15s%-15s\n",Arr[0], Arr[1], Arr[2], Arr[3]);*/
            t.toString();
        }
        /*Iterator it = list.iterator();
        while(it.hasNext()){
            Hall obj = (Hall)it.next();
            System.out.printf("%-15s%-15s%-15s%-15s",obj);
        }*/
    }
}
