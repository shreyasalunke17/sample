package AbstractionPrograms;
//Abstraction Rule no-1 : Its not mandatory to have abstract method in abstract class.
//Abstraction rule no-2 : If we define any abstract method in a class, then that class must be abstract class.
//Abstraction Rule no-3 :  We can not create an object of abstract class.
abstract class Rule123
{
    void demo()
    {
        System.out.println("Rule No: 1 ");
    }
}
class huda
{
    //to solve error just make class abstract.
    //abstract void demo2 () ;     //Rule no 2
}
abstract class shreya
{
    void show()
    {
        System.out.println("Rule No: 3 ");
    }
    public static void main(String[] args)
    {
        //shreya s = new shreya() ;              //can't crate object of abstract class.
        //s.show();
    }
}
