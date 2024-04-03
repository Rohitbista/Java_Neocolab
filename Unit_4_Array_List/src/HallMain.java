import java.util.*;

class Hall{
    String name;
    String contactNumber;
    double costPerDay;
    String ownerName;
    Hall(String a, String b, double c, String d){
        name = a;
        contactNumber = b;
        costPerDay = c;
        ownerName = d;
    }
    
    void display(){
        System.out.printf("%-20s%-20s%-20s%-20s\n",name, contactNumber, costPerDay, ownerName);
    }
}

class HallMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //HallList<Integer> list = new HallList<Integer>();
        ArrayList<Hall> list = new ArrayList<Hall>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            String d = sc.nextLine();
            list.add(new Hall(a, b, c, d));
            //list.add(new Hall(a, b, c, d));
        }
        int in = sc.nextInt();
        if(list.isEmpty()==true){
            System.out.println("The list is empty");
        }else{
            list.remove(in);
            System.out.printf("%-20s%-20s%-20s%-20s\n","Name", "Contact Number", "CostperDay", "Owner Name");
            Iterator itr = list.iterator();
            while(itr.hasNext()){
                Hall obj = (Hall)itr.next();
                obj.display();
            }
        }
        
    }
}
