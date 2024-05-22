package OperatorPrograms;
public class instanceofOperator
{
    public static void main(String[] args)
    {
        Person obj1 = new Person();
        Person obj2 = new Girl();

        System.out.println("obj1 instanceof Person: "+ (obj1 instanceof Person));
        System.out.println("obj1 instanceof Girl: "+ (obj1 instanceof Girl));
        System.out.println("obj1 instanceof MyInterface: "+ (obj1 instanceof MyInterface));

        System.out.println("obj2 instanceof Person: "+ (obj2 instanceof Person));
        System.out.println("obj2 instanceof Girl: "+ (obj2 instanceof Girl));
        System.out.println("obj2 instanceof MyInterface: "+ (obj2 instanceof MyInterface));
    }
}
class Person
{
}
class Girl extends Person implements MyInterface
{
}
interface MyInterface
{
}






/* 9.instanceof operator
The instance of the operator is used for type checking.It can be used to test if an object is an instance of a class,
a subclass,or an interface.

General format: object instance of class/subclass/interface */









