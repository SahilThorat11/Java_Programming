////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : findSmallestDigit (class logic)
//  Description   : program to find the Smallest digit in a given number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        while (iNo != 0)
        {
            iDigit = iNo % 10; 

            if (iDigit < iMin)       
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;          
        }

    System.out.println("smallest digit is : " + iMin);
    }
    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_5
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.findSmallestDigit(45872);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 45872
//  Output : smallest digit is : 2
//
////////////////////////////////////////////////////////////////////////////////