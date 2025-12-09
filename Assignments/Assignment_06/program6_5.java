import java.util.Scanner;

class Arithematic
{
    float Percentage(int iObtained, int iTotal)
    {
        float iPercent = 0.0f;

        iPercent = ((float)iObtained / iTotal) * 100;

        return iPercent;
    }
}

class program6_5
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        float fRet = 0.0f;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter Obtained marks : ");
        iValue1 = sobj.nextInt();

        System.out.println("Please enter Total marks : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        fRet = aobj.Percentage(iValue1, iValue2);

        System.out.println("Your percentage is : "+fRet+"%");
    }
}