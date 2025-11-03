////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : printReverse (class logic)
//  Description   : program to print number from N down to 1 reverse order
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void printReverse(int iNo)
    {
        int iCnt = 0;

        for (iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_2
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.printReverse(10);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 10
//  Output : 10
//            9
//            8
//            7
//            6
//            5
//            4
//            3
//            2
//            1
//
////////////////////////////////////////////////////////////////////////////////