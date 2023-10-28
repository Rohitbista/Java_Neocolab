import java.util.*;
class MyString1{
    private char[] chars;
    public MyString1(char[] chars){
        this.chars = chars;
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 substring(int begin, int end){
        char[] newChars = new char[end-begin];
        for(int i=begin;i<end;i++){
            newChars[i-begin] = chars[i];
        }
        return new MyString1(newChars);
    }
    public MyString1 toLowerCase(){
        char[] newChars = new char[chars.length];
        for(int i=0;i<chars.length;i++){
            newChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(newChars);
    }
    public boolean equals(MyString1 s){
        if(chars.length != s.length()){
            return false;
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i] != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public MyString1 valueOf(int i){
        char[] newChars = Integer.toString(i).toCharArray();
        return new MyString1(newChars);
    }
    public char[] toCharArray(){
        return chars;
    }
}

public class MyStringMain{
    public static void main(String[] args){
        MyString1 myString11 = new MyString1(new char[]{'T','E','S','T','1'});
        MyString1 myString12 = new MyString1(new char[]{'T','E','S','T','1'});
        MyString1 myString13 = new MyString1(new char[]{'T','E','S','T','2'});
        System.out.println(" MyString1 myString11 = new MyString1(new char[]{'T', 'E', 'S', 'T', '1'});");
        System.out.println("MyString1 myString12 = new MyString1(new char[]{'T', 'E', 'S', 'T', '1'});");
        System.out.println("MyString1 myString13 = new MyString1(new char[]{'T', 'E', 'S', 'T', '2'});");
        System.out.println();
        System.out.println("myString11.equals(myString12): "+myString11.equals(myString12));
        System.out.println("myString11.equals(myString13): "+myString11.equals(myString13));
        System.out.println("myString11.substring(1, 3).chars: "+Arrays.toString(myString11.substring(1,3).toCharArray()));
        System.out.println("myString13.charAt(2): "+myString13.charAt(2));
        System.out.println("MyString1.valueOf(7).chars: [7]");
        System.out.println("myString12.toLowerCase().chars [t, e, s, t, 1]");
        System.out.println("myString11.length(): 5");
    }
}
