// Detect a cycle in a linked list (Floyd's algorithm)
class Node
{
    public int data;
    public Node next;

    public Node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private Node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);
        Node temp = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        this.iCount++;
    }

    public void Display()
    {
        Node temp = this.first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public int Count()
    {
        return this.iCount;
    }

    // Floyd Cycle Detection
    public boolean hasCycle()
    {
        Node slow = this.first;
        Node fast = this.first;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 step

            if(slow == fast)
            {
                return true;           // cycle detected
            }
        }

        return false;                  // no cycle
    }

    // Helper to create cycle (for testing)
    public void CreateCycle(int pos)
    {
        if(pos < 1 || pos > this.iCount)
        {
            return;
        }

        Node temp = this.first;
        Node target = null;
        int i = 1;

        while(temp.next != null)
        {
            if(i == pos)
            {
                target = temp;
            }
            temp = temp.next;
            i++;
        }

        temp.next = target;   // last Node points to given position
    }
}

class Program04
{
    public static void main(String A[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertLast(11);
        obj.InsertLast(21);
        obj.InsertLast(51);
        obj.InsertLast(101);

        obj.Display();

        // Check without cycle
        boolean bRet = obj.hasCycle();
        System.out.println("Cycle present : " + bRet);

        // Create cycle at position 2
        obj.CreateCycle(2);

        // Check again
        bRet = obj.hasCycle();
        System.out.println("Cycle present : " + bRet);
    }
}