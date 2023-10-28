import java.util.Scanner;
public class Count_occurrence_of_numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Arr[];
        Arr = new int[20];
        int i =0;
        int n = sc.nextInt();
        while(n!=0){
            Arr[i] = n;
            n = sc.nextInt();
            i+=1;
        }
        int j, k, temp = 0, count = 1;
        boolean check = true;
        for(j=0;j<i;j++){
            for(k=0;k<i;k++){
                if(Arr[j]<Arr[k]){
                    temp = Arr[k];
                    Arr[k] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        for(j=0;j<i;j++){
            for(k=0;k<j;k++){
                if(Arr[j]==Arr[k]){
                    check = false;
                }
            }
            if(check){
                for(k=j+1;k<i;k++){
                    if(Arr[j]==Arr[k]){
                        count+=1;
                    }
                }
                if(count==1){
                    System.out.println(Arr[j]+" occurs 1 time");
                }else{
                    System.out.println(Arr[j]+" occurs "+count+" times");
                }
                count = 1;
            }
            check = true;
        }
    }
}
