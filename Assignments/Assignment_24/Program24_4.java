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

    void Digits()
    {
        int iCnt = 0, iCount = 0, temp = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            temp = Arr[iCnt];
            iCount = 0;

            while(temp != 0)
            {
                temp = temp / 10;
                iCount++;
            }

            if(iCount == 3)
            {
                System.out.print(Arr[iCnt] + "\t");
            }
        }
    }
} // End of ArrayX class

class Program24_4
{
    public static void main(String A[])
    {
        int iSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        aobj.Digits();
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}