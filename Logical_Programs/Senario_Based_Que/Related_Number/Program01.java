import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iNo = 0, iDigit = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }

        sobj.close();
    }
}