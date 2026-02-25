import java.util.*;

class Program07
{
    public static void main(String A[])
    {
        PriorityQueue<String> pq = new PriorityQueue<> ();

        pq.add("Marvellous");
        pq.add("PPA");
        pq.add("LB");

        System.out.println("Peek : " + pq.peek());
        System.out.println("Poll : " + pq.poll());
        System.out.println("After Poll : "+ pq);
    }
}