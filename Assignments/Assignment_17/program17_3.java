////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : findMax (class logic)
//  Description   : program to find the maximum of two number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void findMax(int iNo1 , int iNo2)
    {
        int iMax = 0;

        if (iNo1 > iNo2)
        {
            iMax = iNo1;
        }
        else
        {
            iMax = iNo2;
        }

        System.out.println("Maximum number is : "+iMax);
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program17_3
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.findMax(20,15);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 20 , 15
//  Output : Maximum number is : 20
//
////////////////////////////////////////////////////////////////////////////////