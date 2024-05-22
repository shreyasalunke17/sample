package CombineSuperThis;
class Ben
{
    public Ben()
    {
        this("Hello",20);
        System.out.println("line 7, this default constructor");
    }
    public Ben(String a,int b)
    {
        System.out.println("line 11,this two parameterized constructor");
    }
}
class Ten extends Ben
{
    public Ten()
    {
        this ("Java",50);
        System.out.println("line 19,this is default constructor");
    }
    public Ten(String a)
    {
        this();
        System.out.println("line 24,one parameter constructor");
    }
    public Ten(String a,int b)
    {
        System.out.println("line 28,two parameterized constructor");
    }
}
public class CombineSuperThis1
{
    public static void main(String[] args)
    {
        Ten ob =new Ten("Constructor Program");  //11 7 28 19 24
    }
}
