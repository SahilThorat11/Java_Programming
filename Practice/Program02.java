import java.util.*;

class Power
{
    // private fields
    private int base;
    private int exponent;

    // Constructor 
    public Power(int base, int exponent)
    {
        this.base = base;
        this.exponent = exponent;
    }

    public double calculate()
    {
        if(base == 0 && exponent == 0)
        {
            System.out.println("0^0 is undefined");
            return 0;
        }

        if(exponent < 0)
        {
            double result = 1.0;

            for (int i = 1; i <= -exponent; i++)
            {
                result = result * base;
            }

            return (1.0 / result);
        }

        int iPow = 1;
        for(int i = 1; i <= exponent; i++)
        {
            iPow = iPow * base;
        }

        return iPow;
    }

    // Display method
    public void display()
    {
        double result = calculate();

        if(result == (int) result)
        {
            System.out.println(base + " ^ " + exponent + " = " + (int) result);
        }
        else
        {
            System.out.println(base + " ^ " + exponent + " = " + result);
        }
    }
}

class Program02
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter base : ");
        int x = sobj.nextInt();

        System.out.print("Enter power : ");
        int y = sobj.nextInt();

        Power pobj = new Power(x, y);
        pobj.display();

        sobj.close();
    }
}