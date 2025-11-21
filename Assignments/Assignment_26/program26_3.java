import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description   : Accepts a number from user and displays that number and *
//                  Symbol in Accending order.
//  Input         : Integer
//  Output        : 1  *   2   *   3   *   4   *   5   *
//  Author        : Sahil Rajaram Thorat
//  Date          : 21/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");
        }
    }
}// End of Pattern class

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////


class program26_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
} // End of main class


////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  :
//      Enter number of element :
//      5
//  Output : 1  *   2   *   3   *   4   *   5   *
//  Input  :
//      Enter number of element :
//      6
//  Output : 1  *   2   *   3   *   4   *   5   *   6   *   
//  
//
////////////////////////////////////////////////////////////////////////////////