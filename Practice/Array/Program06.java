class ArrayDemo
{
    public void MoveZeros(int Arr[])
    {
        int iPos = 0;

        // Step 1: Move non-zero elements forward
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != 0)
            {
                Arr[iPos] = Arr[i];
                iPos++;
            }
        }

        // Step 2: Fill remaining positions with zero
        while(iPos < Arr.length)
        {
            Arr[iPos] = 0;
            iPos++;
        }
    }

    public void Display(int Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

class Program06
{
    public static void main(String A[])
    {
        ArrayDemo aobj = new ArrayDemo();

        int Arr[] = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        aobj.Display(Arr);

        aobj.MoveZeros(Arr);

        System.out.println("After moving zeros:");
        aobj.Display(Arr);
    }
}

/*
--------------------------------------------------------------------------------------------------------------------
Problem :
    Move all zeros in the array to the end while maintaining the relative order of non-zero elements.

Output : 
        Original array:
        0 1 0 3 12 
        After moving zeros:
        1 3 12 0 0 

Complexity :
        Time :  O(n)
        Space : O(1)
--------------------------------------------------------------------------------------------------------------------
*/