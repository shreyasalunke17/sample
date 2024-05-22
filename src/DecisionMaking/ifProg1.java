package DecisionMaking;
public class ifProg1
{
    public static void main(String[] args)
    {
        int i=10;
        if (i<15)
            System.out.println("Inside If block");
            System.out.println("10 is less than 15");
            // This statement will be executed
            // as if considers one statement by default again below statement is outside of if block
            System.out.println("I am Not in if");
    }
}

/*In programming also face some situations
where we want a certain block of code to be executed when some condition is fulfilled.
A programming language uses control statements to control the flow of execution of a program based on certain conditions.
These are used to cause the flow of execution to advance and branch based on changes to the state of a program.

1)if: if statement is the most simple decision-making statement.It is used to decide whether a certain statement or block
of statements will be executed or not i.e if a certain condition is true then a block of statements is executed otherwise not.

Syntax:
if(condition)
{
   //Statements to execute if
   //Condition is true
}

Time Complexity :O(1)
Auxiliary Space :O(1)
*/





























