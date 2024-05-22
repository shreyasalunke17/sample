package Loops;
public class WhileLoop1
{
    public static void main (String[] args)
    {
        int i=0;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }
    }
}




/*
while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
The while loop can be thought of as a repeating if statement.
While loop in Java comes into use when we need to repeatedly execute a block of statements.
The while loop is considered as a repeating if statement. If the number of iterations is notfixed,
it is recommended to use the while loop.

Syntax:
while (test_expression)
{
   // statements

   update_expression;
}
.......................................
Syntax:
while (boolean condition)
{
   loop statements...
}


Parts of Java While Loop
..............................
1. Test Expression: In this expression, we have to test the condition. If the condition evaluates to true then we will
execute the body of the loop and go to update expression. Otherwise, we will exit from the while loop.
Example: i <= 10

2.Update Expression: After executing the loop body, this expression increments/decrements the loop variable by some value.
Example: i++;


How Does a While loop execute?
..................................
1)Control falls into the while loop
2)The flow jumps to Condition
3)Condition is tested
If Condition yields true, the flow goes into the Body
If Condition yields false, the flow goes outside the loop
4)The statements inside the body of the loop get executed
5)Updation takes place
6)Control flows back to Step 2
7)The while loop has ended and the flow has gone outside
*/









