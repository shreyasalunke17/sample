package Constructor;
class Additionsubtraction
{
    int no1;
    int no2;
    Additionsubtraction()  //declaring constructor to initialize lenght and breadth
    {
        no1=18;
        no2=10;
    }
    int add() //declaring method
    {
        int addnumbers=no1+no2;
        return addnumbers;
    }
    int sub()
    {
        int subnumbers=no1-no2;
        return subnumbers;
    }
}
public class Constructor8
{
    public static void main(String args[])
    {
        Additionsubtraction obj=new Additionsubtraction();
        Additionsubtraction obj1=new Additionsubtraction();
        System.out.println("Addition of two numbers="+obj.add());
        System.out.println("Subtraction of two numbers="+obj1.sub());

    }
}
