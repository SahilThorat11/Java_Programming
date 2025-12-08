import java.util.Scanner;

class Arithematic
{
    void CheckLeapYear(int Year)
    {
        if(Year % 4 == 0)
        {
            System.out.println("It is a Leap Year...");
        }
        else
        {
            System.out.println("It is not an Leap Year...");
        }
    }
}

class program5_3
{
    public static void main(String A[])
    {
        int yr = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Year : ");
        yr = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.CheckLeapYear(yr);
    }
}