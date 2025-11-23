import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description   : Accepts a number from user and displays first # symbol then 
//                  number and then * Symbol in Accending order.     
//  Input         : Integer, Integer
//  Output        : Void
//  Author        : Sahil Rajaram Thorat
//  Date          : 22/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNo = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1,iNo = i; j <= iCol; j++, iNo++)
            {
                System.out.printf("%d\t", iNo);  
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
  
class program29_5
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
//  Input  : iRow = 4   iCol = 4
//
//  Output :   1    2   3   4
//             2    3   4   5
//             3    4   5   6
//             4    5   6   7 
//
////////////////////////////////////////////////////////////////////////////////