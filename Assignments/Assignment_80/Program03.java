import java.util.*;

class Program03
{
    public static boolean CheckPath(int Arr[][], int i, int j, int R, int C)
    {
        if(i >= R || j >= C)
        {
            return false;
        }

        if(Arr[i][j] == -1)
        {
            return false;
        }

        if(i == R-1 && j == C-1)
        {
            return true;
        }

        if(CheckPath(Arr, i, j+1, R, C))
        {
            return true;
        }

        if(CheckPath(Arr, i+1, j, R, C))
        {
            return true;
        }

        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int C = sobj.nextInt();

        System.out.println("Enter elements [0 / -1] : ");

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[R][C];

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] != 0 && Arr[i][j] != -1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        boolean Result = CheckPath(Arr,0,0,R,C);

        if(Result == true)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("No Path Found");
        }

        sobj.close();
    }
}
