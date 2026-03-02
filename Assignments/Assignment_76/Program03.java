import java.util.*;

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Charges = 0;

        System.out.println("Enter Weight : ");
        Weight = sobj.nextInt();
        
        if(Weight < 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Weight <= 1)
        {
            Charges = 50;
        }
        else if(Weight > 1 && Weight <= 5)
        {
            Charges = 50 + (Weight - 1) * 20;
        }
        else if(Weight > 5)
        {
            Charges = 150 + (Weight - 5) * 30;
        }

        System.out.println("Parcel weight : " + Weight + " kg");
        System.out.println("Courier Charge : " + Charges + " rs");
    }
}