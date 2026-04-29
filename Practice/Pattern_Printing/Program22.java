/*
    iRow : 4
    iCol : 4

    1    2   3   4
    2    3   4   5
    3    4   5   6
    4    5   6   7 

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1,iNo = i; j <= iCol; j++, iNo++)
            {
                System.out.printf("%d\t", iNo);  
            }
            System.out.println();
        }
    }
}

class Program22
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of column");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iRow, iCol);

        sobj.close();
    }
}