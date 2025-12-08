import java.util.Scanner;

class Arithematic
{
    int FindMax(int iNo1, int iNo2)
    {
        if(iNo1 < iNo2)
        {
            return iNo2;
        }
        else
        {
            return iNo1;
        }
    }
}
class program5_2
{
    public static void main(String A[])
    {
        int iRet = 0, iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.FindMax(iValue1, iValue2);

        System.out.println("Maximum number is : " + iRet);
    }
}