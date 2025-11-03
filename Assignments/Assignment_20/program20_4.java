////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : findLargestDigit (class logic)
//  Description   : program to find the largest digit in a given number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;       
            if (iDigit > iMax)       
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;          
        }

    System.out.println("Largest digit is : " + iMax);
    }
    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_4
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.findLargestDigit(83429);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 83429
//  Output : Largest digit is : 9
//
////////////////////////////////////////////////////////////////////////////////