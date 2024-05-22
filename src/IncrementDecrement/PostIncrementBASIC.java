package IncrementDecrement;
public class PostIncrementBASIC
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = x++;
        System.out.println("Value of y is: "+y); //printing value of y, If we print vale of x then the output is 11
        y=x;
        System.out.println("Value of y is: "+y);
    }
}


/* Post Increment Operator:
If an Increment operator is used after an operand, then is called Post Increment operator.

Syntax: operand++;

Post increment operator is applied  on ‘x’,Here the case is exact opposite of pre increment, first the value of variable ‘x’
is assigned to the variable ‘y’ and then the value of ‘x’ is incremented by 1
As per example,the initial value of ‘x’ is 10. After applying post-increment operator the current values of ‘x’ (i.e.10)
is assigned to y, and then the value of ‘x’ is incremented by 1. So when displaying variable ‘y’ it is showing as 10 */



















