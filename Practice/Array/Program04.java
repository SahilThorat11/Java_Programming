import java.util.HashMap;

class ArrayDemo
{
    public int[] TwoSum(int Arr[], int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < Arr.length; i++)
        {
            int temp = target - Arr[i];

            if(map.containsKey(temp))
            {
                return new int[]{map.get(temp), i};
            }

            map.put(Arr[i], i);
        }

        return new int[]{};
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

class Program04
{
    public static void main(String A[])
    {
        ArrayDemo aobj = new ArrayDemo();

        int Arr[] = {2, 7, 11, 15};
        int iSum = 9;

        int Brr[] = aobj.TwoSum(Arr, iSum);

        if(Brr.length == 2)
        {
            System.out.println("Indexs are : " + Brr[0] + " and " + Brr[1]);
        }
        else
        {
            System.out.println("No pair found");
        }
    }
}

/*
-----------------------------------------------------------------

Problem :   Find a pair in array with given sum (Two Sum)

Output  : 
            Indexs are : 0 and 1

-----------------------------------------------------------------

*/