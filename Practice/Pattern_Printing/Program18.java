/*
    iRow : 4
    iCol : 4

    1   2   3   4
    5   6   7   8
    9   1   2   3
    4   5   6   7

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int iNo = 1;
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(iNo > 9)  
                {
                    iNo = 1;
                }

                System.out.print(iNo + "\t");
                iNo++;
            }
            System.out.println();
        }
    }
}

class Program18
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