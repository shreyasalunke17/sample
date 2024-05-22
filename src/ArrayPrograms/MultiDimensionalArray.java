package ArrayPrograms;
public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        // 3 row and 3 column

        // Number of Rows
        System.out.println("Number of Rows:"+ arr.length);

        // Number of Columns
        System.out.println("Number of Columns:"+ arr[0].length);
    }
}

/*
Multidimensional Arrays in Java
Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays.
These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([])
per dimension.

Syntax of Java Multidimensional Array
There are 2 methods to declare Java Multidimensional Arrays as mentioned below:
1)datatype [][] arrayrefvariable;
2)datatype arrayrefvariable[][];

Multidimensional Array Declaration
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
*/




























