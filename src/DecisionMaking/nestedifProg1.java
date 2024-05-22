package DecisionMaking;
public class nestedifProg1
{
    public static void main(String[] args)
    {
        int i=10;
        if (i == 10 || i<15)
        {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println("i is smaller than 12 too");
        }
        else
        {
            System.out.println("i is greater than 15");
        }
    }
}
/*
3)nested-if: A nested if is an if statement that is the target of another if or else. Nested if statements mean an
if statement inside an if statement. Yes, java allows us to nest if statements within if statements.
i.e, we can place an if statement inside another if statement.

Syntax:
if (condition1)
{
   // Executes when condition1 is true
   if (condition2)
   {
      // Executes when condition2 is true
   }
}

Time Complexity :O(1)
Auxiliary Space :O(1)
*/































