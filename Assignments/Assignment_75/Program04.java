import java.util.*;

class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String No_Helmet = null;
        String No_Licence = null;
        String Overspeeding = null;

        int Fine = 0;

        System.out.println("Helmet worn : [YES / NO]");
        No_Helmet = sobj.next();
        
        System.out.println("License available : [YES / NO]");
        No_Licence = sobj.next();
        
        System.out.println("Overspeeding : [YES / NO]");
        Overspeeding = sobj.next();

        if(
            ((No_Helmet.equalsIgnoreCase("YES") == false) && (No_Helmet.equalsIgnoreCase("NO") == false)) ||
            ((No_Licence.equalsIgnoreCase("YES") == false) && (No_Licence.equalsIgnoreCase("NO") == false)) ||
            ((Overspeeding.equalsIgnoreCase("YES") == false) && (Overspeeding.equalsIgnoreCase("NO") == false))
          )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(No_Helmet.equalsIgnoreCase("NO"))
        {
            Fine = 500;
        }

        if(No_Licence.equalsIgnoreCase("NO"))
        {
            Fine = Fine + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("YES"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : " + Fine);

        sobj.close();
    }
}