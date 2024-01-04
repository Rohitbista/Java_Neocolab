import java.util.Scanner;

class IllegalArgumentException extends Exception{
    public IllegalArgumentException(String str){
        super(str);
    }
}

class NoSuchElementException extends Exception{
    public NoSuchElementException(String str){
        super(str);
    }
}

class Validations{
    void validation1(String a, String b) throws IllegalArgumentException{
        int la = a.length();
        int lb = b.length();
        if(la!=9){
            throw new IllegalArgumentException("java.lang.IllegalArgumentException: Register Number does not contain exactly 9 characters");
        }
        if(lb!=10){
            throw new IllegalArgumentException("java.lang.IllegalArgumentException: Mobile Number does not contain exactly 10 characters");
        }
    }
    
    void validation2(String a, String b) throws NoSuchElementException{
        int la = a.length();
        int lb = b.length();
        for(int i=0;i<la;i++){
            char temp = a.charAt(i);
            if(i>1 && i<5){
                if( (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')){
                    
                }else{
                    throw new NoSuchElementException("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
                }
            }else{
                if(!Character.isDigit(temp)){
                    throw new NoSuchElementException("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
                }
            }
        }
        for(int i=0;i<lb;i++){
            char temp = b.charAt(i);
            if(!Character.isDigit(temp)){
                    throw new NoSuchElementException("java.lang.NumberFormatException: Mobile Number cannot contain any character other than a digit");
            }
        }
    }
}

public class RMMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Validations obj = new Validations();
        String reg, mob;
        reg = sc.nextLine();
        mob = sc.nextLine();
        try{
            obj.validation1(reg, mob);
            obj.validation2(reg, mob);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}