// 0    1   1   2   3   5   8   13  21
// Using Dynamic Programmig with memorization
import java.util.*;

class Program09
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements in series : ");
        int Size = sobj.nextInt();

        long dp[] = new long[Size]; 

        dp[0] = 0;
        dp[1] = 1;

        System.out.print(dp[0] + "\t");
        System.out.print(dp[1] + "\t");

        int i = 0;

        for(i = 2; i <= Size; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.print(dp[i] + "\t");
        }

        System.out.println();

        sobj.close();
    }
}