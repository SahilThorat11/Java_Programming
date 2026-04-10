import java.util.*;

class Solution
{
    public int[] slidingWindowMaximum(int nums[], int iSize)
    {
        if (nums == null || nums.length == 0 || iSize <= 0) return new int[0];

        int iNo = nums.length;
        int result[] = new int[iNo - iSize + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        int left = 0;
        int ret = 0;

        for (int right = 0; right < iNo; right++)
        {
            // Remove elements outside the window
            while (!deque.isEmpty() && deque.peekFirst() < left)
            {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right])
            {
                deque.pollLast();
            }

            deque.offerLast(right);

            // Window is fully formed
            if (right >= iSize - 1)
            {
                result[ret] = nums[deque.peekFirst()];
                ret++;
                left++;
            }
        }

        return result;
    }
}

public class Program06
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int iNo = sobj.nextInt();

        int nums[] = new int[iNo];

        System.out.print("Enter elements: ");
        for (int i = 0; i < iNo; i++)
        {
            nums[i] = sobj.nextInt();
        }

        System.out.print("Enter window size : ");
        int iSize = sobj.nextInt();

        Solution slobj = new Solution();
        int result[] = slobj.slidingWindowMaximum(nums, iSize);

        System.out.print("Sliding window maximums: ");
        for(int val : result)
        {
            System.out.print(val + " ");
        }

        System.out.println();
        sobj.close();
    }
}

/* 
------------------------------ How It Works------------------------------

nums = [1, 3, -1, -3, 5, 3, 6, 7]   iSize = 3

Deque stores indices, front always has the max

Window [1,  3, -1] → max = 3
Window [3, -1, -3] → max = 3
Window [-1, -3,  5] → max = 5
Window [-3,  5,  3] → max = 5
Window [5,   3,  6] → max = 6
Window [3,   6,  7] → max = 7

Output → [3, 3, 5, 5, 6, 7]

-------------------------------------------------------------------------
*/