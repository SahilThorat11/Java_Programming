////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : reverseNumber (class logic)
//  Description   : program to reverseNumber a number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void reverseNumber(int iNum)
    {
        int iRev = 0;
        int iDigit = 0;

        while (iNum != 0)
        {
            iDigit = iNum % 10;          
            iRev = (iRev * 10) + iDigit;     
            iNum = iNum / 10;                
        }

        System.out.println("Reversed number is : " + iRev);
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_4
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.reverseNumber(1234);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 1234
//  Output : 4321
//
////////////////////////////////////////////////////////////////////////////////