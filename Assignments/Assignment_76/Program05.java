import java.util.*;

class Program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery_Per = 0;

        System.out.println("Enter Battery Percentage : ");
        Battery_Per = sobj.nextInt();
        
        if(Battery_Per < 0 || Battery_Per > 100)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Battery_Per <= 5)
        {
            System.out.println("Battery Percantage : " + Battery_Per + " %");
            System.out.println("Status : Critical");
        }
        else if(Battery_Per > 5 && Battery_Per <= 15)
        {
            System.out.println("Battery Percantage : " + Battery_Per + " %");
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Battery Percantage : " + Battery_Per + " %");
            System.out.println("Status : Normal");
        }
    }
}