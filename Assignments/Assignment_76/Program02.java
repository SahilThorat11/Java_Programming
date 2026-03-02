import java.util.*;

class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int FamilyIncome = 0;

        System.out.println("Enter Marks : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        FamilyIncome = sobj.nextInt();
        
        if(
            (Marks < 0 || Marks > 100) ||
            (Attendance < 0 || Attendance > 100) ||
            (FamilyIncome < 0)
        )
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholrship Rejected : Marks are below 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholrship Rejected : Attendance is below 75%");
        }
        else if(FamilyIncome > 300000)
        {
            System.out.println("Scholrship Rejected : Family income are above 300000.");
        }
        else
        {
            System.out.println("Scholarship Approved.");
        }
    }
}