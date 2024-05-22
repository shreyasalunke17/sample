package ConstructorThisKeyword;
class constructorthis
{
    constructorthis()
    {
        this(4);
        System.out.println("The Default constructor");
    }
    constructorthis(int a)
    {
        this(7,23);
        System.out.println("Parameterize Constructor = "+a);
    }
    constructorthis(int a,int b)
    {
        System.out.println("Double parameterize constructor-Addition = "+ a+b);
    }
    public static void main(String[] args)
        {
            constructorthis obj=new constructorthis();
        }
    }














/*The this() expression should always be the first line of the constructor
There should be at-least be one constructor without the this() keyword i.e. constructor 3


Why do We Need Constructor Chaining?
If we want to instantiate objects of a class with different types or numbers of parameters,
we require different constructor definitions in the class.
These different constructors can be made efficiently using constructor chaining.
Constructor chaining in Java enables us to define various constructors for each task and connect them with links or
chains to improve the quality of the code.
If we don't chain constructors together and one of them requires a certain parameter, we'll have to initialize
that parameter twice in each constructor. */