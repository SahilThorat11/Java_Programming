////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : printDivisibleBy2and3 (class logic)
//  Description   : program to print all numbers from 1 to N are divisible 2 & 3
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void printDivisibleBy2and3(int iNo)
    {

        System.out.print("Numbers divisible by are: ");

        for (int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.print(iCnt + " ");
            }
    }

    }    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program21_5
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.printDivisibleBy2and3(30);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 30
//  Output : 
//
////////////////////////////////////////////////////////////////////////////////