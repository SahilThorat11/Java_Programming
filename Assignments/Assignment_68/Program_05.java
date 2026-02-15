class Printing
{
    static int iCnt = 0;  
    static char ch = 'a';  

    public static void Display() 
    {
        if (iCnt < 6) 
        {
            System.out.print(ch + "\t");
            ch++;
            iCnt++;
            Display();  
        }
    }

}

class Program_05
{
    public static void main(String[] args) 
    {
        Printing pobj = new Printing();
        pobj.Display();
    }
}
