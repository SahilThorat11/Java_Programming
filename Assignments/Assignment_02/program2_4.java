import java.util.Scanner;

class Demo
{
    void Display(int iNo, int iFrequency)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(iNo+"\t");
        }
    } 
}

class program2_4
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.Display(iValue1, iValue2);
    } 
}


