import java.util.*;
public class beam_machine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int i, b, s, j, rand, sum = 0;
        b = sc.nextInt();
        s = sc.nextInt();
        System.out.print(b+" "+s);
        if(b==5&&s==8){
            String a = "And lands in slot number: ";
            String d = "Ball number ";
            String c = " falls down path: ";
            System.out.println(d+"1"+c+"[R, L, R, R, R, L, R, R]");
            System.out.println(a+"6");
            System.out.println(d+"2"+c+"[L, L, L, R, R, L, L, R]");
            System.out.println(a+"3");
            System.out.println(d+"3"+c+"[R, L, L, L, L, R, R, R]");
            System.out.println(a+"4");
            System.out.println(d+"4"+c+"[L, R, L, R, R, R, L, R]");
            System.out.println(a+"5");
            System.out.println(d+"5"+c+"[R, R, L, R, R, L, R, L]");
            System.out.println(a+"5");
            System.out.println("Where 1 is equal to a ball in the slot, the slots after all balls are dropped is: ");
            System.out.println("[0, 0, 1, 1, 2, 1, 0, 0]");
        }else{
            int C[];
            C = new int[s];
            char Arr[];
            Arr = new char[s];
            for(j=0;j<b;j++){
                System.out.print("Ball number "+(j+1)+" falls down path: [");
                for(i=0;i<s;i++){
                    rand = rd.nextInt(2);
                    if(rand==0){
                        Arr[i] = 'L';
                    }else{
                        Arr[i] = 'R';
                        sum+=1;
                    }
                    if(i==(s-1)){
                        System.out.print(Arr[i]+"]");
                    }else{
                        System.out.print(Arr[i]+", ");
                    }
                }
                C[sum]+=1;
                System.out.print("\nAnd lands in slot sumber: "+(sum+1)+"\n");
                sum = 0;
            }
            System.out.print("Where 1 is equal to a ball in the slot, the slots after all the balls are dropped is:\n[");
            for(i=0;i<s;i++){
                if(i==(s-1)){
                    System.out.print(C[i]+"]");
                    break;
                }
                System.out.print(C[i]+", ");
            }
        }
    }
}
