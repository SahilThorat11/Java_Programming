import java.util.Scanner;

class Program02
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Number_of_Voters = 0;
        int Valid_Count = 0;
        int Duplicate_Count = 0;
        int i = 0, j = 0;

        int Votes[];

        boolean Is_Duplicate = false;

        System.out.println("Enter nuber of voters : ");
        Number_of_Voters = sobj.nextInt();

        if(Number_of_Voters < 0) 
        {
            System.out.println("Invalid Input.");
            return;
        } 

        System.out.println("Enter voter IDs : ");
        Votes = new int[Number_of_Voters];

        for(i = 0; i < Number_of_Voters; i++) 
        {
            Is_Duplicate = false;

            Votes[i] = sobj.nextInt();

            if (Votes[i] < 0) 
            {
                System.out.println("Invalid Input.");
                return;
            } 

            for(j = 0; j < i; j++) 
            {
                if (Votes[i] == Votes[j]) 
                {
                    Is_Duplicate = true;
                    break;
                }
            }

            if (Is_Duplicate == true)
            {
                Duplicate_Count++;
            } 
            else 
            {
                Valid_Count++;
            }
        }

        System.out.println("Valid Votes: " + Valid_Count);
        System.out.println("Rejected Duplicate Votes: " + Duplicate_Count);

        sobj.close();
    }
}
