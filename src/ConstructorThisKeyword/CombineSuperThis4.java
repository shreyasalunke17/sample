package ConstructorThisKeyword;
class Car{
public Car(){
    this("White",35);
    System.out.println("line 5,Default constructor");
}
public Car(String a, int b){
    System.out.println("line 8,Two parameterized constructor");
}
}
class Creta extends Car{
    public Creta() {
        //this("car Creta",5);
        System.out.println("line 14,Default constructor");
    }
    public Creta(String a){
        this();
        System.out.println("line 18,one parameter constructor");
    }
    public Creta(String a ,int b){
        this("Welcome");
        System.out.println("line 21,two parameterized constructor");
    }
}
public class CombineSuperThis4 {
    public static void main(String[] args)
    {
        Creta obj =new Creta("Car"); //8,5,14,18
    }
}
