class Printing
{
    static int iCnt = 1;  

    public static void Display() 
    {
        if (iCnt <= 5) 
        {
            System.out.print(iCnt + "\t");
            iCnt++;
            Display();  
        }
    }

}

class Program_02
{
    public static void main(String[] args) 
    {
        Printing pobj = new Printing();
        pobj.Display();
    }
}
