import java.util.*;

class Program01
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        float Medicine_Bill = 0;
        float Consultation_Fee = 0;
        float Total_Bill = 0;
        float Room_Charge_Per_Day = 0;
        float Final_Bill = 0;
        float Insurance_Cover = 0;

        String Ward_Type = null;
        String Insured = null;

      
        System.out.println("Enter number of Days : ");
        Days = sobj.nextInt();

        System.out.println("Enter Medicine Bill : ");
        Medicine_Bill = sobj.nextFloat();

        System.out.println("Enter Consultation Fee : ");
        Consultation_Fee = sobj.nextFloat();

        System.out.println("Enter Ward Type : [Regular / ICU]");
        Ward_Type = sobj.next();

        System.out.println("Insured or Not : [YES / NO]");
        Insured = sobj.next();

        if(
            (Days < 0) || 
            (Medicine_Bill < 0) || 
            (Consultation_Fee < 0) || 
            (Insured.equalsIgnoreCase("Yes") == false && Insured.equalsIgnoreCase("No") == false) ||
            ((Ward_Type.equalsIgnoreCase("Regular") == false ) && (Ward_Type.equalsIgnoreCase("ICU") == false ))
           )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Ward_Type.equalsIgnoreCase("ICU"))
        {
            Room_Charge_Per_Day = 5000;
        }
        else 
        {
            Room_Charge_Per_Day = 2000;
        }

        Total_Bill = (Room_Charge_Per_Day * Days) + Consultation_Fee + Medicine_Bill;

        Final_Bill = Total_Bill;

        if(Insured.equalsIgnoreCase("Yes"))
        {
            Insurance_Cover = (Total_Bill * 70) / 100;

            if(Insurance_Cover > 50000)
            {
                Insurance_Cover = 50000;
            }

            Final_Bill = Total_Bill - Insurance_Cover;
        }

        System.out.println("Total Bill : " + Total_Bill);
        System.out.println("Insurence cover : " + Insurance_Cover);
        System.out.println("Final Bill : " + Final_Bill);

        sobj.close();
    }
} 