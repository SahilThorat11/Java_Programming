import java.util.Scanner;

class Demo
{
    void Display(int iNo)
    {
        int iCnt = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iCnt < iNo)
        {
            System.out.println("*\t");
            iCnt++;
        }
    } 
}

class program2_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.Display(iValue);
    }
}

