import java.util.Scanner;

class Arithematic
{
    boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }

    } 
}

class program2_5
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = true;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();  

        bRet = aobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is Even Number");
        }
        else
        {
            System.out.println(iValue + " is Odd number");
        }

    } 
}


