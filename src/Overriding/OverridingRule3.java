package Overriding;
/*Rule No:3 => Return type must be same for both parent and child method(primitive data types).
The return type must be same or return type declared in original of overridden private and default or protected */
class Calling
{
    Calling test()
    {
        System.out.println("This is a parent class");
        Calling obj = new Calling();
        //obj.test();
        return obj;
    }
}
public class OverridingRule3 extends Calling
{
    OverridingRule3 test()
    {
        OverridingRule3 obj =new OverridingRule3();
        //obj.test();
        return obj;
    }
    public static void main(String[] args)
    {
        Calling obj=new Calling();
        //obj.test();
        System.out.println(obj.test());

    }
}


