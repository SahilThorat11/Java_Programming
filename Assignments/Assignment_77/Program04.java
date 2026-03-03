import java.util.*;

class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Weeks_Late = 0;

        double Bill_Amount = 0;
        double Meter_Charge = 50;
        double Penalty_Rate = 0;

        System.out.print("Enter water Units consumed: ");
        Units = sobj.nextInt();

        System.out.print("Enter weeks late: ");
        Weeks_Late = sobj.nextInt();

        if(Units < 0 || Weeks_Late < 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Units <= 50)
        {
            Bill_Amount = Units * 2;
        }
        else if(Units <= 100)
        {
            Bill_Amount = 50 * 2 + (Units - 50) * 3;
        }
        else
        {
            Bill_Amount = 50 * 2 + 50 * 3 + (Units - 100) * 5;
        }

        Bill_Amount = Bill_Amount + Meter_Charge;

        Penalty_Rate = 0.02 * Weeks_Late;

        if(Penalty_Rate > 0.10) 
        {
            Penalty_Rate = 0.10;
        }

        Bill_Amount = Bill_Amount + Bill_Amount * Penalty_Rate;
        

        System.out.printf("Bill Amount: " + Bill_Amount);

        sobj.close();
    }
}
