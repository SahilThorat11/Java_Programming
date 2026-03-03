import java.util.Scanner;

class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Minutes;
        int Charge = 0;

        System.out.println("Enter call duration in minutes:");
        Minutes = sobj.nextInt();

        if(Minutes < 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Minutes <= 5)
        {
            Charge = 0;
        }
        else if(Minutes <= 15)
        {
            Charge = (Minutes - 5) * 1;
        }
        else
        {
            Charge = 10 + ((Minutes - 15) * 2);
        }

        System.out.println("Call Duration: " + Minutes + " minutes");
        System.out.println("Total Call Charge: " + Charge);

        sobj.close();
    }
}
