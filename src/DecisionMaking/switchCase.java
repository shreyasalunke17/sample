package DecisionMaking;
public class switchCase
{
    public static void main (String[] args)
    {
        int num=20;
        switch(num)
        {
            case 5 : System.out.println("It is 5");
                break;
            case 10 : System.out.println("It is 10");
                break;
            case 15 : System.out.println("It is 15");
                break;
            case 20 : System.out.println("It is 20");
                break;
            default: System.out.println("Not present");

        }
    }
}
/*
5)switch-case: The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to
different parts of code based on the value of the expression.

Syntax:
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}

Time Complexity : O(1)
Space Complexity: O(1)
*/




