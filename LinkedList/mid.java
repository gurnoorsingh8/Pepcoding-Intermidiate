public class mid
{
    public class Node
    {
        int data;
        Node next;
    }

    Node head = null;
    Node tail = null;

    public int mid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }
}