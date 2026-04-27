/* 
    iRow : 5
    iCol : 5

    *       *       *       *       *
    *       *       *       *
    *       *       *
    *       *
    *
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0; 

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                if(j >= i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

class Program08
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