import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iStart;
    private int iEnd;

    public ArrayX(int iNo, int iFirst, int iLast)
    {
        iSize = iNo;
        iStart = iFirst;
        iEnd = iLast;
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

    void Range()
    {
        int iCnt = 0;

        System.out.print("Numbers between given range are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
            {
                System.out.print(Arr[iCnt] + "\t");
            }
        }
    }
} // End of ArrayX class

class Program23_4
{
    public static void main(String A[])
    {
        int iSize = 0, iStart = 0, iEnd = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the Starting point : ");
        iStart = sobj.nextInt();

        System.out.println("Enter the Ending point : ");
        iEnd = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize, iStart, iEnd);
        aobj.Accept();

        aobj.Range();
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}