import java.util.Scanner;
public class student{
    student(String name, String dept, String college){
        System.out.print("Name:"+name+"\nDept:"+dept+"\nCollege:"+college);
    }
    
    student(String name, String dept){
        System.out.print("Name:"+name+"\nDept:"+dept+"\nCollege:null");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();
        if(choice==2){
            new student(a, b);
        }else if(choice==3){
            String c = sc.nextLine();
            new student(a, b, c);
        }
    }
}