// Input : 5
// Output : 5  * 4 * 3 * 2 * 1 = 120

import java.util.*;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int i = 0;
        long lFact = 1;                      // Important

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        i = 1; 

        while(i <= iNo)                      // Change
        {
            lFact = lFact * i;
            i++;
        }       

        return lFact;
    }
} // End of Number Class

class program25
{
    public static void main(String A[])
    {
        int iValue = 0;
        long lRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt(); 

        Number nobj = new Number();
        lRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is : "+lRet);

        // Important
        
        sobj = null;
        nobj = null;
        
        System.gc();
    }
}