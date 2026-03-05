import java.util.*;

class Program15
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows in theatre : ");
        int R = sobj.nextInt();

        System.out.println("Enter the number of column in theatre : ");
        int C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Seats[][] = new int[R][C];

        System.out.println("Enter Booking details : [0 / 1]");

        int i = 0, j = 0;

        for(i = 0; i < R; i++)
        {
            System.out.println("Enter details of Row : " + (i + 1));

            for(j = 0; j < C; j++)
            {
                Seats[i][j] = sobj.nextInt();

                if((Seats[i][j] != 0) && (Seats[i][j] != 1))
                {
                    System.out.println("Invalid Input.");
                    return;
                }
            }
        }

        int Total_Booked = 0;
        int Max_Booked_in_Row = 0;
        int Row_With_Max = 0;
        int Row_Booked = 0;
        boolean Full_Row_Exist = false;

        for(i = 0; i < R; i++)
        {
            Row_Booked = 0;
            for(j = 0; j < C; j++)
            {
                if(Seats[i][j] == 1)
                {
                    Total_Booked++;
                }

                Row_Booked = Row_Booked + Seats[i][j];
            }

            if(Row_Booked > Max_Booked_in_Row)
            {
                Max_Booked_in_Row = Row_Booked;
                Row_With_Max = i;
            }

            if(Row_Booked == C)
            {
                Full_Row_Exist = true;
            }
        }

        System.out.println("Total Booked Seats : " + Total_Booked);
        System.out.println("Row with Maximum booking : " + Row_With_Max + 1);

        if(Full_Row_Exist == true)
        {
            System.out.println("Full Row exist : YES");
        }
        else 
        {
            System.out.println("Full Row exist : NO");
        }

        sobj.close();
    }
}
