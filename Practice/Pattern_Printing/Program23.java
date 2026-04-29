/*
    iRow : 5
    iCol : 5

    5       5       5       5       5
    4       4       4       4       4
    3       3       3       3       3
    2       2       2       2       2
    1       1       1       1       1

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

class Program23
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