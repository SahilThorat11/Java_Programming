import java.util.*;

class Program11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Citys : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Arr[][] = new int[N][7];
        int i = 0, j = 0, No = 0;    

        System.out.println("Enter the electricity consumption of each city : ");

        for(i = 0; i < N; i++)
        {
            System.out.println("Enter consumption of city : " + (i + 1));
            for(j = 0; j < 7; j++)
            {
                No = sobj.nextInt();
                if(No < 0)
                {
                    System.out.println("Invalid Input.");
                    return;
                }

                Arr[i][j] = No;
            }
        }

        int Weekly[] = new int[7];
        int Highest_City = 0;
        int Max_Weekly = 0;
        int Peek_Day = 0;
        int Max_Day_Total = 0;
        int Sum = 0;

        // Weekly total + highest consumption
        for(i = 0; i < N; i++)
        {
            Sum = 0;
            for(j = 0; j < 7; j++)
            {
                Sum = Sum + Arr[i][j];
            }

            Weekly[i] = Sum;

            if(Sum > Max_Weekly)
            {
                Max_Weekly = Sum;
                Highest_City = i;
            }
        }

        System.out.println("Highest Consumption : City " + Highest_City);
        System.out.println("Highest consumption : " + Max_Weekly);

        sobj.close();
    }
}