////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : displayFactors (class logic)
//  Description   : program to display all factors of a given number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.print("Factors are: ");

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                System.out.print( " "+ iCnt );
            }
        }


    }

    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program21_3
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.displayFactors(12);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 12
//  Output : Factors are:  1 2 3 4 6 12
//
////////////////////////////////////////////////////////////////////////////////