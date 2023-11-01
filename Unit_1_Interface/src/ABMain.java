import java.util.Scanner;

interface A{
    int x = 10;
    void display(String a);
}

class B implements A{
    public void display(String a){
        System.out.println(a);
        System.out.println(x);
    }
}

public class ABMain{
    public static void main(String[] args){
        String b = new Scanner(System.in).nextLine();
        new B().display(b);
    }
}
