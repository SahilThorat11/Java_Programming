////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : calculateSum (class logic)
//  Description   : program to calculate the sum of first N natural number (10)
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void calculateSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Sum of the natural number :"+iSum);

    }

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_1
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.calculateSum(10);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 10
//  Output : 55
//
////////////////////////////////////////////////////////////////////////////////