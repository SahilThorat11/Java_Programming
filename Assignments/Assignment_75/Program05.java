import java.util.*;

class Program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        float Tax = 0.0f;

        System.out.println("Enter Annual Income : ");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0.0f;
        }
        else if(Income <= 500000)
        {
            Tax = (Income - 250000) * 0.05f;
        }
        else if(Income <= 1000000)
        {
            Tax = (250000 * 0.05f) + (Income - 500000) * 0.20f;
        }
        else
        {
            Tax = (250000 * 0.05f) + (500000 * 0.20f) + (Income - 1000000) * 0.30f;
        }

        System.out.println("Annual Income : " + Income);
        System.out.println("Total Tax Payable : " + Tax);

        sobj.close();
    }
}
