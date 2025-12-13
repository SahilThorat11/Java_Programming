import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int iNo)
    {
        iSize = iNo;
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

    int Difference()
    {
        int iCnt = 0, iSumEven = 0, iSumOdd= 0, iDigit = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSumEven = iSumEven + Arr[iCnt];
            }
            else 
            {
                iSumOdd = iSumOdd + Arr[iCnt]; 
            }
        }

        return iSumEven - iSumOdd;
    }
} // End of ArrayX class

class Program25_1
{
    public static void main(String A[])
    {
        int iSize = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        iRet = aobj.Difference();

        System.out.println("Differnce is : "+ iRet);
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}