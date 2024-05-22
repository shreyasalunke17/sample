package Constructor;
class B10
{
    public B10()
    {
        System.out.println("This is Default Constructor of B10 class");
    }
    public B10(String a)
    {
        System.out.println("Parameterized Constructor of B10 "+a);
    }
    public B10(String a,int b,boolean c)
    {
        System.out.println("Multiple Parameters");
    }
}
class B20 extends B10
{
    public B20()
    {
        //super();  //6 26
        /* In this case it won't call default constructor of parent class
        Because,As we are calling parameterized constructor of parent class */
         super("Java",100,true);  //14 26
        //super("Hello");  //10 26
        System.out.println("This is Default Constructor of B20 class");
    }
}
public class SuperKeywordTest1
{
    public static void main(String[] args)
    {
        B20 obj = new B20();
    }
}
