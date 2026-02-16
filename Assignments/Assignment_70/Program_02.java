import java.util.Scanner;

class Arithmetic 
{   
    public int Summation(int iNo) 
    {
        int iDigit = 0;

        if(iNo == 0)
        {
            return 0;
        }

        iDigit = iNo % 10;

        return iDigit + Summation((iNo / 10));
    }
}

class Program_02
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;
        Arithmetic aobj = new Arithmetic();  

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();
        
        iRet = aobj.Summation(iValue);
        
        System.out.println("Summation of digits is : " + iRet);
    }
}
