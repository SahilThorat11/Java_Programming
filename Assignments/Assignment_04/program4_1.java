import java.util.Scanner;

class Aritematic
{
    int MultFact(int iNo)
    {
        int iCnt = 0, iMul = 0;

        for(iCnt = 1, iMul = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMul = iMul * iCnt;
            }
        }

        return iMul;
    }
}

class program4_1
{
    public static void main(String A[])
    {
        int iRet = 0, iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Aritematic aobj = new Aritematic();

        iRet = aobj.MultFact(iValue);

        System.out.println("Multiplication of all factors are : " + iRet);
    }
}