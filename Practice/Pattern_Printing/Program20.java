/*
    iRow : 5
    iCol : 5

    a       b       c       d       e
    1       2       3       4       5
    a       b       c       d       e
    1       2       3       4       5
    a       b       c       d       e

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)  
            {
                if(i % 2 == 0)
                {
                    System.out.printf("%d\t", j);
                }
                else
                {
                    System.out.printf("%c\t", ch);
                }
                
            }
            System.out.println();
        }
    }
}

class Program20
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