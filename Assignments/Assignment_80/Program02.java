import java.util.*;

class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of square matrix : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][N];

        int i = 0, j = 0;

        System.out.println("Enter matrix elements : ");

        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Matrix is : ");

        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

        int RowSum = 0;
        int ColSum = 0;
        int Diag1 = 0;
        int Diag2 = 0;
        int Sum = 0;

        boolean Magic = true;

        for(j = 0; j < N; j++)
        {
            RowSum = RowSum + Arr[0][j];
        }

        for(i = 0; i < N; i++)
        {
            Sum = 0;

            for(j = 0; j < N; j++)
            {
                Sum = Sum + Arr[i][j];
            }

            if(Sum != RowSum)
            {
                Magic = false;
                break;
            }
        }

        for(j = 0; j < N && Magic == true; j++)
        {
            ColSum = 0;

            for(i = 0; i < N; i++)
            {
                ColSum = ColSum + Arr[i][j];
            }

            if(ColSum != RowSum)
            {
                Magic = false;
                break;
            }
        }

        if(Magic == true)
        {
            for(i = 0; i < N; i++)
            {
                Diag1 = Diag1 + Arr[i][i];
                Diag2 = Diag2 + Arr[i][N - 1 - i];
            }

            if(Diag1 != RowSum || Diag2 != RowSum)
            {
                Magic = false;
            }
        }

        if(Magic == true)
        {
            System.out.println("Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");
        }

        sobj.close();
    }
}
