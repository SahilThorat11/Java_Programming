import java.util.Scanner;

class PatternPrinting
{
    void Pattern(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
 
        // O(N)
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("$\t*\t");
        }
    }
}
class Program7_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the number : ");
        iValue = sobj.nextInt();

        PatternPrinting pobj = new PatternPrinting();

        pobj.Pattern(iValue);
    }
}