import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description   : Accepts a number from user and displays characters in sequential format
//  Input         : Integer
//  Output        : A   B   C   D   E
//  Author        : Sahil Rajaram Thorat
//  Date          : 21/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
        }   
    }
}// End of Pattern class

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////


class program26_1
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
//  Output : A  B   C   D   E
//
//  Input  :
//      Enter number of element :
//      6
//  Output : A  B   C   D   E   F
//  
//
////////////////////////////////////////////////////////////////////////////////