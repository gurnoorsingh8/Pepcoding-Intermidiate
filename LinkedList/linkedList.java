public class LinkedList
{
    private class Node
    {
        int data = 0;
        Node next = null;

        Node(int data)
        {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int sizeOfLL = 0;

    public boolean isEmpty()
    {
        return this.sizeOfLL == 0;
    }

    public int size()
    {
        return this.sizeOfLL;
    }

    //Exceptions-----------------------------------------------------------------------------------

    private void EmptyException() throws Exception
    {
        if(this.sizeOfLL == 0)
        {
            throw new Exception("LinkedList is Empty: -1");
        }
    }

    private void IndexOutOfBoundSizeExclusiveException(int idx) throws Exception
    {
        if(idx < 0 || idx >= this.sizeOfLL)
        {
            throw new Exception("Index Out of Bound: -1");
        }
    }

    private void IndexOutOfBoundSizeInclusiveException(int idx) throws Exception
    {
        if(idx < 0 || idx > this.sizeOfLL)
        {
            throw new Exception("Index Out of Bound: -1");
        }
    }

    //Get------------------------------------------------------------------------------------------

    public int getFirst() throws Exception
    {
        EmptyException();
        return this.head.data;
    }

    public int getLast() throws Exception
    {
        EmptyException();
        return this.tail.data;
    }

    private Node getNodeAt(int idx)
    {
        Node curr = this.head;

        while(idx--> 0)
        {
            curr = curr.next;
        }

        return curr;
    }

    public int getAt(int idx) throws Exception
    {
        IndexOutOfBoundSizeExclusiveException();
        Node node = getNodeAt(idx);
        return node.data;
    }

    //Add------------------------------------------------------------------------------------------

    private void addFirstNode(Node node)
    {
        if(this.head == null)
        {
            this.head = node;
            this.tail = node;
        }
        else
        {
            node.next = this.head;
            this.head = node;
        }
        this.sizeOfLL++;
    }

    public void addFirst(int data)
    {
        Node node = new Node(data);
        addFirstNode(node);
    }

    private void addLastNode(Node node)
    {
        if(this.head == null)
        {
            this.head = node;
            this.tail = node;
        }
        else
        {
            this.tail.next = node;
            node.next = null;
            node = this.tail;
        }
        sizeOfLL++;
    }

    public void addLast(int data)
    {
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addNodeAt(int idx, Node node)
    {
        if(idx == 0)
        {
            addFirstNode(node);
        }
        else if(idx == this.sizeOfLL)
        {
            addLastNode(node);
        }
        else
        {
            Node prev = getNodeAt(idx - 1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;

            this.sizeOfLL++;
        }
    }

    public void addAt(int idx, int data) throws Exception
    {
        IndexOutOfBoundSizeInclusiveException();
        Node node = new Node(data);
        addNodeAt(idx, node);
    }

    //Remove----------------------------------------------------------------------------------------

    private Node removeFirstNode()
    {
        Node remove = this.head;
        if(this.sizeOfLL == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            Node forw = this.head.next;
            remove.next = null;
            this.head = forw;
        }
        this.sizeOfLL--;
        return remove;
    }

    public int removeFirst() throws Exception
    {
        EmptyException();
        Node node = removeFirstNode();
        return node.data;
    }

    private Node removeLastNode()
    {
        Node remove = this.tail;
        if(this.sizeOfLL == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            Node prev = getNodeAt(sizeOfLL - 2);
            this.tail = prev;
            this.tail.next = null;
        }
        sizeOfLL--;
        return remove;
    }

    public int removeLast() throws Exception
    {
        EmptyException();
        Node node = removeLastNode();
        return node.data;
    }

    private Node removeNodeAt(int idx)
    {
        if(idx = 0)
        {
            removeFirstNode();
        }
        else if(idx == sizeOfLL - 1)
        {
            removeLastNode();
        }
        else
        {
            Node prev = getNodeAt(idx - 1);
            Node curr = prev.next;            
            Node forw = curr.next;

            prev.next = forw;
            curr.next = null;

            this.sizeOfLL--;
            return curr;
        }
    }

    public int removeAt(int idx) throws Exception
    {
        EmptyException();
        IndexOutOfBoundSizeExclusiveException();
        Node node = removeNodeAt(idx);
        return node.data;
    }
}