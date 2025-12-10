import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int Frequency()
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iCount++;
            }
        }

        return iCount;
    }
} // End of ArrayX class

class Program22_4
{
    public static void main(String A[])
    {
        int iRet = 0, iSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        iRet = aobj.Frequency();
        System.out.println("Frequency of 11 is : "+iRet);

        aobj = null;
        sobj = null;
    }
}