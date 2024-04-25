import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	int rollno, rank;
	String name, address;

	public Student(int rollno, String name, String address, int rank)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.rank = rank;
	}

	public String toString()
	{
		return this.rollno + " " + this.name + " " + this.address + " " + this.rank;
	}
}

class Sortbyname implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.name.equals(s2.name)){
            return 0;
        }else if((s1.name.compareTo(s2.name))>0){
            return 1;
        }else{
            return -1;
        }
    }
}

class Sortbyroll implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.rollno==s2.rollno){
            return 0;
        }else if(s1.rollno>s2.rollno){
            return 1;
        }else{
            return -1;
        }
    }
}

class SortbyRank implements Comparator<Student>{
    boolean ch;
    SortbyRank(boolean ch){
        this.ch = ch;
    }
    public int compare(Student s1, Student s2){
        if(s1.rank==s2.rank){
            return 0;
        }else if(ch==true){
            if(s1.rank>s2.rank){
                return 1;
            }else{
                return -1;
            }
        }else{
            if(s1.rank>s2.rank){
                return -1;
            }else{
                return 1;
            }
        }
    }
}

public class CMain
{
	public static void main (String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		
		Scanner s = new Scanner(System.in);
		
// 	String Welcome = "Student Interactive Console : \n1). Add User\n2). Sort Student List by Roll no\n3). Sort Student List by Name"
// 		                + "\n4). sort Students by Rank\n5). Exit from System\n";
		int choice = 0;
		
		    System.out.println("Welcome");
		do {
		    
		   // System.out.println("Enter your choice : ");
		    choice = s.nextInt();
		    
		    
		    switch(choice) {
		        case 1 : 
		            s.nextLine();
		        //    System.out.println("Enter the rollno, name, address and rank (separated by comma) ");
		            String[] temp = s.nextLine().split(",");
		            Student stu = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]));
		            ar.add(stu);
		            break;
		        case 2 : 
		            s.nextLine();
		            Collections.sort(ar, new Sortbyroll());
		            System.out.println("\nStudents List sorted by RollNo");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i));
		            break;
		        case 3:
		            s.nextLine();
		            Collections.sort(ar, new Sortbyname());
		            System.out.println("\nStudents List sorted by Name");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i));
		            break;
		        case 4:
		            s.nextLine();
		            System.out.println("\nSort by ascending or descending ( asc / des)");
		            boolean asc = s.nextLine().equalsIgnoreCase("asc") ? true : false;
		            
		            Collections.sort(ar, new SortbyRank(asc));
		            System.out.println("\nStudents List sorted by Rank");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i));
		            break;
		        case 5 : 
		            System.out.println("\nExiting ....");
		            System.exit(0);
		        default :
		            s.nextLine();
		            System.out.println("\nInvalid Input Try again !!!\n");
		            
		    }
		    
		} while (choice != 5 );
		
	}
}