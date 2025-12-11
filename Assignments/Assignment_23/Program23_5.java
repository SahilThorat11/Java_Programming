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

    int Product()
    {
        int iCnt = 0, iMul = 0;

        for(iCnt = 0, iMul = 1; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                iMul = iMul * Arr[iCnt];
            }
        }

        if(iMul == 1)
        {
            return 0;
        }
        else
        {
            return iMul;
        }
    }
} // End of ArrayX class

class Program23_5
{
    public static void main(String A[])
    {
        int iSize = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        iRet = aobj.Product();

        System.out.println("Product of all odd elements is : " + iRet);
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}