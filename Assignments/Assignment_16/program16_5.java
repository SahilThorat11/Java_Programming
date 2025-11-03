////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : countDigits (class logic)
//  Description   : program to count the number Digits 
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void countDigits(int iNum)
    {
        int iCount = 0;

        while(iNum != 0)
        {
            iNum = iNum / 10;
            iCount++;
        }
        System.out.println("Count Digit  is : " + iCount);
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_5
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.countDigits(7865);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 7865
//  Output : Count Digit  is : 4
//
////////////////////////////////////////////////////////////////////////////////