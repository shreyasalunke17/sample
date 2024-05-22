package Constructor;
class Displayconstructor
{
    int a = 5; //initialize expression
    int b = 17; //initialize expression
    int c;  //default value
    Displayconstructor()    //default constructor
    {
    a = 4; //override value of a, initialize a
    }
    void show()  //show method
    {
    System.out.println("Value of a="+a);
    System.out.println("Value of b="+b);
    System.out.println("Value of c="+c);
    }
}
public class Constructor6
{
    public static void main(String args[])
    {
        Displayconstructor obj=new Displayconstructor();
        obj.show();

    }
}