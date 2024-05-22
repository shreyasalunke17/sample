package ConstructorThisKeyword;
class cnstrthis
{
    cnstrthis()
    {
        System.out.println("The Default constructor");
    }
    cnstrthis(int a)
    {
        this();
        System.out.println("Parameterize Constructor = "+a);
    }
    cnstrthis(int a,int b)
    {
        this(6);
        System.out.println("Double parameterize constructor-Multiplication = "+ a*b);
    }
    public static void main(String[] args)
    {
        cnstrthis obj=new cnstrthis(7,4);
    }
}












/*Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor
(by means of constructor overloading) and make code more readable

Constructor chaining can be done in two ways:
Within same class: It can be done using this() keyword for constructors in the same class
From base class: by using super() keyword to call the constructor from the base(super OR parent)class.

Constructor chaining occurs through inheritance. A sub-class constructor’s task is to call super class’s constructor first.
This ensures that the creation of sub class’s object starts with the initialization of the data members of the superclass.
There could be any number of classes in the inheritance chain.
Every constructor calls up the chain till the class at the top is reached. */