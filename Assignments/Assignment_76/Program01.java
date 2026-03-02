import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int KM = 0;
        int Amount = 0;
        int PeakAmount = 0;
        String Hour = null;

        System.out.println("Enter the Kilometer : ");
        KM = sobj.nextInt();

        System.out.println("Is there peak hour : [YES / NO]");
        Hour = sobj.next();

        if(KM < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(KM <= 10)
        {
            Amount = KM * 12;
        }
        else if(KM > 10)
        {
            Amount = 120 + (KM - 10) * 15;
        }

        if((Hour.equalsIgnoreCase("YES")))
        {
            PeakAmount = (Amount * 20) / 100;
            Amount = Amount + PeakAmount;
        }

        System.out.println("Distance : " + KM + " km");
        System.out.println("Peak Hour : " + Hour);
        System.out.println("Total Fare : " + Amount + " Rs");

        sobj.close();
    }
}