package Encapsulation;
public class Encapsulation1
{
    private int atmPin=1234;
    private int age;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAtmPin()
    {
        return atmPin;
    }
    public void setAtmPin(int atmPin)
    {
        this.atmPin=atmPin;
    }
}
class TestEncapsulation
{
    public static void main(String[] args)
    {
        Encapsulation1 obj=new Encapsulation1();
       // obj.setAtmPin(4567);
        System.out.println(obj.getAtmPin());
    }
}
/*Encapsulation is about hiding data members/variables from other classes(hiding variables/data members)
by making data members private.
Encapsulation provides controlled access to data through methods, ensuring data integrity and validation.
Encapsulation also promotes code organization, modularity, and reusability.
Abstraction is about hiding implementation details(hiding method implementation)

Encapsulation in Java can be achieved by:
1)Declaring the variables of a class as private.
2)Providing public setter and getter methods to modify and view the variables values.

What are getter and setter methods in encapsulation?
Getter methods (also known as accessor methods) are used to retrieve the values of private variables.
They provide controlled access to the data.
Setter methods (also known as mutator methods) are used to modify the values of private variables.
They enforce validation, business logic, or additional checks before updating the data.*/