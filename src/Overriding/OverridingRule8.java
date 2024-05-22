package Overriding;
/*Rule No:8 => A subclass within the same package as the instance’s superclass can override any superclass method that
is not declared private or final.*/
class Instrument
{
void test()
{
    System.out.println("Default class");
}
public void test(long a)
{
    System.out.println("Public class ");
}
protected void test(int a,int b)
{
    System.out.println("Protected class");
}
private void test(int a,int b,String c)
{
    System.out.println("Private class");
}
}
class Piano extends Instrument
{
    void test()
    {
        super.test();
    }
    public void test(long a)
    {
        super.test(a);
    }
    protected void test(int a,int b)
    {
        super.test(a,b);
    }
}
public class OverridingRule8
{
    public static void main(String[] args)
    {
        Piano obj=new Piano();
        obj.test();
        obj.test(20);
        obj.test(10,10);
    }
}