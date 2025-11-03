////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : checkDivisible (class logic)
//  Description   : program to check whether a number is divisible by 5 & 11 / not 
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void printDigits(int iNum)
    {
        int iTemp = iNum;
        int iDigit = 0; 

        System.out.println(+iNum);

        while (iTemp != 0)
        {
            iDigit = iTemp % 10; 
            System.out.println(iDigit);
            iTemp = iTemp / 10;  
        }
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program19_4
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.printDigits(9876);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 9876
//  Output : 9
//           8
//           7
//           6
//
////////////////////////////////////////////////////////////////////////////////