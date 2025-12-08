import java.util.Scanner;

class Aritematic
{
    int SumNonFact(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class program4_4
{
    public static void main(String A[])
    {
        int iRet = 0, iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Aritematic aobj = new Aritematic();

        iRet = aobj.SumNonFact(iValue);

        System.out.println("Summation of all factors are : " + iRet);
    }
}