package Constructor;
class B00
{
    public B00()
    {
        System.out.println("Line number 6");
    }
}
class B11 extends B00
{
    public B11()
    {
        System.out.println("This is Default Constructor of B11 class");
    }
    public B11(String a)
    {
        System.out.println("Parameterized Constructor of B11 "+a);
    }
    public B11(String a,int b,boolean c)
    {
        System.out.println("line number 21 Multiple parameters");
    }
}
class B22 extends B11
{
    public B22()
    {
        //super(); //in this case it won't call default constructor of parent class,
        super("Java",100,true);
        System.out.println("This is Default Constructor of B22 class");
    }
}
public class SuperKeywordTest
{
    public static void main(String[] args)
    {
        B22 obj = new B22();   //6 21 30
    }
}

/* 1st output scenario=> As we are calling parameterized constructor of parent class.
B11 is parent of B00 class so that,from line 19 it first prints default constructor of
parent class i.e. B00 & then 21,30 */