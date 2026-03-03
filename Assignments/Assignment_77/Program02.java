import java.util.*;

class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        int Age = 0;
        int Booking_Hours_Before = 0;
        int Fare = 0;
        int Final_Fare = 0;

        String Class_Type = null;

        System.out.println("Enter distance to travel : ");
        Distance = sobj.nextInt();

        System.out.println("Enter your age : ");
        Age = sobj.nextInt();

        System.out.println("Enter booking hours before : ");
        Booking_Hours_Before = sobj.nextInt();

        System.out.println("Enter the class : [Sleeper/3AC/2AC]");
        Class_Type = sobj.next();

        if(Class_Type.equalsIgnoreCase("Sleeper"))
        {
            Fare = 10 * Distance;
        }
        else if(Class_Type.equalsIgnoreCase("3AC"))
        {
            Fare = 20 * Distance;
        }
        else if(Class_Type.equalsIgnoreCase("2AC"))
        {
            Fare = 50 * Distance;
        }

        Final_Fare = Fare;

        if(Booking_Hours_Before <= 24)
        {
            Final_Fare = Final_Fare + (Final_Fare * 30) / 100;
            System.out.println("30 % extra for Tatkal booking");
        }

        if(Age >= 65)
        {
            Final_Fare = Final_Fare - (Final_Fare * 40) / 100;
            System.out.println("40 % discount for Senior citizen");
        }

        System.out.println("Fare : " + Fare);
        System.out.println("Final Fare : " + Final_Fare);

        sobj.close();
    }
}