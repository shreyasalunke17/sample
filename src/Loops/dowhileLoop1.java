package Loops;
public class dowhileLoop1
{
    public static void main (String[] args)
    {
        int i=0;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}






/*
Java do-while loop is an Exit control loop.Therefore,unlike for or while loop, a do-while check for the condition after
executing the statements of the loop body.

Syntax:
do
{
   Update_expression     //Loop Body
}
while (test_expression);  //Condition check


Components of do-while Loop
....................................
1. Test Expression: In this expression, we have to test the condition. If the condition evaluates to true then we will
execute the body of the loop and go to update expression. Otherwise, we will exit from the while loop.
For example: i <= 10

2. Update Expression: After executing the loop body, this expression increments/decrements the loop variable by some value.
For example: i++;


Execution of do-While loop
.....................................
1)Control falls into the do-while loop
2)The statements inside the body of the loop get executed
3)Updation takes place
4)The flow jumps to Condition
5)Condition is tested
If Condition yields true, go to Step 6
If Condition yields false, the flow goes outside the loop
6)The flow goes back to Step
*/












































