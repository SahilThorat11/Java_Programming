import java.util.Scanner;

class Arithmetic 
{   
    public int Multiplication(int iNo) 
    {
        int iDigit = 0;

        if(iNo == 0)
        {
            return 1;
        }

        iDigit = iNo % 10;

        return iDigit * Multiplication(iNo / 10);
    }
}

class Program_05
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;
        Arithmetic aobj = new Arithmetic();  

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();
        
        iRet = aobj.Multiplication(iValue);
        
        System.out.println("Multiplication of digits is : " + iRet);
    }
}
