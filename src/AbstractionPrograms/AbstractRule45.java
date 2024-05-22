package AbstractionPrograms;
/*Abstraction Rule No-4: If one abstract class extends another abstact class, then its not manadatory for that
child class to provide method implementations for abstract methods of super class */
/*Abstraction Rule No-5: If concrete/non abstract class extends abstract class,then its manadatory for that
child class to provide method implementations for abstract methods of super class */

/**RULE 4:To use an abstract class, you have to inherit it from another class, provide implementations to the abstract
 methods in it.
 RULE 5:If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.*/
abstract class AbstractTest
{
    void show()
    {
        System.out.println("This is AbstractTest Class");
    }
    abstract void info();
}
abstract class Test extends AbstractTest
{
    abstract void temp();
    void display()
    {
       System.out.println("Abstract class Test");
    }
}
class Demo extends Test
{
    @Override  //Any class inheriting the current class must either override the abstract method or declare itself as abstract
    void info() //Here abstract method of AbstractTest class is override
    {
      System.out.println("Rule 4:This is Non Abstract Class--info() is overridden method of abstract class AbstractTest");
    }
    void temp()
    {
        System.out.println("This is inherited class & temp is abstract method of Test class=>Rule 5:If you inherit an abstract class,you have to provide implementations to all the abstract methods in it");
    }
}
    public class AbstractRule45
    {
        public static void main(String[] args)
        {
            Demo obj = new Demo();    //cannot crate object of abstract class
            obj.show();
            obj.info();
            obj.display();
            obj.temp();
        }
    }
