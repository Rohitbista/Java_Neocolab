import java.util.Scanner;
class Number_Conversion{
    void Decimal_to_Anything(char to, int n){
        if(to=='B'){
            System.out.print(Integer.toBinaryString(n));
        }else if(to=='O'){
            System.out.print(Integer.toOctalString(n));
        }else{
            System.out.print(Integer.toHexString(n));
        }
    }
    
    void Anything_to_Decimal(char from, String n){
        if(from=='B'){
            System.out.print(Integer.parseInt(n, 2));
        }else if(from=='O'){
            System.out.print(Integer.parseInt(n, 8));
        }else if(from=='H'){
            System.out.print(Integer.parseInt(n, 16));
        }
    }
    
    int Anything(char from, String n){
        int Dec = 0;
        if(from=='B'){
            Dec = Integer.parseInt(n, 2);
        }else if(from=='O'){
            Dec = Integer.parseInt(n, 8);
        }else if(from=='H'){
            Dec = Integer.parseInt(n, 16);
        }
        return Dec;
    }
}

public class Number_Conversion_Main{
    public static void main(String[] args){
        Number_Conversion obj1 = new Number_Conversion();
        Scanner sc = new Scanner(System.in);
        char from = sc.next().charAt(0);
        char to = sc.next().charAt(0);
        if(from=='D'){
            int n = sc.nextInt();
            obj1.Decimal_to_Anything(to, n);
        }else{
            String s = sc.next();
            if(to=='D'){
                obj1.Anything_to_Decimal(from, s);
            }else{
                int Dec = obj1.Anything(from,s);
                obj1.Decimal_to_Anything(to, Dec);
            }
        }
    }
}