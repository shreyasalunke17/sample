package CombineSuperThis;
class Billion{
public Billion(){
    this("Money",35);
    System.out.println("line 5,Billion-Default constructor");
}
public Billion(String a, int b){
    System.out.println("line 8,Billion-Two parameterized constructor");
}
}
class Trillion extends Billion{
    public Trillion() {
        this("Welcome");
        System.out.println("line 14,Trillion-Default constructor");
    }
    public Trillion(String a ){
        System.out.println("line 17,Trillion-one parameter constructor");
    }
    public Trillion(String a ,int b){
        this();
        System.out.println("line 21,Trillion-two parameterized constructor");
    }
}
public class CombineSuperThis2 {
    public static void main(String[] args)
    {
        Trillion obj =new Trillion("Hello",10); //8,5,17,14,21
    }
}
