import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row : "+(i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void ReverseCol()
    {
        int i = 0, j = 0, temp = 0;

        for(j = 0; j < iCol; j++)          
        {
            for(i = 0; i < iRow / 2; i++)  
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[iRow - 1 - i][j];
                Arr[iRow - 1 - i][j] = temp;
            }
        }
    }
}

class Program_03
{
    public static void main(String A[])
    {
        int iRow = 0, iCol = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        mobj.ReverseCol();

        System.out.println("Matrix after reversing Columns : ");
        mobj.Display();

        sobj.close();
    }
}