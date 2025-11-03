////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : checkPerfect (class logic)
//  Description   : program to check whether a number is a perfect or not
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 31/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void checkPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

      for (iCnt = 1; iCnt <= iNo / 2; iCnt++)
      {
        if (iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
      }

      if (iSum == iNo)
      {
        System.out.println(iNo + " is a Perfect Number.");
      }
      else
      {
        System.out.println(iNo + " is NOT a Perfect Number.");
      }
    }
    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_3
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.checkPerfect(6);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 6
//  Output : 6 is a Perfect Number.
//            
////////////////////////////////////////////////////////////////////////////////