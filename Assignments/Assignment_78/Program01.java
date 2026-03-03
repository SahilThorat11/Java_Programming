import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Days_Stayed = 0;
        int Bill_Amount = 0;
        int Final_Amount = 0;

        System.out.println("Enter number of days : ");
        Days_Stayed = sobj.nextInt();

        if(Days_Stayed < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        Bill_Amount = Days_Stayed * 3000;
        Final_Amount = Bill_Amount;

        if(Days_Stayed > 7)
        {
            Final_Amount = Bill_Amount - (Bill_Amount * 5) / 100;
        }

        System.out.println("Total Stay Duration : " + Days_Stayed);
        System.out.println("Bill Amount : "+ Bill_Amount);
        System.out.println("Final bill Amount : " + Final_Amount);

        sobj.close();
    }
}