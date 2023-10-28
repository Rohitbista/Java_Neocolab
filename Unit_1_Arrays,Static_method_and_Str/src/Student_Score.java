import java.util.Scanner;
public class Student_Score{
    static int findBestGrade(int[] grades){
        int l = grades.length;
        int best = grades[0];
        for(int i=1;i<l;i++){
            if(best<grades[i]){
                best = grades[i];
            }
        }
        return best;
    }
    
    static void printLetterGrades(int[] grades, int bestGrade){
        int l = grades.length;
        for(int i=0;i<l;i++){
            if(grades[i]>=(bestGrade-10)){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is A");
            }else if(grades[i]>=(bestGrade-20)){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is B");
            }else if(grades[i]>=(bestGrade-30)){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is C");
            }else if(grades[i]>=(bestGrade-40)){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is D");
            }else{
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is F");
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[];
        Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        int best;
        best = findBestGrade(Arr);
        printLetterGrades(Arr, best);
    }
}
