import java.util.Scanner;
class Shape{
    Double area;
    public void computeArea(){
        area = 0.0;
    }
}

class Circle extends Shape{
    Double radius;
    Circle(Double a){
        radius = a;
    }
    public void computeArea(){
        super.area = (3.14)*radius*radius;
        System.out.printf("%.2f",super.area);
    }
}

class Rectangle extends Shape{
    Double length, breadth;
    Rectangle(Double a, Double b){
        length = a;
        breadth = b;
    }
    public void computeArea(){
        super.area = length * breadth;
        System.out.printf("%.2f",super.area);
    }
}

class Triangle extends Shape{
    Double base, height;
    Triangle(Double a, Double b){
        base = a;
        height = b;
    }
    public void computeArea(){
        super.area = (0.5) * base * height;
        System.out.printf("%.2f",super.area);
    }
}

public class SCRTMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice<1||choice>3){
            System.out.print("Invalid Input");
        }else{
            Double a = sc.nextDouble();
            if(choice==1){
                Circle obj = new Circle(a);
                obj.computeArea();
            }else if(choice==2){
                Double b = sc.nextDouble();
                Rectangle obj = new Rectangle(a, b);
                obj.computeArea();
            }else{
                Double b = sc.nextDouble();
                Triangle obj = new Triangle(a, b);
                obj.computeArea();
            }
        }
    }
}
