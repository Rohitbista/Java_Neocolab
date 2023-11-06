import java.util.Scanner;
class Person{
    /*protected String last;
    protected String first;
    protected int ID;*/
}

class Student extends Person{
    int[] Arr;
    Student(String firstName, String lastName, int id, int[] A){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("ID: "+id);
        int l = A.length;
        Arr = new int[l];
        for(int i=0;i<l;i++){
            Arr[i] = A[i];
        }
    }
    public char calculate(){
        float sum = 0, avg = 0;
        int i, l = Arr.length;
        for(i=0;i<l;i++){
            sum+=Arr[i];
        }
        avg = sum / l;
        if(avg>=90 && avg<=100){
            return 'O';
        }else if(avg>=80){
            return 'E';
        }else if(avg>=70){
            return 'A';
        }else if(avg>=55){
            return 'P';
        }else if(avg>=40){
            return 'D';
        }else{
            return 'T';
        }
    }
}

public class PSMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first, last;
        int ID, limit, i;
        first = sc.nextLine();
        last = sc.nextLine();
        ID = sc.nextInt();
        limit = sc.nextInt();
        int[] A;
        A = new int[limit];
        for(i=0;i<limit;i++){
            A[i] = sc.nextInt();
        }
        Student obj = new Student(last, first, ID, A);
        System.out.print("Grade: "+obj.calculate());
    }
}
