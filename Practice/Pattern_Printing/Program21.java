/*
    iRow : 5
    iCol : 5

    1       2       3       4       5
    -1      -2      -3      -4      -5
    1       2       3       4       5
    -1      -2      -3      -4      -5
    1       2       3       4       5

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int iNo = 0;

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    iNo = -j;
                    System.out.print(iNo + "\t");
                }
                else
                {
                    System.out.print(j + "\t");
                }
                
            }
            System.out.println();
        }
    }
}

class Program21
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