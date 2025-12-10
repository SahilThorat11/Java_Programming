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

    boolean Check()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;
            }
        }

        return false;
    }
} // End of ArrayX class

class Program22_3
{
    public static void main(String A[])
    {
        int iSize = 0;
        boolean bRet = false; 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        bRet = aobj.Check();
        
        if(bRet == true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is not present");
        }

        aobj = null;
        sobj = null;
    }
}