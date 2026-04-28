/*
    iRow : 6
    iCol : 6

    *   *   *   *   *   *
    *   $   $   $   *   *
    *   $   $   *   @   *
    *   $   *   @   @   *
    *   *   @   @   @   *
    *   *   *   *   *   *

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = iCol; j >= 1; j--)
            {
                if((i == j) || (i == 1) || (j == 1) || (iRow == i) || (iCol == j))
                {
                    System.out.print("*\t");
                }
                else if (i > j)
                {
                  System.out.print("@\t");  
                }
                else
                {
                   System.out.print("$\t");   
                }
            }
            System.out.println();
        }
    }
}
public class Program17
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iRow, iCol);
        
        sobj.close();
    }    
}
