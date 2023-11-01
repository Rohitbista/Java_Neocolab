import java.util.Scanner;

interface Growing{
    void isGrowing();
}

class GrowingNumber implements Growing{
    int n;
    GrowingNumber(int a){
        n = a;
    }
    public void isGrowing(){
        int t = n, i, d1, d2, count1 = 1, count2 = 1;
        d1 = t % 10;
        t = t / 10;
        while(t>0){
            d2 = t % 10;
            ++count1;
            if(d2<d1){
                ++count2;
            }
            d1 = d2;
            t/=10;
        }
        if(count1==count2 && n>9){
            System.out.println("Growing number");
        }else{
            System.out.println("Not growing number");
        }
    }
}

class GrowingString implements Growing{
    String a;
    GrowingString(String b){
        a = b;
    }
    public void isGrowing(){
        int n = a.length();
        char[] A = new char[n];
        for(int i=0;i<n;i++){
            char ch = a.charAt(i);
            A[i] = ch;
        }
        
        int count = 1;
        for(int i=1;i<n;i++){
            int compare = Character.compare(A[i-1], A[i]);
            if(compare<0){
                count++;
            }
        }
        if(count==n){
            System.out.println("Growing string");
        }else{
            System.out.println("Not growing string");
        }
    }
}

public class GGMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        new GrowingNumber(a).isGrowing();
        new GrowingString(b).isGrowing();
    }
}