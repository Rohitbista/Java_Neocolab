import java.io.*;
public class Vowel_or_Consonant{
    void alph(char al){
        char b = al;
        al = Character.toUpperCase(al);
        if(al=='A'||al=='E'||al=='I'||al=='O'||al=='U'){
            System.out.print(b+" :vowel");
        }else{
            System.out.print(b+" :consonant");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char al = (char)br.read();
        Vowel_or_Consonant obj1 = new Vowel_or_Consonant();
        obj1.alph(al);
    }
}