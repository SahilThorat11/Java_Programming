////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : countFactors (class logic)
//  Description   : program to count total number of factors of a given number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void countFactors(int iNo)
    {
        int iCnt = 0;
        int count = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                count++;
            }
    }

    System.out.println("Total number factors is :" + count);
    }

    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program21_4
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.countFactors(20);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 20
//  Output : Total number factors is: 6
//
////////////////////////////////////////////////////////////////////////////////