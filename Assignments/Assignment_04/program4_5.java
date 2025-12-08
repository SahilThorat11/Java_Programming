import java.util.Scanner;

class Aritematic
{
    int FactDiff(int iNo)
    {
        int iCnt = 0, iFactSum = 0, iNonFactSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iNonFactSum = iNonFactSum + iCnt;
            }
        }

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactSum = iFactSum + iCnt;
            }
        }

        return iFactSum - iNonFactSum;
    }
}

class program4_5
{
    public static void main(String A[])
    {
        int iRet = 0, iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Aritematic aobj = new Aritematic();

        iRet = aobj.FactDiff(iValue);

        System.out.println("Difference between factors and Non factors are : " + iRet);
    }
}