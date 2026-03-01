import java.util.*;

class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Units = 0;
        int Amount = 0;

        System.out.println("Enter unit consumed : ");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Units cannot be negative.");
            return;
        }

        if(Units <= 100)
        {
            Amount = Units * 5;
        }
        else if(Units > 100 && Units <= 200)               // (unit <= 200)
        {
            Amount = (100 * 5) + ((Units - 100) * 7);      // 500 + ((Units - 100) * 7)
        }
        else if(Units > 200)                                // else
        {
            Amount = (100 * 5) + (100 * 7) + ((Units - 200) * 10);      // 1200 + ((Units - 200) * 10)
        }

        System.out.println("Total Units Consumed : " + Units);
        System.out.println("Total Electricity Bill : " + Amount);

        sobj.close();
    }
}