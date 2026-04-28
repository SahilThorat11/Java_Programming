/*
    iRow : 6
    iCol : 6

    1   1   1   1   1
    2   2           2
    3       3       3
    4           4   4
    5   5   5   5   5

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if((i == j) || (i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                {
                    System.out.printf("%d\t", i);
                }
                else
                {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
}

public class Program15
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iRow, iCol);

        sobj.close();
    }    
}
