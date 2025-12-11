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

    void DigitsSum()
    {
        int iCnt = 0, iSum = 0, temp = 0, iDigit = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            temp = Arr[iCnt];
            iSum = 0;

            while(temp != 0)
            {
                iDigit = temp % 10;
                iSum = iSum + iDigit;
                temp = temp / 10;
            }
            System.out.print(iSum + "\t");
        }
    }
} // End of ArrayX class

class Program24_5
{
    public static void main(String A[])
    {
        int iSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        aobj.DigitsSum();
    
        aobj = null;
        sobj = null;

        System.gc();
    }
}