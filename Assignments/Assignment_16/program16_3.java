////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : FindFactorial (class logic)
//  Description   : program to check whether a give number is Eevn or Odd
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void findFactorial(int iNum)
    {
        int iCnt = 0;
        int iFact = 1;

        for (iCnt = 1; iCnt <= iNum; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial is : " +iFact);
    }

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_3
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.findFactorial(5);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 5
//  Output : Factorial is : 25
//
////////////////////////////////////////////////////////////////////////////////