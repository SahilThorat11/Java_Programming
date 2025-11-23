import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description   : Accepts a number from user and displays first # symbol then 
//                  number and then * Symbol in Accending order.     
//  Input         : Integer, Integer
//  Output        : Void
//  Author        : Sahil Rajaram Thorat
//  Date          : 23/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >=1 ; j--)
            {
                if((i == 1) || (i == iRow) || (j == 1) || (j == iCol) || (i == j)) 
                {
                    System.out.print("*\t");
                }
                else if(i > j)
                {
                    System.out.printf("$\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
                
            }
            System.out.println();
        }
    }
} // End of Pattern class

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////
  
class program32_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
} // End of main class


////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : iRow = 6   iCol = 6
//
//  Output :    *       *       *       *       *       *
//              *       #       #       #       *       *
//              *       #       #       *       $       *
//              *       #       *       $       $       *
//              *       *       $       $       $       *
//              *       *       *       *       *       *
//
////////////////////////////////////////////////////////////////////////////////