class Dog{
    public void Animal(){
        System.out.println("Dog");
    }
}

class Cat extends Dog{
    public void Animal(){
        System.out.println("Cat");
    }
}

public class DCMain{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.Animal();
        Cat obj1 = new Cat();
        obj1.Animal();
    }
}
