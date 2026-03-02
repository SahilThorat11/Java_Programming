import java.util.Scanner;

class Program04
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int Number_of_items = 0;
        int iCnt = 0;
        int iCount = 0;
        int Remaining = 0;
        int Prices[]; 


        System.out.println("Enter Budget : ");
        Budget = sobj.nextInt();

        System.out.println("Enter Number of items : ");
        Number_of_items = sobj.nextInt();

        if(Budget < 0 || Number_of_items < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        Prices = new int[Number_of_items];

        System.out.println("Enter prices of items:");
        for (iCnt = 0; iCnt < Number_of_items; iCnt++) 
        {
            Prices[iCnt] = sobj.nextInt();

            if(Prices[iCnt] < 0)
            {
                System.out.println("Invalid Input.");
                return;
            }
        }

        Remaining = Budget;

        for (iCnt = 0; iCnt < Number_of_items; iCnt++) 
        {
            if (Remaining >= Prices[iCnt]) 
            {
                Remaining = Remaining - Prices[iCnt];
                iCount++;
            } 
            else 
            {
                break;
            }
        }

        System.out.println("Items Purchased: " + iCount);
        System.out.println("Remaining Balance: " + Remaining);

        sobj.close();
    }
}
