////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : checkPrime (class logic)
//  Description   : program to check whether a number is prime or not
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void checkPrime(int iNum)
    {
        int iCnt = 0;
        int iDiv = 0;

        for (iCnt = 1; iCnt <= iNum ; iCnt++)
        {
            if (iNum % iCnt == 0)
            {
                iDiv++;
            }
        }

        if (iDiv == 2)
        {
            System.out.println("It is prime number : "+iNum);
        }
        else
        {
            System.out.println("It is not a prime number : "+iNum);

        }
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_1
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.checkPrime(11);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 11
//  Output : It is prime number : 11
//
////////////////////////////////////////////////////////////////////////////////