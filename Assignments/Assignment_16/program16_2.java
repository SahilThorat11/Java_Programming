////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : checkEvenOdd (class logic)
//  Description   : program to check whether a give number is Eevn or Odd
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat 
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void checkEvenOdd(int iNum)
    {
        if(iNum % 2 == 0)
        {
            System.out.println("It is Even number");
        }
        else
        {
            System.out.println("It is Odd number");
        }
    }

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_2
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.checkEvenOdd(7);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 7
//  Output : It is Odd number
//
////////////////////////////////////////////////////////////////////////////////