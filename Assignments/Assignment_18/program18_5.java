////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : checkSing (class logic)
//  Description   : program to check whether a number is positive,negative,zero
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void checkSing(int iNum)
    {
        if (iNum == 0)
        {
            System.out.println("It is zero number : "+iNum);
        }
        else if (iNum > 0)
        {
            System.out.println("It is positive number : "+iNum);
        }
        else
        {
            System.out.println("It is negative number : "+iNum);

        }
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_5
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.checkSing(-8);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : -8
//  Output : It is negative number : -8
//
////////////////////////////////////////////////////////////////////////////////