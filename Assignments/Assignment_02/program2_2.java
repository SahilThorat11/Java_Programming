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

        while(iNo > iCnt)
        {
            System.out.println("*\t");
            iNo--;
        }
    } 
}

class program2_2
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


