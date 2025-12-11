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

    int lastOcc()
    {
        int iCnt = 0;

        for(iCnt = Arr.length - 1; iCnt > 0; iCnt--)
        {
            if(Arr[iCnt] == iValue)
            {
                return iCnt;
            }
        }
        return -1;
    }

} // End of ArrayX class

class Program23_3
{
    public static void main(String A[])
    {
        int iSize = 0, iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to find : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize, iValue);
        aobj.Accept();

        iRet = aobj.lastOcc();

        if(iRet == -1)
        {
            System.out.println("There is no such number.");
        }
        else 
        {
            System.out.println("Last occurrence of number at "+ iRet + "th index");
        }
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}