import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description   : Accept two numbers from user Row and Columns and print given 
//                  pattern on screen.    
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
        int i = 0, j = 0; 
        int iNo = 0;

        iNo = 1;
        for(i = 1; i <= iRow; i++)
        {
            if(i % 2 == 0)
            {
                iNo =  1;
            } 
            else     
            {
                iNo = 2;
            }         

            for(j = 1; j <= iCol; j++)
            {
                System.out.printf("%d\t", iNo);  
                iNo = iNo + 2;
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
  
class program29_2
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
//  Input  : iRow = 4   iCol = 5
//
//  Output :    2   4   6   8   10
//              1   3   5   7   9
//              2   4   6   8   10
//              1   3   5   7   9
//
////////////////////////////////////////////////////////////////////////////////