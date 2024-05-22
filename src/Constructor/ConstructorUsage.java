package Constructor;
/*Why we need Constructor?
To initialize an object of a class and assign default values to properties of a class
When we don't write any constructor in class,then compiler will provide you 1 default constructor.*/
public class ConstructorUsage
{
    private String name="Java";
    private int age=22;
    private double salary;
    private boolean test;
    public static void main(String[] args)
    {
        ConstructorUsage obj = new ConstructorUsage();
        System.out.println("name is "+obj.name);   //Java
        System.out.println("age is "+obj.age);    //25
        System.out.println("salary is "+obj.salary); //0.0
        System.out.println("test is "+obj.test);  //false
    }
}
/*
Here,We haven't created any constructors.Hence,the Java compiler automatically creates the default constructor
The default constructor initializes any uninitialized instance variables with default values

Type	Default Value
------------------------
boolean	false
byte	0
short	0
int	    0
long	0L
char	\u0000
float	0.0f
double	0.0d
object	Reference null
*/