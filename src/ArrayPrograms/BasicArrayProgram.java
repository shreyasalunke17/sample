package ArrayPrograms;
public class BasicArrayProgram
{
    public static void main(String[] args)
    {
        int a = 10; //can it hold multiple values
        //declare a variable which can hold multiple values of same data type

        //array declaration and assignment
        //datatype[] variablename = {values};
        int[] aaa = {10,20,30,40,50,60,2,4,6,7,7,8,9,3,6,7,2,63,6,367,334};
        // 10 20 30 40 50 60
        // 0   1  2  3  4  5
        //0                                                20
        int maxIndex = aaa.length - 1;
        //max index  = arrayname.length-1;
        int len = aaa.length;
        System.out.println("Size of array is "+maxIndex);
        System.out.println("Print element at 1st index/position "+aaa[18]);

        //Array is index/position based data structure
        //size/length   =  6
        //index     = 0,1,2,3,4,5
        //roll number/seat number    =>

        //6 mangoes   => count them from start 1,2,3,4,5,6

        //array declared but not assigned any value
        //datatype[] variablename = new datatype[size];
        double[] ddd = new double[10];
        ddd[0] = 10;
        ddd[1] = 20;
        ddd[2] = 30;
        ddd[3] = 40;
        ddd[4] = 50;
        System.out.println("Testttt "+ddd[2]);
        //length    = 10
    }
}

































