////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : sumOfDigits (class logic)
//  Description   : program to find the sum of Digits of a number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void sumOfDigits(int iNum)
    {
        int iSum = 0;
        int iDigit = 0;

        while (iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }
        System.out.println("Sum of Digits : "+iSum);
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program17_1
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.sumOfDigits(1234);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 1234
//  Output : 10
//
////////////////////////////////////////////////////////////////////////////////