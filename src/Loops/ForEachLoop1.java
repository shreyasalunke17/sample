package Loops;
public class ForEachLoop1
{
    public static void main(String[] args)
    {
        int ar[]={ 10, 50, 60, 80, 90 };   //array declaration
        for (int element : ar)
            System.out.print(element+" ");
    }
}




/*
For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.
It starts with the keyword for like a normal for-loop.
Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as
the base type of the array, followed by a colon, which is then followed by the array name.
In the loop body, you can use the loop variable you created rather than using an indexed array element.
It’s commonly used to iterate over an array or a Collections class (eg,ArrayList)

It is mainly used to traverse the array or collection elements. The advantage of the for-each loop is that it
eliminates the possibility of bugs and makes the code more readable. It is known as the for-each loop because it
traverses each element one by one.


Syntax:
for(type var:array)
{
    statements using var;
}
*/



















