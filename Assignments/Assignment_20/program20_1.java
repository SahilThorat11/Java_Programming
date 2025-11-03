////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : calculateEvenNumber (class logic)
//  Description   : program to find sum of all even number up to N
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void calculateEvenNumber(int iNo)
    {
        int iCnt = 0;
        int iCal = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iCnt % 2 == 0)
            {
               iCal = iCal + iCnt;
            }
        }

        System.out.println("calculate Even number is : " + iCal);
    }
    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_1
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.calculateEvenNumber(10);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 10
//  Output : Even number is : 30
//
////////////////////////////////////////////////////////////////////////////////