import java.util.Scanner;

class Arithematic
{
    int Multiply(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 == 0) && (iNo2 == 0) && (iNo3 == 0))
        {
            return 0;
        }
        if(iNo1 == 0)
        {
            iNo1 = 1;
        }
        if(iNo2 == 0)
        {
            iNo2 = 1;
        }
        if(iNo3 == 0)
        {
            iNo3 = 1;
        }

        return iNo1 * iNo2 * iNo3;
    }
}

class program6_4
{
    public static void main(String A[])
    {
        int iRet = 0, iValue1 = 0, iValue2 = 0, iValue3 = 0;
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter First number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter Third number : ");
        iValue3 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.Multiply(iValue1, iValue2, iValue3);

        System.out.println("Multiplication of all numbers is : " + iRet);
    }
}