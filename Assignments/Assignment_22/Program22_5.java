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

    int Frequency()
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                iCount++;
            }
        }

        return iCount;
    }
} // End of ArrayX class

class Program22_5
{
    public static void main(String A[])
    {
        int iRet = 0, iSize = 0, iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to find : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize, iValue);
        aobj.Accept();

        iRet = aobj.Frequency();
        System.out.println("Frequency of "+iValue+ " is : "+iRet);

        aobj = null;
        sobj = null;
    }
}