package Constructor;
public class ConstructorTypes
{
    public ConstructorTypes()
    {
        System.out.println("This is Default Constructor");
    }
    public ConstructorTypes(String name,int marks)
    {
        System.out.println("This is Parameterized Constructor "+name+" and Marks="+marks);
    }
    public static void main(String[] args)
    {
        ConstructorTypes obj=new ConstructorTypes(); //will call default constructor
        ConstructorTypes obj1=new ConstructorTypes("Java",100); //will call parameterized constructor
    }
}
