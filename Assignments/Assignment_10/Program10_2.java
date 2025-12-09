import java.util.Scanner;

class Arithmetic
{
    double CircleArea(float fWidth, float fHeight)
    {
        double Area = 0.0;

        Area = fWidth * fHeight;

        return Area;
    }
}

class Program10_2
{
    public static void main(String A[])
    {
        float fValue1 = 0.0f, fValue2 = 0.0f;
        double dRet = 0.0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the width : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter the height : ");
        fValue2 = sobj.nextFloat();

        Arithmetic aobj = new Arithmetic();

        dRet = aobj.CircleArea(fValue1, fValue2);

        System.out.println("Area of rectangle is : " + dRet);

    }
}