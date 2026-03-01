import java.util.*;

class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int Score = 0;
        String Loan = null;

        System.out.println("Enter your Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter your Monthly Income : ");
        Income = sobj.nextInt();

        System.out.println("Enter your Credit Score : ");
        Score = sobj.nextInt();

        System.out.println("Enter any Existing unpaid loan : [YES / NO]");
        Loan = sobj.next();

        if(
          ((Age < 0) || (Income < 0) || (Score < 0)) ||
          (Loan.equalsIgnoreCase("YES") == false) &&
          (Loan.equalsIgnoreCase("NO") == false)
          )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if((Age < 21) || (Age > 60))
        {
            System.out.println("Loan Rejected : Your age is not valid.");
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected : Your monthly income is below 25000");
        }
        else if(Score < 700)
        {
            System.out.println("Loan Rejected : Your credit score is low.");
        }
        else if((Loan.equalsIgnoreCase("YES")))
        {
            System.out.println("Loan Rejected : You must not have any unpaid loan.");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}