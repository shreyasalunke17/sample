package Constructor;
class Constructor1
{
    String language;
    Constructor1() //default constructor
    {
    this.language="Java";
    }
Constructor1(String language) //parameterize constructor
{
    this.language=language;
}
public void getName()
{
    System.out.println("Programming Langauage: "+this.language);
}
public static void main(String[] args)
{
    Constructor1 obj=new Constructor1(); //call constructor with no parameter
    Constructor1 obj1=new Constructor1("Python"); //call constructor with a single parameter
    obj.getName();
    obj1.getName();
}
}

/* In the above example,we have two constructors: Constructor1() and Constructor1(String language).
Here,both the constructor initialize the value of the variable language with different values.
Based on the parameter passed during object creation,different constructors are called and different values are assigned.*/

