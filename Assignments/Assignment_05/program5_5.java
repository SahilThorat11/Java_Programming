import java.util.Scanner;

class Arithematic
{
    int FindLargest(int iNo1, int iNo2, int iNo3)
    {
        if(iNo3 < iNo2)
        {
            return iNo2;
        }
        else if(iNo2 < iNo1)
        {
            return iNo1;
        }
        else
        {
            return iNo3;
        }
    }
}

class program5_5
{
    public static void main(String A[])
    {
        int iRet = 0, iValue1 = 0, iValue2 = 0, iValue3 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the Numbers : ");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();
        iValue3 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.FindLargest(iValue1, iValue2, iValue3);

        System.out.println("Largest number is : " + iRet);
    }

}