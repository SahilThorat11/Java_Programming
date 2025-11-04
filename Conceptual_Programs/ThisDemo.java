class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside Default");
        this.i = 11;                          // First use
    }

    public Demo(int a)
    {
        this();
        System.out.println("Inside parametrised");
    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i);
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}