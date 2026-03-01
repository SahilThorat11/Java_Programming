import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalHours = 0;
        int ParkingFees = 0;

        System.out.println("Enter total parking hours : ");
        TotalHours = sobj.nextInt();

        if(TotalHours < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(TotalHours <= 2)
        {
            ParkingFees = 20;
        }
        else if((TotalHours > 2) && (TotalHours <= 10))
        {
            ParkingFees = 20 + (TotalHours - 2) * 10;
        }
        else if(TotalHours > 10)
        {
            ParkingFees = 20 + 80 + ((TotalHours - 10) * 50);
        }

        System.out.println("Total Parking Duration : " + TotalHours);
        System.out.println("Total Parking fees : " + ParkingFees);

        sobj.close();
    }
}