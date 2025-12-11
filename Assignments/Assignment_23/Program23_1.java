import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iValue;

    public ArrayX(int iNo, int iNum)
    {
        iSize = iNo;
        iValue = iNum;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    boolean Check()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                return true;
            }
        }

        return false;
    }
} // End of ArrayX class

class Program23_1
{
    public static void main(String A[])
    {
        int iSize = 0, iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to find : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize, iValue);
        aobj.Accept();

        bRet = aobj.Check();

        if(bRet == true)
        {
            System.out.println(iValue + " is present ");
        }
        else 
        {
            System.out.println(iValue + " is not present ");
        }

        aobj = null;
        sobj = null;

        System.gc();
    }
}