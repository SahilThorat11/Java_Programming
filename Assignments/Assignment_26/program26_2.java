import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description   : Accepts a number from user and displays the number and # 
//                  symbol in decending order
//  Input         : Integer
//  Output        : 5   #   4   #   3   #   2   #   1   #
//  Author        : Sahil Rajaram Thorat
//  Date          : 21/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");
        }   
    }
}// End of Pattern class

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////


class program26_2
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
//      Enter the number of elements :
//          5
//          5   #   4   #   3   #   2   #   1   #
//
//  Input  :
//      Enter number of element :
//      7
//  Output : 7  #   6   #   5   #   4   #   3   #   2   #   1   #
//  
//
////////////////////////////////////////////////////////////////////////////////