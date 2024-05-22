package Overriding.p1;
/* Rule No:9 => A subclass in a different package can only override the non-final methods declared public or protected.*/
public class Rule9Package1
{
    public int display(){
        System.out.println("This is a public class ");
        return 10;
    }
    protected int display(int a)
    {
        return 10;
    }
}