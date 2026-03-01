import java.util.*;

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Current_Stock = 0;
        int Requested_Quantity = 0;
        int Remaning_Stock = 0;

        System.out.println("Enter Available stock : ");
        Current_Stock = sobj.nextInt();

        System.out.println("Enter Requested quantity : ");
        Requested_Quantity = sobj.nextInt();

        if(Current_Stock < 0 || Requested_Quantity < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Requested_Quantity > Current_Stock)
        {
            System.out.println("Order failed : Insufficient Stock.");
        }
        else
        {
            Remaning_Stock = Current_Stock - Requested_Quantity;

            System.out.println("Order Processed SuccessFully.");
            System.out.println("Remaning Stock : " + Remaning_Stock);
        }

        if(Remaning_Stock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        sobj.close();
    }
}