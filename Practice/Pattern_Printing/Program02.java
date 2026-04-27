/* 
    iRow : 4
    iCol : 4

    #       #       #       #       #
    *       *       *       *       *
    #       #       #       #       #
    *       *       *       *       *
    #       #       #       #       #
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int irow = 0, icol = 0;

        System.out.println("Enter the number of rows : ");
        irow = sobj.nextInt();

        System.out.println("Enter the number of column : ");
        icol = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(irow, icol);

        sobj.close();
    }
}