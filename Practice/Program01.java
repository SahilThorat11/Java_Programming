import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int x = 0, y = 0, i = 0, iPow = 0;

        System.out.print("Enter base : ");
        x = sobj.nextInt();

        System.out.print("Enter power : ");
        y = sobj.nextInt();

        // Handle undefined case
        if (x == 0 && y == 0)
        {
            System.out.println("0^0 is undefined");
        }
        // Handle negative power
        else if (y < 0)
        {
            double dresult = 1.0;

            for (i = 1; i <= -y; i++)
            {
                dresult = dresult * x;
            }
        
            System.out.println("Result : " + (1.0 / dresult));
        }
        else
        {
            for (iPow = 1, i = 1; i <= y; i++)
            {
                iPow = iPow * x;
            }

            System.out.println("Result : " + iPow);
        }

        sobj.close();
    }
}