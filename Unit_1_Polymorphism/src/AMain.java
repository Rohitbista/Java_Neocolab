class A{
    public void Main(){
        System.out.println("Hi");
    }
    public void Main(String a){
        System.out.println("Overloaded: "+a);
    }
    public void Main(String a, String b){
        System.out.println("Overloaded: "+a+" & "+b);
    }
}
public class AMain{
    public static void main(String[] args){
        A obj = new A();
        String b = "Hello World";
        String c = "Tom";
        String d = "Jerry";
        obj.Main();
        obj.Main(b);
        obj.Main(c, d);
    }
}
