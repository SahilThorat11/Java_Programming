////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : printEvenNumber (class logic)
//  Description   : program to print all even number up to N
//  Input         : Integer
//  Output        : Integer
//  Author        : Sahil Rajaram Thorat
//  Date          : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void printEvenNumber(int iNum)
    {
        int iCnt = 0;

        System.out.println("Even number are the : "+iNum);

        for (iCnt = 1; iCnt <= iNum ; iCnt++)
        {
            if (iCnt % 2 == 0 )
            {
                System.out.println(iCnt);
            }
        }    
    }
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_2
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.printEvenNumber(20);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 20
//  Output : 2
//           4
//           6
//           8
//           10
//           12
//           14
//           16
//           18
//           20
//
////////////////////////////////////////////////////////////////////////////////