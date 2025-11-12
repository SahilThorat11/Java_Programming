import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
}

class program27
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt(); 

        Digit dobj = new Digit();
        iRet = dobj.SumDigits(iValue);

        System.out.println("Addition of Digits is : "+iRet);

        // Important
        
        sobj = null;
        dobj = null;
        
        System.gc();
    }
}