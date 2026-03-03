import java.util.*;

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Mins = 0;
        double GB = 0;
        int SMS =  0;

        System.out.print("Calls (minutes): ");
        Mins = sobj.nextInt();

        System.out.print("Data (GB): ");
        GB = sobj.nextDouble();

        System.out.print("SMS (count): ");
        SMS = sobj.nextInt();

        if(Mins < 0 || GB < 0 || SMS < 0) 
        {
            System.out.println("Invalid input.");
            return;
        }

        double Plan_A = Mins * 1 + GB * 10 + SMS * 2;
        double Plan_B = Mins * 0.8 + GB * 15 + SMS * 1.5;
        double Plan_C = Mins * 1.2 + GB * 8 + SMS * 2.5;
        double Plan_D = Mins * 1 + GB * 12 + SMS * 1;

        double minCost = Plan_A;
        String recommendedPlan = "A";

        if(Plan_B < minCost) 
        { 
            minCost = Plan_B; 
            recommendedPlan = "B"; 
        }

        if(Plan_C < minCost) 
        {
            minCost = Plan_C; 
            recommendedPlan = "C";
        }

        if(Plan_D < minCost) 
        { 
            minCost = Plan_D; 
            recommendedPlan = "D"; 
        }

        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Total Cost: " + minCost);

        sobj.close();
    }
}