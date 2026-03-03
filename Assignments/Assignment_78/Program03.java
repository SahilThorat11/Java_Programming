import java.util.Scanner;

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Steps[] = new int[7];
        int Goal = 10000; 
        int Goal_Count = 0;
        int Max_Steps = 0;
        int i = 0;

        System.out.println("Enter steps for 7 days:");

        for(i = 0; i < 7; i++)
        {
            Steps[i] = sobj.nextInt();

            if(Steps[i] < 0)
            {
                System.out.println("Invalid input.");
                return;
            }

            if(Steps[i] >= Goal)
            {
                Goal_Count++;
            }

            if(Steps[i] > Max_Steps)
            {
                Max_Steps = Steps[i];
            }
        }

        System.out.println("Goal Achieved Days: " + Goal_Count);
        System.out.println("Maximum Steps in Week: " + Max_Steps);

        sobj.close();
    }
}
