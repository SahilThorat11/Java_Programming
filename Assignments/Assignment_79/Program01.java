import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int M = 0;

        System.out.println("Enter number of students : ");
        N = sobj.nextInt();

        System.out.println("Enter number of subjects : ");
        M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Marks[][] = new int[N][M];

        int i = 0, j = 0;

        System.out.println("Enter marks of students : ");

        for(i = 0; i < N; i++)
        {
            System.out.println("Enter marks of Student : " + (i + 1));

            for(j = 0; j < M; j++)
            {
                Marks[i][j] = sobj.nextInt();

                if(Marks[i][j] < 0 || Marks[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int Total = 0;
        int Max_Total = 0;
        int Topper_Index = 0;
        int Subject_Sum = 0;
        boolean Fail = false;
        double Avg = 0.0;

        System.out.println("\nStudent Totals:");

        for(i = 0; i < N; i++)
        {
            Total = 0;

            for(j = 0; j < M; j++)
            {
                Total = Total + Marks[i][j];
            }

            System.out.println("Student " + (i + 1) + ": " + Total);

            if(Total > Max_Total)
            {
                Max_Total = Total;
                Topper_Index = i;
            }
        }

        System.out.println("\nTopper: Student " + (Topper_Index + 1));

        System.out.println("\nSubject Averages:");

        for(j = 0; j < M; j++)
        {
            Subject_Sum = 0;

            for(i = 0; i < N; i++)
            {
                Subject_Sum = Subject_Sum + Marks[i][j];
            }

            Avg = (double)Subject_Sum / N;

            System.out.printf("Subject " + (j + 1) + " : "+ Avg + "\n");
        }

        System.out.println("\nStudents Failed:");

        for(i = 0; i < N; i++)
        {
            Fail = false;

            for(j = 0; j < M; j++)
            {
                if(Marks[i][j] < 35)
                {
                    Fail = true;
                    break;
                }
            }

            if(Fail == true)
            {
                System.out.println("Student " + (i + 1));
            }
        }

        sobj.close();
    }
}
